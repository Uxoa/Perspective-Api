import { Component, OnInit } from '@angular/core';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'toxicAdvicer';
  commentText = 'Your comment goes here';
  analysisResult: any;

  constructor(private dataService: DataService) { }

  ngOnInit() { }

  analyzeComment() {
    this.analysisResult = null; // reset the result at first
    this.dataService.analyzeToxicity(this.commentText)
      .subscribe({
        next: (response) => {
          console.log('Analysis Result:', response);

          // process the response object to make it friendlier
          const toxicityValue = response.attributeScores.TOXICITY.summaryScore.value;

          // convert toxicity to scale 1-100
          const toxicityScaled = (toxicityValue * 100).toFixed(0);

          let aggressionLevel = '';
          if (toxicityValue >= 0.9) {
            aggressionLevel = 'Muy agresivo';
          } else if (toxicityValue >= 0.7) {
            aggressionLevel = 'Agresivo';
          } else if (toxicityValue >= 0.4) {
            aggressionLevel = 'Poco agresivo';
          } else {
            aggressionLevel = 'No agresivo';
          }

          const processedResult = {
            toxicity: toxicityScaled,
            detectedLanguage: response.detectedLanguages[0],
            aggressionLevel: aggressionLevel
          };

          // save stringified JSON to display in template
          this.analysisResult = JSON.stringify(processedResult, null, 2);
        },
        error: (error) => {
          console.error('Failed to analyze toxicity:', error);
        }
      });
  }
}

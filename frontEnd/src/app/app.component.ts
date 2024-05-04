import { Component, OnInit } from '@angular/core';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Your App Title Here';
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
          // save stringified JSON to display in template
          this.analysisResult = JSON.stringify(response, null, 2);
        },
        error: (error) => {
          console.error('Failed to analyze toxicity:', error);
        }
      });
  }
}

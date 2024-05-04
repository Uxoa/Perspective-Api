import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  private API_URL = 'https://commentanalyzer.googleapis.com';

  constructor(private httpClient: HttpClient) { }

  analyzeToxicity(commentText: string): Observable<any> {
    const url = `${this.API_URL}/v1alpha1/comments:analyze?key=AIzaSyAoVLjhaHXz0PSffiq2G4zOuYvd2Ee2dgg`;

    const body = {
      comment: {
        text: commentText,
      },
      languages: ["es"],
      requestedAttributes: {
        TOXICITY: {}
      }
    };

    return this.httpClient.post(url, body);
  }


}

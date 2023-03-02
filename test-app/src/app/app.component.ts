import { Component } from '@angular/core';
import axios from "axios";
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private http:HttpClient) {
    const request1 = this.http.get('http://demo.dreamsquadgroup.com/test/index.json');
    request1.subscribe(results => {
      
      console.log(results);
    });
  }
  public async saveBookmarks() {
    alert('Open');
    
  }
  title = 'test-app';
}

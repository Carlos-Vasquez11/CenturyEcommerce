import {Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/Servicios/apiService';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit  {

  public publications: any[] = [];

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    this.apiService.getProducts().subscribe(data => {
      this.publications = data;
      console.log(this.publications.length);
  });
  }

}

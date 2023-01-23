import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/Servicios/apiService';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.css'],
})
export class ShopComponent implements OnInit {

  public publications: any[] = [];

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    this.apiService.getProducts().subscribe(data => {
      this.publications = data;
  });
  }

  getOptions(quantity: number) {
    const options = [];
    for (let i = 1; i <= quantity; i++) {
      options.push(i);
    }
    return options;
  }
}

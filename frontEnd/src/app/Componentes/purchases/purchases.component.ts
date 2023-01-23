import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/Servicios/apiService';

@Component({
  selector: 'app-purchases',
  templateUrl: './purchases.component.html',
  styleUrls: ['./purchases.component.css']
})
export class PurchasesComponent implements OnInit {
  purchases: any[] = [];

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    this.apiService.getPurchases(1).subscribe(data => {
      this.purchases = data;

      console.log(this.purchases.length);
  });
  }

  calculateTotal(purchase : any) {
    let total = 0;
    for (let item of purchase.items) {
      total += item.product.baseProduct.price * item.quantity;
    }
    return total;
  }
}

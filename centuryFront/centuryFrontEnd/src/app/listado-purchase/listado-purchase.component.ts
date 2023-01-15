import { Purchase, Item, Product } from './../interfaces/Publication';
import { Component, OnInit } from '@angular/core';
import { Publication } from '../interfaces/Publication';
import { ApiService } from '../servicios/product.service';

@Component({
  selector: 'app-listado-purchase',
  templateUrl: './listado-purchase.component.html',
  styleUrls: ['./listado-purchase.component.css']
})
export class ListadoPurchaseComponent implements OnInit {

  publications!: Publication[];
  purchases!: Purchase[];

  constructor(private productService: ApiService) {}

  ngOnInit() {
    this.getAllPurchases();
  }

  getAllPurchases() {
    this.productService.getAllPurchases().subscribe((purchases: any) => {
      this.purchases = purchases;
    });
  }

  calculateTotalPrice(item: Item, itemQuantity: number){
    let totalPrice = item.product.baseProduct.price;
    item.product.personalizations.forEach((personalization) => {
      totalPrice += personalization.price;
    });
    return totalPrice * itemQuantity;
  }

}

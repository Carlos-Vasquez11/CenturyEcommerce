import { Publication, Item, Product } from './../interfaces/Publication';
import { ChangeDetectionStrategy, Component, OnInit, OnChanges } from '@angular/core';
import { CartService } from '../servicios/cart.service';
import { ApiService } from '../servicios/product.service';
import { Observable, map } from 'rxjs';
import { HttpResponse } from '@angular/common/http';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css'],
  changeDetection: ChangeDetectionStrategy.Default
})
export class CartComponent implements OnInit{

  totalPrice :number;
  myPurchaseId!: number

  constructor(public cartService: CartService, private api: ApiService){
    const cart = this.cartService.getCart();
    this.totalPrice = cart.length > 0 ? this.cartService.getTotalPrice() : 0;
  }

  ngOnInit(): void {
    this.totalPrice = this.cartService.getTotalPrice();
    console.log("hola")

  }

  ngOnChanges() {
    this.totalPrice = this.cartService.getTotalPrice();
  }

  removeFromCart(publication :Publication){
    this.cartService.removeFromCart(publication)
    this.totalPrice = this.cartService.getTotalPrice();
  }

  calculateTotalPrice(publication: Item, itemQuantity: number){
    let totalPrice = publication.product.baseProduct.price;
    publication.product.personalizations.forEach((personalization) => {
      totalPrice += personalization.price;
    });
    return totalPrice * itemQuantity;
  }

  saveItem(quantity:number, purchaseId: number, productId: number){
    this.api.postItem(quantity, purchaseId, productId)
  }

  savePurchase(){
      this.api.savePurchase(1).subscribe(response => {
        let tempPurchaseId = response.id

      console.log(this.cartService.getCart().length);

      for(let i = 0; i < this.cartService.getCart().length; i++){
        console.log("i: "+ i)
        console.log("res:" + tempPurchaseId)
        console.log(this.cartService.getCartTyped()[i].quantity)
        this.saveItem(this.cartService.getCartTyped()[i].quantity, tempPurchaseId, this.cartService.getCartTyped()[i].publication.productId)
        this.api.updatePublicationQuantity(
          this.cartService.getCartTyped()[i].quantity,
          this.cartService.getCartTyped()[i].publication
          )
        //this.cartService.removeFromCart(this.cartService.getCartTyped()[i].publication)
      }

      //Vacio el carrito
      let cantElementos = this.cartService.getCart().length
      for(let i = 0; i < cantElementos; i++){
        this.cartService.removeFromCart(this.cartService.getCartTyped()[0].publication)
      }
    })
  }

}

import { Injectable } from '@angular/core';
import { Product, Publication } from '../interfaces/Publication';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private cart: {publication: Publication, quantity: number }[] = [];

  addToCart(publication: any, quantity: number): void {
    this.cart.push({ publication, quantity });
  }

  removeFromCart(publication: any): void {
    const index = this.cart.findIndex(item => item.publication === publication);
    if (index !== -1) {
      this.cart.splice(index, 1);
    }
  }

  removeFromCartByProduct(product: Product): void {
    const index = this.cart.findIndex(item => item.publication.product === product);
    if (index !== -1) {
      this.cart.splice(index, 1);
    } else {
      console.log("El producto no se encuentra en el carrito");
    }
  }

  setCart(nuevoCart: {publication: Publication, quantity: number }[]){
    this.cart = nuevoCart
  }

  getCart(): any[] {
    return this.cart;
  }

  getCartTyped(): {publication: Publication, quantity: number }[] {
    return this.cart;
  }

  getPersonalizationsPrice(publication: Publication): number{
    let total = 0
    publication.product.personalizations.forEach(aPersonalization => {
      total += aPersonalization.price
    })
    return total
  }

  getTotalPrice(): number {
    let total = 0;
    this.cart.forEach(item => {
      total += (item.publication.product.baseProduct.price + this.getPersonalizationsPrice(item.publication))* item.quantity;
    })
    return total;
  }

}

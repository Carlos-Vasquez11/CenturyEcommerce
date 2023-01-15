import { Component, OnInit } from '@angular/core';
import { ApiService } from '../servicios/product.service';
import { Publication } from '../interfaces/Publication';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';
import { HeaderComponent } from '../header/header.component';
import { CartService } from '../servicios/cart.service';

@Component({
  selector: 'app-listado-producto',
  templateUrl: './listado-producto.component.html',
  styleUrls: ['./listado-producto.component.css'],
})

export class ListadoProductoComponent implements OnInit {

  publications!: Publication[]; // Declara una variable para almacenar la lista de publicaciones

  constructor(private productService: ApiService, private route: ActivatedRoute, private cartService: CartService) { } // Inyecta el servicio de productos en el constructor

  ngOnInit(): void {

    let id = this.route.snapshot.params['id'];

    if (id === 'all') {
      this.getAllPublications();
    } else {
      this.productService.getProducts(id).subscribe((Publications: any) => {
        this.publications = Publications;
      });
    }
  }

  calculateTotalPrice(publication: Publication): number {
    let totalPrice = publication.product.baseProduct.price;
    publication.product.personalizations.forEach((personalization) => {
      totalPrice += personalization.price;
    });
    return totalPrice;
  }

  getOptions(quantity: number) {
    const options = [];
    for (let i = 1; i <= quantity; i++) {
      options.push(i);
    }
    return options;
  }

  getAllPublications() {
    this.productService.getAllProducts().subscribe((Publications: any) => {
      this.publications = Publications;
    });
  }

  addToCart(publication: any, quantity: number): void {
    this.cartService.addToCart(publication, quantity);
  }

  public onAddToCartClick(event: any, publication: any, quantitySelect: HTMLSelectElement) {
    // Evita que el formulario se envíe
    event.preventDefault();
    // Convierte el valor de "quantitySelect.value" a número
    const quantity = parseInt(quantitySelect.value, 10);
    // Llama a la función "addToCart" pasando el producto y la cantidad convertida
    this.addToCart(publication, quantity);

    console.log(this.cartService.getCart)
  }

}

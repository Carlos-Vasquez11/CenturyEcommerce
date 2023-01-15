import { Publication } from './../interfaces/Publication';
import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable, map, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  getProducts(id:number){ // Método que obtiene la lista de productos de la API
    return this.http.get('http://localhost:8080/netshop/publication/shop/' + id); //No Funciona
  }

  getAllProducts() {
    return this.http.get('http://localhost:8080/netshop/publication/shop/all');
  }

  getAllPurchases(){
    return this.http.get('http://localhost:8080/netshop/purchase/user/1');
  }

  savePurchase(userId: number): Observable<{ id: number }> {
    const body = { userId };
    return this.http.post<{ id: number }>('http://localhost:8080/netshop/purchase/save', body);
  }

  postItem(quantity: number, purchaseId: number, productId: number) {
    const body = { quantity, purchaseId, productId };
    return this.http.post('http://localhost:8080/netshop/item/save', body).subscribe(
      response => console.log('Solicitud POST (Item) enviada con éxito', response),
      error => console.log('Error al enviar la solicitud POST (Item): ', error)
    );
  }

  /*
  login(email: string, password: string): number {
    const body = { email, password };
    let body1 : number = 1
    this.http.post<HttpResponse<any>>('http://localhost:8080/netshop/login/getUserId', body);
    return body1
  }
  */

  login(email: string, password: string): Observable<{userId: number}>{
    const body = { email, password };
    return this.http.post<{userId: number}>('http://localhost:8080/netshop/login/getUserId', body);
  }

  login1(email: string, password: string): number{
    const body = { email, password };
    this.http.post<{userId: number}>('http://localhost:8080/netshop/login/getUserId', body).subscribe(response => {return response.userId});
    return 512
  }

  updatePublicationQuantity(purchaseQuantity: number, publication: Publication){
    console.log("Im in")
    const quantity = publication.quantity - purchaseQuantity
    console.log(quantity)
    const body = {quantity}
    return this.http.post('http://localhost:8080/netshop/publication/update/quantity/' + publication.id, body).subscribe(
      response => console.log('Solicitud POST (updateQuantity) enviada con éxito', response),
      error => console.log('Error al enviar la solicitud POST (updateQuantity): ', error)
    );
  }
}

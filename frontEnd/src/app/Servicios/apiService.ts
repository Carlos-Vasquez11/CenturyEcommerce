import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  getProducts(): Observable<any[]> {
    return this.http.get<any[]>('http://localhost:8080/netshop/publication/shop/active');
  }

  getPurchases(userId: number): Observable<any[]> {
    return this.http.get<any[]>(`http://localhost:8080/netshop/purchase/user/${userId}`);
}

}

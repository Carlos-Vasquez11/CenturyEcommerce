import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private userId: number = 0;

constructor() { }

  setUserId(userId: number){
    this.userId = userId
  }

  getUserId(){
    return this.userId
  }

}

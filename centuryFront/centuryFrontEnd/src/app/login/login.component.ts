import { Routes } from '@angular/router';
import { ChangeDetectionStrategy, Component, NgModule, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ApiService } from '../servicios/product.service';
import { LoginService } from '../servicios/login.service';
import { FormsModule } from '@angular/forms';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})

export class LoginComponent implements OnInit {
  userId!: number;

  constructor(private api: ApiService, private loginVar: LoginService){}

  ngOnInit(): void {

  }

  login(form: NgForm) {
    const email = "correo1@dominio.com";
    const password = "123456";

    console.log(email)
    console.log(password)
    this.api.login(email, password).subscribe(
      response => {
        console.log(response);
        this.loginVar.setUserId(response.userId)
        console.log("ft: "+this.loginVar.getUserId())
      },
      error => {
        console.error(error);
      }
    );

    console.log("tt:  " + this.api.login1(email, password))

    console.log(this.loginVar.getUserId())
  }
}

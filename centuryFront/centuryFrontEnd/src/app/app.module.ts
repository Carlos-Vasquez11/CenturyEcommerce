import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { RoutingModule } from './routing/routing.module';
import { ApiService } from './servicios/product.service';
import { ListadoProductoComponent } from './listado-producto/listado-producto.component';
import { HttpClientModule } from '@angular/common/http';

import { RouterModule } from '@angular/router';
import { CartComponent } from './cart/cart.component';
import { ListadoPurchaseComponent } from './listado-purchase/listado-purchase.component';

import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    ListadoProductoComponent,
    CartComponent,
    ListadoPurchaseComponent
   ],
  imports: [
    BrowserModule,
    RoutingModule,
    HttpClientModule,
    RouterModule.forRoot([]),
    FormsModule
  ],
  providers: [ApiService],
  bootstrap: [AppComponent],
  exports: [
    HeaderComponent,
    RoutingModule,
    RouterModule
  ]
})
export class AppModule { }

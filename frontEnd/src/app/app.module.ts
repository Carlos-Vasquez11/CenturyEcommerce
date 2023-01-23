import { ApiService } from './Servicios/apiService';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Componentes/Generales/header/header.component';
import { FooterComponent } from './Componentes/Generales/footer/footer.component';
import { HomeComponent } from './Componentes/home/home.component';
import { ShopComponent } from './Componentes/shop/shop.component';
import { LoginComponent } from './Componentes/login/login.component';
import { PurchasesComponent } from '../app/Componentes/purchases/purchases.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'shop', component: ShopComponent },
  { path: 'login', component: LoginComponent },
  { path: 'purchases', component: PurchasesComponent }
  // Más rutas ...
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    ShopComponent,
    LoginComponent,
    PurchasesComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [ApiService],
  bootstrap: [AppComponent],
  exports: [
    RouterModule,
    HeaderComponent,
    FooterComponent
  ]
})
export class AppModule { }

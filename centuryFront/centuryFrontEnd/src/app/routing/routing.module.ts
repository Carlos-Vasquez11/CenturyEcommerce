import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from '../login/login.component';
import { ListadoProductoComponent } from '../listado-producto/listado-producto.component';
import { CartComponent } from '../cart/cart.component';
import { ListadoPurchaseComponent } from '../listado-purchase/listado-purchase.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'shop/publications/:id', component: ListadoProductoComponent },
  { path: '', component: ListadoProductoComponent },
  { path: 'cart', component: CartComponent },
  { path: 'purchases/user/:id', component: ListadoPurchaseComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class RoutingModule { }

import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { RoutingModule } from '../routing/routing.module';
import { CartService } from '../servicios/cart.service';
import { LoginService } from '../servicios/login.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
  changeDetection: ChangeDetectionStrategy.Default
})

export class HeaderComponent{

  constructor(private router: Router, public cartService: CartService, private loginSesion: LoginService) {}

  cart: any[] = [];

  onCartClick() {
    console.log(this.cartService.getCart())
  }

  irAShop(){
    this.router.navigate(["./shop/publications/all"])
  }

  irALogin(){
    this.router.navigate(["./login"])
  }

  irACompras(){
    this.router.navigate(["./purchases/user/" + this.loginSesion.getUserId()])
  }

  irACarrito(){
    this.router.navigate(["./cart"])
  }
}


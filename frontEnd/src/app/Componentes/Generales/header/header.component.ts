import { ChangeDetectionStrategy, Component } from '@angular/core';
import { Router} from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class HeaderComponent {

  constructor(private router: Router) {}


  goToHome(){
    this.router.navigate(["./home"])
  }

  goToShop(){
    this.router.navigate(["./shop"])
  }

  goToPurchases(){
    this.router.navigate(["./purchases"])
  }

  goToLogin(){
    this.router.navigate(["./login"])
  }

}

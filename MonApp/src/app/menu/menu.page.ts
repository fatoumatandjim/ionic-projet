import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.page.html',
  styleUrls: ['./menu.page.scss'],
})
export class MenuPage implements OnInit {
  public menus=[
    {title:"Home",url:"/menu/home",icon:"home-outline"},
    {title:"Apprenant", url:"/menu/apprenant",icon:"woman-outline"},
    {title:"Logout", url:"Logout",icon:"log-out-outline"}
  ]

  constructor(private router:Router) { }

  ngOnInit() {
  }
  onMenu(a){
    if(a.url=='Logout'){
      localStorage.removeItem("key")
      this.router.navigateByUrl("/login");
    }
    else{
      this.router.navigateByUrl(a.url);
    }
  }
}

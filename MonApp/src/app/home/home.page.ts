import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
    public storage;
    public heure:Date=new Date;
  constructor() {
    this.storage=JSON.parse(localStorage.getItem("key"))
  }

}

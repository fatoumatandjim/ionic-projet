import { Component, Injectable, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiServiceService } from '../api-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})

export class LoginPage implements OnInit {
    public apprenant;
  constructor(private ApiService:ApiServiceService , private router:Router) { }

  ngOnInit() {
  }
  onLogin(logpass){
    this.ApiService.rechercherApprenant(logpass.login ,logpass.password)
    .subscribe(data=>{
      this.apprenant=data
      if(this.apprenant==null){
        alert("mot de passe ou login incorrect ")
      }
      else{
        localStorage.setItem("key",JSON.stringify(this.apprenant));
        this.router.navigateByUrl("/menu/home")
      }
    },err=>{
      console.log(err)
    })
  }
}


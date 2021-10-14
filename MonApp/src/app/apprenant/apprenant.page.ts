import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from '../api-service.service';

@Component({
  selector: 'app-apprenant',
  templateUrl: './apprenant.page.html',
  styleUrls: ['./apprenant.page.scss'],
})
export class ApprenantPage implements OnInit {
  public listeApprenant;
  constructor(private ApiService:ApiServiceService) { }

  ngOnInit() {
    this.ApiService.getApprenant()
    .subscribe(data=>{
      this.listeApprenant=data;
    },err=>{
      console.log(err)
    }
    )
  }

}

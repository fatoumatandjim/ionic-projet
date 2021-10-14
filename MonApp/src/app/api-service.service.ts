import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginPage } from './login/login.page';

@Injectable({
  providedIn: 'root'
})
export class ApiServiceService {
    public host:String="http://localhost:8085";

  constructor(private http:HttpClient) { }
public rechercherApprenant(login, password){
  return this.http.get(this.host+"/rechercherApprenant/login="+login+"&password="+password);
}
  public getApprenant(){
    return this.http.get(this.host+"/listeApprenant");
  }
}

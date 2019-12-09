import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

users = [];

  constructor() { }

  printform(loginForm: NgForm){
    console.log(loginForm.value);
    //to store data in array
    this.users.push(loginForm.value);
    console.log(this.users);
    //after submiting/login reset form
    loginForm.reset;
  }

  ngOnInit() {
  }

}

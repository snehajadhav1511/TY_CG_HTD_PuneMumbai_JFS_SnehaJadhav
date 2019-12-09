import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { CustomValidator } from '../custom.Validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


  constructor() { }

  get email() {
    return this.registerForm.get('email');
  }
  get password() {
    return this.registerForm.get('password');
  }

  registerForm = new FormGroup({
    email: new FormControl('', [
      Validators.email,
      Validators.required,
      Validators.minLength(8),
      CustomValidator.noSpace
    ]),
    password: new FormControl('', [
      Validators.minLength(8),
      Validators.required
    ])
  });

  // add event
  printForm(form: NgForm) {
    console.log(form.value);
  }

  ngOnInit() {
    console.log('component Initialised');
  }

}

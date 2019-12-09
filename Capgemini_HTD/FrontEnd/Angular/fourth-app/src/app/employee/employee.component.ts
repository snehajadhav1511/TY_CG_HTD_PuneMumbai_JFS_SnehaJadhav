import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from 'src/employee';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  todaysDate = Date.now();

  selectedEmployee: Employee = {
    empId: null,
    email: null,
    name: null,
    phone: null,
    status: null,
    pk: null

  };

  constructor(public employeeService: EmployeeService) {
    this.employeeService.getData();
  }

  deleteEmployee(employee: Employee) {
    this.employeeService.deleteData(employee).subscribe(response => {
      console.log(response);
      console.log('deleted one employee');
      // to update the table again
      this.employeeService.getData();
    }, err => {
      console.log(err);
    });
  }

  selectEmployee(employee: Employee) {
    this.selectedEmployee = employee;

  }

  submitForm(form: NgForm) {
    this.employeeService.putData(form.value).subscribe(Response => {
      console.log(Response);
      form.reset();
    }, err => {
      console.log(err);
    });
  }


  ngOnInit() {
  }

}

import { Component, OnInit } from '@angular/core';
import { Student } from '../Students';


@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {
  person = "sneha";
  flag = false;


  student: Student[] = [{
    id: 1234,
    name: 'sneha',
    age: 22,
    degree: 'BE'
  }, {
    id: 1235,
    name: 'saumya',
    age: 20,
    degree: 'Bsc'
  }, {
    id: 1236,
    name: 'shubham',
    age: 19,
    degree: 'Bms'
  }, {
    id: 1237,
    name: 'nisha',
    age: 22,
    degree: 'MBBS'

  }];

  constructor() {
    setTimeout(() => {
      this.flag = true;
    }, 2000);
  }
deleteStudent(St){
  const index = this.student.indexOf(St);
  this.student.splice(index,1);
}

  ngOnInit() {
  }

}

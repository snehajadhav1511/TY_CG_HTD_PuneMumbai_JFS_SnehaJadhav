import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

inputData;

flag =true;
name = 'Sneha Jadhav';
imgURL="https://cdn.pixabay.com/photo/2017/10/04/18/11/road-2817102__340.jpg";

  constructor() {
    setInterval(()=>{
      this.flag = !this.flag;
    },500)
   }

   eventOccured(input){
     console.log(input.value);
     console.log('event is occured');
   }
  
  ngOnInit() {
  }

}

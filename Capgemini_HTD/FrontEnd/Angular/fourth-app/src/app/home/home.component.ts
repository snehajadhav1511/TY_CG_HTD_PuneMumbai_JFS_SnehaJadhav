import { Component, OnInit, OnDestroy } from '@angular/core';
import { interval, Subscription } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy{

  mySubscription: Subscription;    //it is an variable

  constructor() {
    this.mySubscription = interval(1000).subscribe(data => {
      console.log(data);
    });
  }

  ngOnInit() {
  }
  ngOnDestroy() {         //to unsubscribe we 
   this.mySubscription.unsubscribe();
  }

}

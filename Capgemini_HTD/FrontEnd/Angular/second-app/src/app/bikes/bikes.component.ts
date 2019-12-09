import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {



  bikes : Bike[] = [
    {
      brand: 'Royal Enfield',
      price: 150000,
      imgURL:'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
      model: 'Classic 350',
      specs: 'Good bike'
    },{
      brand: 'TVS',
      price: 100000,
      imgURL:'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
      model: 'TVS Apache RR 310',
      specs: 'light waeight bike'
    },{
      brand: 'Jawa',
      price: 200000,
      imgURL:'https://cdn.pixabay.com/photo/2017/10/29/14/13/motorcycle-2899797__340.jpg',
      model: 'Jawa Motorcycles portfolio',
      specs: 'new bike'
    },{
      brand: 'Duke',
      price: 250000,
      imgURL:'https://cdn.pixabay.com/photo/2019/04/19/10/29/motorcycle-4139052__340.jpg',
      model: 'duke 250',
      specs: 'Very good bike'
    }
  ];

  selectedBike: Bike = this.bikes[0];

  selecteBike(bike){
    this.selectedBike= bike;
  }

  constructor() { }

  ngOnInit() {
  }

}

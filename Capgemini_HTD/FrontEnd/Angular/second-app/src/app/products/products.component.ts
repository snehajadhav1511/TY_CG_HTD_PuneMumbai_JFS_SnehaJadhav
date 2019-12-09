import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  product: Product[]=[{name:'chocolate',
  imgURL: 'https://cdn.pixabay.com/photo/2013/09/18/18/24/chocolate-183543__340.jpg',
  price: 200,
  details:'More Sweet'
},{
  name:'ice-cream',
  imgURL: 'https://cdn.pixabay.com/photo/2019/08/12/13/45/ice-4401300__340.jpg',
  price: 150,
  details:'Vanila with chocolate flavour'
},{
  name:'ice-cream',
  imgURL: 'https://cdn.pixabay.com/photo/2019/08/12/13/45/ice-4401300__340.jpg',
  price: 150,
  details:'Vanila with chocolate flavour'
}
// {
//   imgURL='https://cdn.pixabay.com/photo/2016/11/22/18/52/cake-1850011__340.jpg';
// }
];


  constructor() { }

  ngOnInit() {
  }

}

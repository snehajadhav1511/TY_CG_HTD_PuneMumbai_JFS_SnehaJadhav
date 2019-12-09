import { Injectable } from '@angular/core';



@Injectable({
    providedIn:'root'
})
export class SampleService{

    laptop = 'Acer';
    printService(){
        console.log('This method running from sample service');
    }
}
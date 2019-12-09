import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { BikesComponent } from './bikes/bikes.component';
import { CarsComponent } from './cars/cars.component';
import { PlanesComponent } from './planes/planes.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ContactUsComponent,
    AboutComponent,
    RegisterComponent,
    LoginComponent,
    PageNotFoundComponent,
    BikesComponent,
    CarsComponent,
    PlanesComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component: HomeComponent},
      {path:'about',component: AboutComponent,children:[
        {path:'bikes',component:BikesComponent},
        {path:'cars',component:CarsComponent},
        {path:'planes',component:PlanesComponent}
      ]},
      {path:'contact-us',component: ContactUsComponent},
      {path:'register',component: RegisterComponent},
      {path:'login',component: LoginComponent},
      {path: '**',component: PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

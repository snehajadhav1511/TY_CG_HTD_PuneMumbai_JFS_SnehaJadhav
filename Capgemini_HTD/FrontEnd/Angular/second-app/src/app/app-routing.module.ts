import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { BindingComponent } from './binding/binding.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { ProductsComponent } from './products/products.component';
import { ParentComponent } from './parent/parent.component';
import { BikesComponent } from './bikes/bikes.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';


const routes: Routes = [                                     //change here just give routes
  { path:'', component: HomeComponent },
  { path:'data-binding', component: BindingComponent},
  { path:'two way', component: TwoWayBindingComponent},
  { path:'two way', component: TwoWayBindingComponent},
  { path:'structural-directives', component:StructuralDirectivesComponent},
  { path:'product', component: ProductsComponent},
  { path:'parent', component:ParentComponent},
  { path:'bikes', component:BikesComponent},
  { path:'login', component:LoginComponent},
  { path:'register',component:RegisterComponent}
];    

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

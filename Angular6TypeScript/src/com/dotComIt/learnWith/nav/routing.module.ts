/**
 * Created by jhouser on 3/30/2017.
 */


import { NgModule }      from '@angular/core';
import { RouterModule, Routes }   from '@angular/router';
import {FirstComponent} from "../views/first/first.component";
import {SecondComponent} from "../views/second/second.component";
import { LoginComponent } from '../views/login/login.component';
import { TasksComponent } from '../views/tasks/tasks.component';


const ROUTES : Routes = [
    { path: 'first', component: FirstComponent },
    { path: 'second', component: SecondComponent },
    { path: 'login', component: LoginComponent },
    { path: 'tasks', component: TasksComponent },
    { path: '', redirectTo: 'login', pathMatch: 'full' },
    { path: '**', redirectTo: 'login' },
];
@NgModule({
    imports: [ RouterModule.forRoot(ROUTES) ],
    declarations: [ FirstComponent, SecondComponent, LoginComponent, TasksComponent ],
    exports: [ RouterModule ]
})

export class AppRoutingModule {}
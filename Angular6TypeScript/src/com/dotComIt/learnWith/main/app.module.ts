import { TaskGrid } from './../views/tasks/taskgrid.component';
import { TasksComponent } from './../views/tasks/tasks.component';
import { UserModel } from './../model/usermodel';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { AppRoutingModule } from '../nav/routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AuthenticationService } from './../services/java/authentication.service';
import { NgxDatatableModule } from '@swimlane/ngx-datatable'
import { TaskModel } from '../model/taskmodel';
import { LoginComponent } from '../views/login/login.component';




@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgxDatatableModule
  ],
  declarations: [AppComponent,
    LoginComponent,
    TasksComponent,
    TaskGrid],
  providers: [{ provide: LocationStrategy, useClass: HashLocationStrategy },
    AuthenticationService,
    UserModel,
    TaskModel],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { UserModel } from './../model/usermodel';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { AppComponent } from './app.component';
import { AppRoutingModule } from '../nav/routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AuthenticationService } from './../services/java/authentication.service';
import { FormsModule } from '@angular/forms';





@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  declarations: [AppComponent],
  providers: [{ provide: LocationStrategy, useClass: HashLocationStrategy },
    AuthenticationService,
    UserModel],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { UserModel } from './../model/usermodel';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { AppRoutingModule } from '../nav/routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AuthenticationService } from './../services/java/authentication.service';




@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  declarations: [AppComponent],
  providers: [{ provide: LocationStrategy, useClass: HashLocationStrategy },
    AuthenticationService,
    UserModel],
  bootstrap: [AppComponent]
})
export class AppModule { }

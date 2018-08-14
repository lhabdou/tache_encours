import {Component} from '@angular/core';

@Component({
    selector:'login',
    templateUrl:'./com/dotComIt/learnWith/views/login/login.component.html',
    styleUrls:['./com/dotComIt/learnWith/views/login/login.component.css']
})

export class LoginComponent {
    onReset(): void {
        console.log('onReset');
    }
    onLogin(): void {
        console.log('onLogin');
    }

 }
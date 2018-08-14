import {Component} from '@angular/core';

@Component({
    selector:'login',
    templateUrl:'./com/dotComIt/learnWith/views/login/login.component.html',
    styleUrls:['./com/dotComIt/learnWith/views/login/login.component.css']
})

export class LoginComponent {

    username='';
    password='';

    onReset(): void {
        this.username = '';
        this.password = '';
    }
    onLogin(): void {
        console.log('onLogin');
    }

 }
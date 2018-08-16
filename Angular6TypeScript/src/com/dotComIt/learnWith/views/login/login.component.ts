import { Component } from '@angular/core';
import { UserVO } from './../../vo/UserVO';
import { UserModel } from './../../model/usermodel';
import { Router } from '@angular/router';
import { AuthenticationService } from './../../services/java/authentication.service';


@Component({
    selector: 'login',
    templateUrl: './com/dotComIt/learnWith/views/login/login.component.html',
    styleUrls: ['./com/dotComIt/learnWith/views/login/login.component.css']
})

export class LoginComponent {

    username = '';
    password = '';
    usernameError = '';
    passwordError = '';
    loginError = '';

    constructor(
        private authenticationService: AuthenticationService,
        private router: Router,
        private userModel: UserModel
    ) { }

    onReset(): void {
        this.username = '';
        this.password = '';
    }
    onLogin(): void {
        let errorFound: boolean = false;
        this.loginError = '';
        // controle de la saisie de l'identifiant
        if (this.username === '') {
            this.usernameError = 'You Must Enter a Username';
            errorFound = true;
        } else {
            this.usernameError = '';
        }

        // controle de la saisie du mdp
        if (this.password === '') {
            this.passwordError = 'You Must Enter a Password';
            errorFound = true;
        } else {
            this.passwordError = '';
        }

        if (errorFound === true) {
            return;
        }

        this.authenticationService.authenticate(this.username, this.password)
            .subscribe(
                result => {
                    if (result.error) {
                        this.loginError = 'We could not log you in';
                        return;
                    }
                    this.userModel.user = result.resultObject as UserVO;
                    console.log("je passe dans authenticate");
                    console.log(result.resultObject as UserVO);
                    this.router.navigate(['/tasks']);
                }, error => {
                    this.loginError = 'There was an authentication service error';
                }
            );
    }


}
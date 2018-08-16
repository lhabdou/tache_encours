import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs/index";
import { Md5 } from 'ts-md5/dist/md5';

// points to location of the java services
const servicePrefix: string = '/lwchapter1/webapi/';


@Injectable()
export class AuthenticationService {
    options: Object;
    constructor(private http: HttpClient) {
        let optionHeaders: HttpHeaders = new HttpHeaders().set('Content-Type', 'application/json');
        this.options = { headers: optionHeaders };
    }

    authenticate(username: string, password: string):
        Observable<any> {

        let parameters: object = {
            username: username,
            password: Md5.hashStr(password)
        };

        return this.http.post(servicePrefix + 'login', parameters, this.options);

    }

}



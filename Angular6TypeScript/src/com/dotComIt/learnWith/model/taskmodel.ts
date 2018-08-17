import { TaskVO } from '../vo/TaskVO';
import { Injectable } from '@angular/core';

@Injectable()
export class TaskModel {

    completed:boolean;
    dateCompleted:Date;
    dateCreated:Date;
    dateScheduled:Date;
    descrtiption:string;
    taskCategory:string;
    taskCategoryID:number;
    taskID:number;
    userID:number;
    tasks:TaskVO[];

};

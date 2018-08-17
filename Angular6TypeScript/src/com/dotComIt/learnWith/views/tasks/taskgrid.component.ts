import { TaskVO } from './../../vo/TaskVO';
import { TaskModel } from './../../model/taskmodel';
import {Component} from '@angular/core';

@Component({
    selector: 'taskgrid',
    templateUrl : './com/dotComIt/learnWith/views/tasks/taskgrid.component.html',
     styleUrls: [ './com/dotComIt/learnWith/views/tasks/taskgrid.component.css' ]
  })

export class TaskGrid {

  public tasks:TaskVO[];

  constructor(private taskModel:TaskModel) {

  }
}

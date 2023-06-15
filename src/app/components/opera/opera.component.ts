import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { ConnectionDBService } from 'src/app/services/connection-db.service';

@Component({
  selector: 'app-opera',
  templateUrl: './opera.component.html',
  styleUrls: ['./opera.component.css']
})
export class OperaComponent {
  opere!: any;

  constructor(private http: ConnectionDBService, private router: Router, private dialog: MatDialog) { }

  ngOnInit() {
    this.getAllOpera() ;
  }

  getAllOpera() {
    this.http.getAllOpera().subscribe(data => {
      this.opere = data;
    });
  }
}

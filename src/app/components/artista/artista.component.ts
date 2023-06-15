import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ConnectionDBService } from 'src/app/services/connection-db.service';
import { AddArtistaDialogComponent } from '../add-artista-dialog/add-artista-dialog.component';
import { ModificaArtistaDialogComponent } from '../modifica-artista-dialog/modifica-artista-dialog.component';

@Component({
  selector: 'app-artista',
  templateUrl: './artista.component.html',
  styleUrls: ['./artista.component.css']
})
export class ArtistaComponent {
  artisti!: any;
  artistaModificato: any = {};

  constructor(private http: ConnectionDBService, private dialog: MatDialog) { }

  ngOnInit() {
    this.getAllArtisti();
  }

  getAllArtisti() {
    this.http.getAllArtisti().subscribe((data) => {
      this.artisti = data;
    });
  }

  deleteArtista(id: number) {
    this.http.deleteArtista(id).subscribe(() => {
      this.getAllArtisti();
    });
  }

  addArtista() {
    const dialogRef = this.dialog.open(AddArtistaDialogComponent);

    dialogRef.afterClosed().subscribe(result => {
      console.log(result);
      this.http.addArtista(result).subscribe((result:any) => {
        console.log(result);
        this.getAllArtisti();
      });
    });
  }

  updateArtista(id: number, artista: any) {
    const dialogRef = this.dialog.open(ModificaArtistaDialogComponent, {
      data: artista,
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.http.updateArtista(id, result).subscribe(() => {
          this.getAllArtisti();
        });
      }
    });
  }
}

import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-modifica-artista-dialog',
  templateUrl: './modifica-artista-dialog.component.html',
  styleUrls: ['./modifica-artista-dialog.component.css']
})
export class ModificaArtistaDialogComponent {
  artista: any;

  constructor(
    private dialogRef: MatDialogRef<ModificaArtistaDialogComponent>,
    @Inject(MAT_DIALOG_DATA) private data: any
  ) {
    this.artista = { ...data };
  }

  submitForm() {
    this.dialogRef.close(this.artista);
  }

  cancel() {
    this.dialogRef.close();
  }
}

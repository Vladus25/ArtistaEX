import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-add-artista-dialog',
  templateUrl: './add-artista-dialog.component.html',
  styleUrls: ['./add-artista-dialog.component.css']
})
export class AddArtistaDialogComponent {
  artista: any = {
    nome: '',
    dataN: '',
    dataM: '',
    idCitta: { id: null }
  };

  constructor(
    private dialogRef: MatDialogRef<AddArtistaDialogComponent>,
    @Inject(MAT_DIALOG_DATA) private data: any
  ) { }

  submitForm() {
    const nuovoArtista = { ...this.artista };
    this.dialogRef.close(nuovoArtista);
  }

  cancel() {
    this.dialogRef.close();
  }
}

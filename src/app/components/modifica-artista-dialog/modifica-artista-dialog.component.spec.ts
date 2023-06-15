import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModificaArtistaDialogComponent } from './modifica-artista-dialog.component';

describe('ModificaArtistaDialogComponent', () => {
  let component: ModificaArtistaDialogComponent;
  let fixture: ComponentFixture<ModificaArtistaDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModificaArtistaDialogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModificaArtistaDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

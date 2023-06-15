import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddArtistaDialogComponent } from './add-artista-dialog.component';

describe('AddArtistaDialogComponent', () => {
  let component: AddArtistaDialogComponent;
  let fixture: ComponentFixture<AddArtistaDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddArtistaDialogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddArtistaDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

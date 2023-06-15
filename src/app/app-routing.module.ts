import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ArtistaComponent } from './components/artista/artista.component';
import { OperaComponent } from './components/opera/opera.component';

const routes: Routes = [
  {path:'Home', component: HomeComponent },
  {path:'Artista', component: ArtistaComponent },
  {path:'Opere', component: OperaComponent },
  {path: '', redirectTo: 'Home', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

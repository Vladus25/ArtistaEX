import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConnectionDBService {

  constructor(private http: HttpClient) {}

  private baseUrl = 'http://localhost:8080';

  // Manipolazione con artista
  getAllArtisti() {
    return this.http.get(`${this.baseUrl}/allArtista`);
  }

  deleteArtista(id: number) {
    return this.http.delete(`${this.baseUrl}/deleteArtista/${id}`);
  }

  addArtista(artista: any) {
    return this.http.post(`${this.baseUrl}/addArtista`, artista);
  }

  updateArtista(id: number, artista: any) {
    return this.http.put(`${this.baseUrl}/updateArtista/${id}`, artista);
  }

  // Manipolazione con citta
  getAllCitta() {
    return this.http.get(`${this.baseUrl}/allCitta`);
  }

  deleteCitta(id: number) {
    return this.http.delete(`${this.baseUrl}/deleteCitta/${id}`);
  }

  addCitta(citta: any) {
    return this.http.post(`${this.baseUrl}/addCitta`, citta);
  }

  updateCitta(id: number, citta: any) {
    return this.http.put(`${this.baseUrl}/updateCitta/${id}`, citta);
  }

  // Manipolazione con Museo
  getAllMuseo() {
    return this.http.get(`${this.baseUrl}/allMuseo`);
  }

  deleteMuseo(id: number) {
    return this.http.delete(`${this.baseUrl}/deleteMuseo/${id}`);
  }

  addMuseo(museo: any) {
    return this.http.post(`${this.baseUrl}/addMuseo`, museo);
  }

  updateMuseo(id: number, museo: any) {
    return this.http.put(`${this.baseUrl}/updateMuseo/${id}`, museo);
  }

  // Manipolazione con Opera
  getAllOpera() {
    return this.http.get(`${this.baseUrl}/allOpera`);
  }

  deleteOpera(id: number) {
    return this.http.delete(`${this.baseUrl}/deleteOpera/${id}`);
  }

  addOpera(opera: any) {
    return this.http.post(`${this.baseUrl}/addOpera`, opera);
  }

  updateOpera(id: number, opera: any) {
    return this.http.put(`${this.baseUrl}/updateOpera/${id}`, opera);
  }

}

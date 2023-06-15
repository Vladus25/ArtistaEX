package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.ArtistaEntity;
import com.Repository.ArtistaRepository;

@Service
public class ArtistaService {

	@Autowired
	private ArtistaRepository repo;

	public List<ArtistaEntity> getArtista() {
		return repo.findAll();
	}

	public boolean deleteArtista(Integer id) {
		Optional<ArtistaEntity> optionalArtista = repo.findById(id);
		if (optionalArtista.isPresent()) {
			repo.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public ArtistaEntity addArtista(ArtistaEntity artista) {
		return repo.save(artista);
	}

	public boolean updateArtista(Integer id, ArtistaEntity artista) {
		Optional<ArtistaEntity> optionalArtista = repo.findById(id);
		if (optionalArtista.isPresent()) {
			ArtistaEntity existingArtista = optionalArtista.get();
			existingArtista.setNome(artista.getNome());
			existingArtista.setDataN(artista.getDataN());
			existingArtista.setDataM(artista.getDataM());
			existingArtista.setIdCitta(artista.getIdCitta());
			repo.save(existingArtista);
			return true;
		} else {
			return false;
		}
	}
}

package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.CittaEntity;
import com.Repository.CittaRepository;

@Service
public class CittaService {

	@Autowired
	private CittaRepository repo;

	public List<CittaEntity> getCitta() {
		return repo.findAll();
	}

	public boolean deleteCitta(Integer id) {
		Optional<CittaEntity> optionalCitta = repo.findById(id);
		if (optionalCitta.isPresent()) {
			repo.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public CittaEntity addCitta(CittaEntity citta) {
		return repo.save(citta);
	}

	public boolean updateCitta(Integer id, CittaEntity citta) {
		Optional<CittaEntity> optionalCitta = repo.findById(id);
		if (optionalCitta.isPresent()) {
			CittaEntity existingCitta = optionalCitta.get();
			existingCitta.setNome(citta.getNome());
			existingCitta.setCap(citta.getCap());
			repo.save(existingCitta);
			return true;
		} else {
			return false;
		}
	}
}

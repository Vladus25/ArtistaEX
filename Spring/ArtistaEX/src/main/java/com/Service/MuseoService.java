package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.MuseoEntity;
import com.Repository.MuseoRepository;

@Service
public class MuseoService {
	
	@Autowired
    private MuseoRepository repo;

    public List<MuseoEntity> getMuseo(){
        return repo.findAll();
    }
    
    public boolean deleteMuseo(Integer id) {
        Optional<MuseoEntity> optionalMuseo = repo.findById(id);
        if (optionalMuseo.isPresent()) {
            repo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public MuseoEntity addMuseo(MuseoEntity museo) {
        return repo.save(museo);
    }

    public boolean updateMuseo(Integer id, MuseoEntity museo) {
        Optional<MuseoEntity> optionalMuseo = repo.findById(id);
        if (optionalMuseo.isPresent()) {
            MuseoEntity existingMuseo = optionalMuseo.get();
            existingMuseo.setNome(museo.getNome());
            existingMuseo.setVia(museo.getVia());
            existingMuseo.setTelefono(museo.getTelefono());
            existingMuseo.setCivico(museo.getCivico());
            existingMuseo.setIdCitta(museo.getIdCitta());
            repo.save(existingMuseo);
            return true;
        } else {
            return false;
        }
    }
}

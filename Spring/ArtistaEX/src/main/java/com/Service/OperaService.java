package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.OperaEntity;
import com.Repository.OperaRepository;


@Service
public class OperaService {
	
	@Autowired
    private OperaRepository repo;

    public List<OperaEntity> getOpera(){
        return repo.findAll();
    }
    
    public boolean deleteOpera(Integer id) {
        Optional<OperaEntity> optionalOpera = repo.findById(id);
        if (optionalOpera.isPresent()) {
            repo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public OperaEntity addOpera(OperaEntity opera) {
        return repo.save(opera);
    }

    public boolean updateOpera(Integer id, OperaEntity opera) {
        Optional<OperaEntity> optionalOpera = repo.findById(id);
        if (optionalOpera.isPresent()) {
            OperaEntity existingOpera = optionalOpera.get();
            existingOpera.setTitolo(opera.getTitolo());
            existingOpera.setValore(opera.getValore());
            existingOpera.setAnno(opera.getAnno());
            existingOpera.setIdArtista(opera.getIdArtista());
            existingOpera.setIdMuseo(opera.getIdMuseo());
            repo.save(existingOpera);
            return true;
        } else {
            return false;
        }
    }
}

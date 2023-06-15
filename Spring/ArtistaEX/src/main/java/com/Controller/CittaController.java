package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.CittaEntity;
import com.Service.CittaService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CittaController {
	
	@Autowired
    private CittaService serv;

    @GetMapping("/allCitta")
    public List<CittaEntity> getCitta(){
        return serv.getCitta();
    }
    
    @DeleteMapping("/deleteCitta/{id}")
    public boolean deleteCitta(@PathVariable Integer id) {
        return serv.deleteCitta(id);
    }

    @PostMapping("/addCitta")
    public CittaEntity addCitta(@RequestBody CittaEntity citta) {
        return serv.addCitta(citta);
    }

    @PutMapping("/updateCitta/{id}")
    public boolean updateCitta(@PathVariable Integer id, @RequestBody CittaEntity citta) {
        return serv.updateCitta(id, citta);
    }
}

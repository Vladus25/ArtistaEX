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

import com.Entity.ArtistaEntity;
import com.Service.ArtistaService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ArtistaController {
	
	@Autowired
    private ArtistaService artistaService;

    @GetMapping("/allArtista")
    public List<ArtistaEntity> getArtista(){
        return artistaService.getArtista();
    }
    
    @DeleteMapping("/deleteArtista/{id}")
    public boolean deleteArtista(@PathVariable Integer id) {
        return artistaService.deleteArtista(id);
    }
    
    @PostMapping("/addArtista")
    public ArtistaEntity addArtista(@RequestBody ArtistaEntity artista) {
        return artistaService.addArtista(artista);
    }
    
    @PutMapping("/updateArtista/{id}")
    public boolean updateArtista(@PathVariable Integer id, @RequestBody ArtistaEntity artista) {
        return artistaService.updateArtista(id, artista);
    }
}

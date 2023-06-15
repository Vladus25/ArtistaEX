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


import com.Entity.MuseoEntity;
import com.Service.MuseoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class MuseoController {
	
	@Autowired
    private MuseoService serv;

    @GetMapping("/allMuseo")
    public List<MuseoEntity> getMuseo(){
        return serv.getMuseo();
    }
    

    @DeleteMapping("/deleteMuseo/{id}")
    public boolean deleteMuseo(@PathVariable Integer id) {
        return serv.deleteMuseo(id);
    }

    @PostMapping("/addMuseo")
    public MuseoEntity addMuseo(@RequestBody MuseoEntity museo) {
        return serv.addMuseo(museo);
    }

    @PutMapping("/updateMuseo/{id}")
    public boolean updateMuseo(@PathVariable Integer id, @RequestBody MuseoEntity museo) {
        return serv.updateMuseo(id, museo);
    }
}

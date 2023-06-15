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

import com.Entity.OperaEntity;
import com.Service.OperaService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class OperaController {
	
	@Autowired
    private OperaService serv;

    @GetMapping("/allOpera")
    public List<OperaEntity> getOpera(){
        return serv.getOpera();
    }
    
    @DeleteMapping("/deleteOpera/{id}")
    public boolean deleteOpera(@PathVariable Integer id) {
        return serv.deleteOpera(id);
    }

    @PostMapping("/addOpera")
    public OperaEntity addOpera(@RequestBody OperaEntity opera) {
        return serv.addOpera(opera);
    }

    @PutMapping("/updateOpera/{id}")
    public boolean updateOpera(@PathVariable Integer id, @RequestBody OperaEntity opera) {
        return serv.updateOpera(id, opera);
    }
}

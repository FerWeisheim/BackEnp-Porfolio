/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.TecnologiaSoft;
import com.porta.portafolio.Interface.ITecnologiaSoftService;
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

/**
 *
 * @author ferna
 */
@CrossOrigin(origins = "*")
@RestController
public class TecnologiaSoftController {
    @Autowired
    ITecnologiaSoftService itecnologiaservice;
    
    @GetMapping("tecnologia/soft/traer")
    public List<TecnologiaSoft>GetTecnologia(){
        return itecnologiaservice.GetTecnologiaSoft();
    }
    
    @PostMapping("tecnologia/soft/crear")
    public void crearTecnologiaBack(@RequestBody TecnologiaSoft tecnologiasoft){
        itecnologiaservice.saveTecnologiaSoft(tecnologiasoft);
    
    }
    @DeleteMapping("tecnologia/soft/borrar/{id}")
    public void deleteTecnologiaBack(@PathVariable Integer id){
    itecnologiaservice.deleteTecnologiaSoft(id);
    }
 
     @PutMapping({"tecnologia/soft/editar/{id}"})
    public TecnologiaSoft edit (@PathVariable int id,
                          @RequestBody TecnologiaSoft tecnologiasoft){
     tecnologiasoft.setId(id);
     itecnologiaservice.saveTecnologiaSoft(tecnologiasoft);
     return tecnologiasoft;
    }
    
       @GetMapping("tecnologia/soft/traer/{id}")
    public TecnologiaSoft find(@PathVariable Integer id){
    return itecnologiaservice.findTecnologiaSoft(id);
    }
    
    
    
    
    
}

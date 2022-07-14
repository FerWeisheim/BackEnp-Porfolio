/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Tecnologia;
import com.porta.portafolio.Entity.TecnologiaBack;
import com.porta.portafolio.Interface.ITecnologiaBackService;
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
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TecnologiaBackController {
       @Autowired
       ITecnologiaBackService itecnologiabackservice;
       
       
    @GetMapping("tecnologia/back/traer")
    public List<TecnologiaBack>GetTecnologia(){
        return itecnologiabackservice.GetTecnologiaBack();
    }
    
    @PostMapping("tecnologia/back/crear")
    public void crearTecnologiaBack(@RequestBody TecnologiaBack tecnologiaback){
        itecnologiabackservice.saveTecnologiaBack(tecnologiaback);
    
    }
    @DeleteMapping("tecnologia/back/borrar/{id}")
    public void deleteTecnologiaBack(@PathVariable Integer id){
    itecnologiabackservice.deleteTecnologiaBack(id);
    }
 
     @PutMapping({"tecnologia/back/editar/{id}"})
    public TecnologiaBack edit (@PathVariable int id,
                          @RequestBody TecnologiaBack tecnologiaback){
     tecnologiaback.setId(id);
     itecnologiabackservice.saveTecnologiaBack(tecnologiaback);
     return tecnologiaback;
    }
    
       @GetMapping("tecnologia/back/traer/{id}")
    public TecnologiaBack find(@PathVariable Integer id){
    return itecnologiabackservice.findTecnologiaBack(id);
    }
    
}

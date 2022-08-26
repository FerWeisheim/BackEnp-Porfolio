/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Experiencia;
import com.porta.portafolio.Interface.IExperienciaService;
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
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    IExperienciaService iexperienciaservice;
    
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencia(){
       return  iexperienciaservice.getExperiencia();
    }
      
    @PostMapping("/experiencia/crear")
    public void crearExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaservice.saveExperiencia(experiencia);
    }
    @DeleteMapping("/experiencia/borrar/{id}")
    public void deleteExperiencia(@PathVariable Integer id){
        iexperienciaservice.deleteExperiencia(id);
    }
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia edit (@PathVariable int id, @RequestBody Experiencia experiencia){
        experiencia.setId(id);
        iexperienciaservice.saveExperiencia(experiencia);
        return experiencia;
    }
    @GetMapping("/experiencia/traer/id")
    public Experiencia findExperiencia(@PathVariable Integer id){
        return iexperienciaservice.findExperiencia(id);
    }
    
    
    
}

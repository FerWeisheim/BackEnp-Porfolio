/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Tecnologia;
import com.porta.portafolio.Interface.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ferna
 */
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class TecnologiaController {
    @Autowired
    ITecnologiaService itecnologiaservice;
    
    @GetMapping("tecnologia/traer")
    public List<Tecnologia>GetTecnologias(){
        return itecnologiaservice.GetTecnologia();
    }
    
    @PostMapping("tecnologia/crear")
    public void crearTecnologia(@RequestBody Tecnologia tecnologia){
     itecnologiaservice.saveTecnologia(tecnologia);
    
    }
    @DeleteMapping("tecnologia/borrar/{id}")
    public void deleteTecnologia(@PathVariable Integer id){
    itecnologiaservice.deleteTecnologia(id);
    }
   
  /* @PutMapping("/tecnologia/editar/{id}")
    public Tecnologia editTecnologia(@PathVariable Integer id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("conocimiento") String nuevoConocimiento,
                               @RequestParam("img") String nuevoImg)
    {
    Tecnologia tecnologia = itecnologiaservice.findTecnologia(id);

            tecnologia.setNombre(nuevoNombre);
            tecnologia.setConocimiento(nuevoConocimiento);
            tecnologia.setImg(nuevoImg);

            itecnologiaservice.saveTecnologia(tecnologia);
            return tecnologia;
    }*/
    
      @PutMapping({"tecnologia/editar/{id}"})
    public Tecnologia edit (@PathVariable int id,
                          @RequestBody Tecnologia tecnologia){
    tecnologia.setId(id);
     itecnologiaservice.saveTecnologia(tecnologia);
    return tecnologia;
    }
       @GetMapping("tecnologia/traer/{id}")
    public Tecnologia findTecnologia(@PathVariable Integer id){
    return itecnologiaservice.findTecnologia(id);
    }
    
}

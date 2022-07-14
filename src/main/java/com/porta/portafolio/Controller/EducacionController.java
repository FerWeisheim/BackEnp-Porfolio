/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Educacion;
import com.porta.portafolio.Interface.IEducacionService;
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
@CrossOrigin(origins = "*")
public class EducacionController {
    @Autowired
    IEducacionService  ieducacionservice;
    
    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion()
    {
        return ieducacionservice.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public void crearEducacion(@RequestBody Educacion educacion)
    {
        ieducacionservice.saveEducacion(educacion);
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public void deleteEducacion(@PathVariable Integer id)
    {
        ieducacionservice.deleteEducacion(id);
    }
    @PutMapping({"educacion/editar/{id}"})
    public Educacion edit (@PathVariable int id,
                          @RequestBody Educacion educacion){
    educacion.setId(id);
     ieducacionservice.saveEducacion(educacion);
    return educacion;
    }
    @GetMapping("educacion/traer/{id}")
    public Educacion findEducacion(@PathVariable Integer id)
    {
    return ieducacionservice.findEducacion(id);
    }
}

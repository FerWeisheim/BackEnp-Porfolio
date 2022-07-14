/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.SobreMi;
import com.porta.portafolio.Interface.ISobreMiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
public class SobreMiController {
    @Autowired
    ISobreMiService isobremi;
    //@PreAuthorize("hasRol('ADMIN')")
    @GetMapping("sobremi/traer")
    public List<SobreMi> getSobreMi(){
        return isobremi.getSobreMi();
    }
    
    @PostMapping("sobremi/crear")
    public void crearSobreMi(@RequestBody SobreMi sobremi){
        isobremi.saveSobreMi(sobremi);
    }
    
    @DeleteMapping("sobremi/borrar/{id}")
    public void deleteSobremi(@PathVariable Integer id){
    isobremi.deleteSobreMi(id);
    }
    
    @PutMapping("sobremi/editar/{id}")
    public SobreMi editSobreMi(@PathVariable int id,
                              @RequestBody SobreMi sobremi){
    sobremi.setId(id);
    isobremi.saveSobreMi(sobremi);
    return sobremi;
    }
    
    @GetMapping("sobremi/traer/{id}")
    public SobreMi findSobreMi(@PathVariable int id){
    return isobremi.findSobreMi(id);
    }
}

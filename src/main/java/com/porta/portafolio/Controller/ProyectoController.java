/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Proyecto;
import com.porta.portafolio.Interface.IPersonaService;
import com.porta.portafolio.Interface.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
public class ProyectoController {
      @Autowired    IProyectoService iproyectoservice;
    
    @GetMapping("proyecto/traer")
    public List<Proyecto> getProyecto()
    {
        return iproyectoservice.GetProyecto();
    }

    @PostMapping("proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto)
    {
    iproyectoservice.saveProyecto(proyecto);
            return "El proyecto fue creado";
    }
    
    
    @DeleteMapping("proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Integer id){
        iproyectoservice.deleteProyecto(id);
        return "el proyecto fue borrado";
        
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Integer id,
                               @RequestParam("proyecto") String nuevoProyecto,
                               @RequestParam("descripcion") String nuevoDescripcion,
                               @RequestParam("urlSourceCode") String nuevoUrlSoucerCode)
    {
    Proyecto proyecto = iproyectoservice.findProyecto(id);

            proyecto.setProyecto(nuevoProyecto);
            proyecto.setDescripcion(nuevoDescripcion);
            proyecto.setUrlSourceCode(nuevoUrlSoucerCode);

            iproyectoservice.saveProyecto(proyecto);
            return proyecto;
    }
    
}

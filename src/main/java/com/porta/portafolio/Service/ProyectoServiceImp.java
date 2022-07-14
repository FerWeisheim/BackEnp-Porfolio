/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;


import com.porta.portafolio.Entity.Proyecto;
import com.porta.portafolio.Interface.IProyectoService;
import com.porta.portafolio.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class ProyectoServiceImp implements IProyectoService{
    
    @Autowired
    IProyectoRepository iproyectoService;
        
    
    
    @Override
    public List<Proyecto> GetProyecto() {
        List<Proyecto> proyecto = iproyectoService.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iproyectoService.save(proyecto);
    }

    @Override
    public void deleteProyecto(Integer id) {
        iproyectoService.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Integer id) {
        Proyecto proyecto = iproyectoService.findById(id).orElse(null);
        return proyecto;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.Educacion;
import com.porta.portafolio.Interface.IEducacionService;
import com.porta.portafolio.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class EducacionServiceImp implements IEducacionService{
    
    @Autowired
    IEducacionRepository ieducacionrepository;
    
     @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionrepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionrepository.save(educacion);
    }
   
    @Override
    public void deleteEducacion(Integer id) {
        ieducacionrepository.deleteById(id);
    }
    

    @Override
    public Educacion findEducacion(Integer id) {
        Educacion educacion= ieducacionrepository.findById(id).orElse(null);
        return educacion;
    }

   
}

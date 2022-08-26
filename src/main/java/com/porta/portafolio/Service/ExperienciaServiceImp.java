/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.Experiencia;
import com.porta.portafolio.Interface.IExperienciaService;
import com.porta.portafolio.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class ExperienciaServiceImp implements IExperienciaService{
    
    @Autowired
    IExperienciaRepository iexperienciarepository;
    
    @Override
    public List<Experiencia> getExperiencia(){
    
        List<Experiencia> experiencia = iexperienciarepository.findAll();
        return experiencia;
        
    }
    
    @Override
    public void saveExperiencia(Experiencia experiencia){
        iexperienciarepository.save(experiencia);
    }
    @Override
    public void deleteExperiencia(Integer id){
        iexperienciarepository.deleteById(id);
    }
    @Override
    public Experiencia findExperiencia(Integer id){
        Experiencia experiencia =iexperienciarepository.findById(id).orElse(null);
        return experiencia;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.Tecnologia;
import com.porta.portafolio.Interface.ITecnologiaService;
import com.porta.portafolio.Repository.ITecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class TecnologiaServiceImp implements ITecnologiaService {
    @Autowired
    ITecnologiaRepository  itecnologiaRepository;
    
    @Override
    public List<Tecnologia> GetTecnologia(){
        List<Tecnologia> tecnologia=itecnologiaRepository.findAll();
        return tecnologia;
    }
    
    @Override
    public void saveTecnologia(Tecnologia tecnologia){
         itecnologiaRepository.save(tecnologia);
    }
    @Override
    public void deleteTecnologia(Integer id){ 
       itecnologiaRepository.deleteById(id);
    }
    
    @Override
    public Tecnologia findTecnologia(Integer id){
     Tecnologia tecnologia=itecnologiaRepository.findById(id).orElse(null);
           return tecnologia;
    }
}

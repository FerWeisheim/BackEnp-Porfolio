/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.Tecnologia;
import com.porta.portafolio.Entity.TecnologiaBack;
import com.porta.portafolio.Interface.ITecnologiaBackService;
import com.porta.portafolio.Interface.ITecnologiaService;
import com.porta.portafolio.Repository.ITecnologiaBackRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class TecnologiaBackServiceImp implements ITecnologiaBackService{
    @Autowired
    ITecnologiaBackRepository itecnologiabackrepository;
    
    @Override
    public List<TecnologiaBack> GetTecnologiaBack(){
        List<TecnologiaBack> tecnologiaback=itecnologiabackrepository.findAll();
        return tecnologiaback;
    }
    @Override
    public void saveTecnologiaBack(TecnologiaBack tecnologia){
         itecnologiabackrepository.save(tecnologia);
    }
    @Override
    public void deleteTecnologiaBack(Integer id){ 
       itecnologiabackrepository.deleteById(id);
    }
    
    @Override
    public TecnologiaBack findTecnologiaBack(Integer id){
     TecnologiaBack tecnologiaback=itecnologiabackrepository.findById(id).orElse(null);
           return tecnologiaback;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.TecnologiaSoft;
import com.porta.portafolio.Interface.ITecnologiaSoftService;
import com.porta.portafolio.Repository.ITecnologiaSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class TecnologiaSoftServiceImp implements ITecnologiaSoftService{
    
    
    @Autowired
    ITecnologiaSoftRepository itecnologiasoftre;
    
    @Override
    public List<TecnologiaSoft> GetTecnologiaSoft(){
        List<TecnologiaSoft> tecnologiasoft=itecnologiasoftre.findAll();
          return tecnologiasoft;
    }
    @Override
    public void saveTecnologiaSoft(TecnologiaSoft tecnologiasoft){
        itecnologiasoftre.save(tecnologiasoft);
    }
    @Override
    public void deleteTecnologiaSoft(Integer id){
        itecnologiasoftre.deleteById(id);
    }
    
    @Override
    public TecnologiaSoft findTecnologiaSoft(Integer id){
        TecnologiaSoft tecnologiasoft=itecnologiasoftre.findById(id).orElse(null);
        return tecnologiasoft;
    }
    
}

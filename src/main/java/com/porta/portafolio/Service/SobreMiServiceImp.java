/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.SobreMi;
import com.porta.portafolio.Interface.ISobreMiService;
import com.porta.portafolio.Repository.ISobreMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class SobreMiServiceImp implements ISobreMiService{
    @Autowired
    ISobreMiRepository isobremi;
    @Override
    public List<SobreMi> getSobreMi(){
        List<SobreMi> sobremi = isobremi.findAll();
        return sobremi;
    }
    
    @Override
    public void saveSobreMi(SobreMi sobremi){
        isobremi.save(sobremi);
    }
    @Override
    public void deleteSobreMi(Integer id){
        isobremi.deleteById(id);
    }
    @Override
    public SobreMi findSobreMi(Integer id){
        SobreMi sobremi= isobremi.findById(id).orElse(null);
     return sobremi;
    }
    
}

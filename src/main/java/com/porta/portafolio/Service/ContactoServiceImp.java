/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.Contacto;
import com.porta.portafolio.Interface.IContactoService;
import com.porta.portafolio.Repository.IContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
public class ContactoServiceImp implements IContactoService{
    
    @Autowired
    IContactoRepository icontactorepository;
    
     @Override
    public List<Contacto> getContacto() {
        List<Contacto> contacto = icontactorepository.findAll();
        return contacto;
    }

    @Override
    public void saveContacto(Contacto contacto) {
        icontactorepository.save(contacto);
    }
   
    @Override
    public void deleteContacto(Integer id) {
        icontactorepository.deleteById(id);
    }
    

    @Override
    public Contacto findContacto(Integer id) {
        Contacto contacto = icontactorepository.findById(id).orElse(null);
        return contacto;
    }

 
    
}

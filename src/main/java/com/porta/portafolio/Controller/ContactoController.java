/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Contacto;
import com.porta.portafolio.Interface.IContactoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "*")
@RestController
public class ContactoController {
    @Autowired
    
    IContactoService icontactoservice;
  
@GetMapping("/contacto/traer")
    public List<Contacto> getContacto()
    {
        return icontactoservice.getContacto();
    }

    @PostMapping("/contacto/crear")
    public void createContacto(@RequestBody Contacto contacto)
    {
    icontactoservice.saveContacto(contacto);
           
    }

    @DeleteMapping("/contacto/borrar/{id}")
    public void deleteContacto(@PathVariable Integer id){
    icontactoservice.deleteContacto(id);
    }


    @PutMapping({"contacto/editar/{id}"})
    public Contacto edit (@PathVariable int id,
                          @RequestBody Contacto contacto){
    contacto.setId(id);
     icontactoservice.saveContacto(contacto);
    return contacto;
    }
  
    
    @GetMapping("contacto/traer/perfil/{id}")
    public Contacto findContacto(@PathVariable Integer id){
    return icontactoservice.findContacto(id);
    }
    
}

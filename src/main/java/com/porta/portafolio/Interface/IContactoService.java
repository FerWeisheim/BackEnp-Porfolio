/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Contacto;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface IContactoService {
    public List<Contacto> getContacto();          //Guardar un objeto de tipo Persona    
    public void saveContacto (Contacto contacto);          //Eliminar un objeto pero por la ID    
    public void deleteContacto(Integer id);          //Buscar una persona   
    public Contacto findContacto(Integer id);      
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

/**
 *
 * @author ferna
 */
import com.porta.portafolio.Entity.Persona;
import java.util.List;

public interface IPersonaService {     //Trae una lista de personas    
    public List<Persona> GetPersona();          //Guardar un objeto de tipo Persona    
    public void savePersona (Persona persona);          //Eliminar un objeto pero por la ID    
    public void deletePersona(Integer id);          //Buscar una persona   
    public Persona findPersona(Integer id);      
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Controller;

/**
 *
 * @author ferna
 */
import com.porta.portafolio.Entity.Persona;
import com.porta.portafolio.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PersonaController {

    @Autowired    IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona()
    {
        return ipersonaService.GetPersona();
    }

    @PostMapping("persona/crear")
    public void createPersona(@RequestBody Persona persona)
    {
    ipersonaService.savePersona(persona);
            }

    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Integer id){
    ipersonaService.deletePersona(id);
    return "La persona BORRADA";
    }

   @PutMapping({"persona/editar/{id}"})
    public Persona edit (@PathVariable int id,
                          @RequestBody Persona persona){
    persona.setId(id);
     ipersonaService.savePersona(persona);
    return persona;
    }
   
         @GetMapping("persona/traer/{id}")
    public Persona findPersona(@PathVariable Integer id){
    return ipersonaService.findPersona(id);
    }
    
}
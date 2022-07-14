/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ferna
 */

@Getter
@Setter
@Entity
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min=1,max=50,message = "no se puede cargar")
    private String nombre;
    

    @NotNull
    @Size(min=1,max=100,message = "no se puede cargar")
    private int nivel;
    
    @NotNull
    @Size(min=1,max=100,message = "no se puede cargar")
    private String img;
}

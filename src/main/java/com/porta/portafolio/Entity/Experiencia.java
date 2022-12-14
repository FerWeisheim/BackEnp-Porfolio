/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.Entity;

import java.util.Date;
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
@Entity
@Setter
@Getter
public class Experiencia {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
  
    @NotNull
    @Size(min = 1, max = 500, message = "no se puede cargar mas")
    private String empresa;

    @NotNull
    @Size(min = 1, max = 500, message = "no se puede cargar mas")
    private String puesto;

    @NotNull
    @Size(min = 1, max = 500, message = "no se puede cargar mas")
    private String descripcion;

    @NotNull
    @Size(min = 1, max = 500, message = "no se puede cargar mas")
    private String fechaIni;

    @NotNull
    @Size(min = 1, max = 500, message = "no se puede cargar mas")
    private String fechaFin;
    
}

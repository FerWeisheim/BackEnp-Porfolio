/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Educacion;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface IEducacionService {
    public List<Educacion> getEducacion();
    public void saveEducacion(Educacion educacion);
    public void deleteEducacion(Integer id);
    public Educacion findEducacion(Integer id);
}   

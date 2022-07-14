/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Proyecto;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface IProyectoService {
    
    public List<Proyecto> GetProyecto();
    public void saveProyecto (Proyecto proyecto);
    public void deleteProyecto (Integer id);
    public Proyecto findProyecto(Integer id);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Tecnologia;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface ITecnologiaService {
    public List<Tecnologia> GetTecnologia();
    public void saveTecnologia(Tecnologia tecnologia);
    public void deleteTecnologia(Integer id);
    public Tecnologia findTecnologia(Integer id);
}

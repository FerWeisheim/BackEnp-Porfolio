/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.TecnologiaBack;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface ITecnologiaBackService {
     public List<TecnologiaBack> GetTecnologiaBack();
    public void saveTecnologiaBack(TecnologiaBack tecnologiaback);
    public void deleteTecnologiaBack(Integer id);
    public TecnologiaBack findTecnologiaBack(Integer id);
}

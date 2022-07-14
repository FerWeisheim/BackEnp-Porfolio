/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.TecnologiaSoft;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface ITecnologiaSoftService {
    public List<TecnologiaSoft> GetTecnologiaSoft();
    public void saveTecnologiaSoft(TecnologiaSoft tecnologiasoft);
    public void deleteTecnologiaSoft(Integer id);
    public TecnologiaSoft findTecnologiaSoft(Integer id);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.SobreMi;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface ISobreMiService {
    public List<SobreMi> getSobreMi();
    public void saveSobreMi(SobreMi sobremi);
    public void deleteSobreMi(Integer id);
    public SobreMi findSobreMi(Integer id);
}

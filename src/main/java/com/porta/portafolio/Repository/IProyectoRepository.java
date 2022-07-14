/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Repository;

import com.porta.portafolio.Entity.Contacto;
import com.porta.portafolio.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ferna
 */
@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Integer>{
    
}

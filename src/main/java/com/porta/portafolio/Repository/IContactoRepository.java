/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porta.portafolio.Repository;

import com.porta.portafolio.Entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ferna
 */
public interface IContactoRepository extends JpaRepository<Contacto, Integer>{
    
}

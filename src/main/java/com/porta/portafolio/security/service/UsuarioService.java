/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porta.portafolio.security.service;


import com.porta.portafolio.security.entity.Usuario;
import com.porta.portafolio.security.repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferna
 */
@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
  public Optional<Usuario> getByNombreUsuario(String nombre_usuario){
        return usuarioRepository.findByNombreUsuario(nombre_usuario);
    }

    public boolean existsByNombreUsuario(String nombre_usuario){
        return usuarioRepository.existsByNombreUsuario(nombre_usuario);
    }

    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}

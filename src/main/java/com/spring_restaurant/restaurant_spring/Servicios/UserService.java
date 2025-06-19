package com.spring_restaurant.restaurant_spring.Servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring_restaurant.restaurant_spring.DTO.UsuarioRegistroDTO;
import com.spring_restaurant.restaurant_spring.Entidades.Usuario;
import com.spring_restaurant.restaurant_spring.Repositorios.UsuarioRepositorio;

@Service
public class UserService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public Usuario registrarNuevoUsuario(UsuarioRegistroDTO registroDTO) {
        if (usuarioRepositorio.existsByCorreo(registroDTO.getCorreo())) {
            throw new RuntimeException("El correo electrónico ya está en uso");
        }

        Usuario usuario = new Usuario();
        usuario.setNombre(registroDTO.getNombre());
        usuario.setCorreo(registroDTO.getCorreo());
        usuario.setPassword(passwordEncoder.encode(registroDTO.getPassword()));
        usuario.setDireccion(registroDTO.getDireccion());

        return usuarioRepositorio.save(usuario);
    }


    @Transactional(readOnly = true)
    public Optional<Usuario> buscarPorCorreo(String correo) {
        return usuarioRepositorio.findByCorreo(correo);
    }

    @Transactional(readOnly = true)
    public boolean existePorCorreo(String correo) {
        return usuarioRepositorio.existsByCorreo(correo);
    }
}

package com.spring_restaurant.restaurant_spring.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring_restaurant.restaurant_spring.DTO.UsuarioRegistroDTO;
import com.spring_restaurant.restaurant_spring.Entidades.Producto;
import com.spring_restaurant.restaurant_spring.Entidades.Usuario;
import com.spring_restaurant.restaurant_spring.Repositorios.Repo_producto;
import com.spring_restaurant.restaurant_spring.Servicios.UserService;

@Controller
public class UsuarioController {
    @Autowired
    private Repo_producto productoRepositorio;

    @Autowired
    private UserService usuarioService;

    // Redirige "/" a login
    @GetMapping("/")
    public String redireccionInicial() {
        return "redirect:/login";
    }

    // Mostrar formulario de login
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    // Mostrar formulario de registro
    @GetMapping("/registrar")
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new UsuarioRegistroDTO());
        return "registrar";
    }

    // Procesar registro y redirigir a detalles
    @PostMapping("/registrar")
    public String registrarUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
        usuarioService.registrarNuevoUsuario(registroDTO);
        return "redirect:/login";
    }

    // Mostrar página details
    
    @GetMapping("/details")
    public String mostrarDetails(Model model, Principal principal) {
        String correo = principal.getName();
        Usuario usuario = usuarioService.buscarPorCorreo(correo).orElse(null);
        model.addAttribute("usuario", usuario);

        List<Producto> listaDeProductos = productoRepositorio.findAll();
        model.addAttribute("productos", listaDeProductos);

        return "details";
}
    // Después de login (configurado en SecurityConfig)
    @PostMapping("/login_success")
    public String loginSuccess() {
        return "redirect:/details";
    }
}

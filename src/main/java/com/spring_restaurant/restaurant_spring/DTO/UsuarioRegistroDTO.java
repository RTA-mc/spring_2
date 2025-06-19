package com.spring_restaurant.restaurant_spring.DTO;

public class UsuarioRegistroDTO {
    private String nombre;
    private String correo;
    private String password;
    private String direccion;

    // Constructores
    public UsuarioRegistroDTO() {}

    public UsuarioRegistroDTO(String nombre, String correo, String password, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
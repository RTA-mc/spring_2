package com.spring_restaurant.restaurant_spring.DTO;

public class LoginDTO {
    private String correo;
    private String password;

    // Constructor vacío necesario para Spring
    public LoginDTO() {}

    // Constructor con parámetros
    public LoginDTO(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }

    // Getters y Setters
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
}
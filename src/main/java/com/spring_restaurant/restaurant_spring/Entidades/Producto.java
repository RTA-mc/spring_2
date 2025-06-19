package com.spring_restaurant.restaurant_spring.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String descripcion;
    private double precio;

    @Column(name="categorias")
    private String categorias;
    
    public Producto() {
    }
    public Producto(Long id, String nombre, String descripcion, double precio, String categorias) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id = id;
        this.categorias = categorias;
    }   
    public String getCategorias() {
        return categorias;
    }
    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "[id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
                + "]";
    }
    
}

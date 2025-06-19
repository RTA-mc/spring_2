package com.spring_restaurant.restaurant_spring.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_restaurant.restaurant_spring.Entidades.Producto;




public interface  Repo_producto extends JpaRepository<Producto, Long> {
    List<Producto> findAllByIdIn(List<Long> ids);

}

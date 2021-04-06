package com.dam2t.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam2t.model.Producto;

public interface ProductoDao extends JpaRepository<Producto,Integer>{

}

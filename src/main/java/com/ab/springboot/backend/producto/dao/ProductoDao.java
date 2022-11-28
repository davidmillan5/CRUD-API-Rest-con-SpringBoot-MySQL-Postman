package com.ab.springboot.backend.producto.dao;

import org.springframework.data.repository.CrudRepository;

import com.ab.springboot.backend.producto.model.Producto;

public interface ProductoDao extends CrudRepository<Producto,Integer> {

}

package com.ab.springboot.backend.producto.service;

import java.util.List;

import com.ab.springboot.backend.producto.model.Producto;

public interface ProductoService {
	
	//Metodos a utilizar
	
	
	public Producto save(Producto producto);
	
	public void delete(Integer id);
	
	public Producto findById(Integer id);
	
	public List<Producto> findAll();
}

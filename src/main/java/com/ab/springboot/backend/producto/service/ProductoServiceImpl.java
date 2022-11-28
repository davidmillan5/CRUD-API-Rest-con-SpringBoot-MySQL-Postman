package com.ab.springboot.backend.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ab.springboot.backend.producto.dao.ProductoDao;
import com.ab.springboot.backend.producto.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	
	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = false)
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productoDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Integer id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll() ;
	}
	
	
	
	
}

package com.ab.springboot.backend.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.springboot.backend.producto.model.Producto;
import com.ab.springboot.backend.producto.service.ProductoService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@PostMapping("/productos")
	public Producto save(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@GetMapping("/productos")
	public List<Producto> productos(){
		return productoService.findAll();
	}
	
	@GetMapping("/productos/{id}")
	public Producto mostrar(@PathVariable Integer id) {
		return productoService.findById(id);
	}
	
	@PutMapping("/productos/{id}")
	public Producto update(@RequestBody Producto producto, @PathVariable Integer id) {
		
		Producto productoActual = productoService.findById(id);
		
		productoActual.setNombre(producto.getNombre());
		productoActual.setDescripcion(producto.getDescripcion());
		productoActual.setPrecio(producto.getPrecio());
		productoActual.setStock(producto.getStock());
		
		return productoService.save(productoActual);
	}
	
	
	@DeleteMapping("productos/{id}")
	public void delete(@PathVariable Integer id) {
		productoService.delete(id);
	}
	
}

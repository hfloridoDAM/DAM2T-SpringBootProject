package com.dam2t.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dam2t.dao.ProductoDao;
import com.dam2t.model.Producto;

@RestController
@RequestMapping("personas")
public class PersonaApi {
	
	@Autowired
	private ProductoDao productoDao;
	
	@PostMapping("/save")
	public void saveProducto(@RequestBody Producto producto) {
		productoDao.save(producto);
	}
	
	@GetMapping("/{id}")
	public Optional<Producto> getProductos(@PathVariable("id")  Integer id) {
		return productoDao.findById(id);
	}
	
	@GetMapping("")
	public List<Producto> getAll() {
		return productoDao.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void removeById(@PathVariable("id") Integer id) {
		productoDao.deleteById(id);
	}
}
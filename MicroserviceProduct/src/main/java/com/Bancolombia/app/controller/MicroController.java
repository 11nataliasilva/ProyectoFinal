package com.Bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bancolombia.app.entities.Articulo;
import com.Bancolombia.app.services.IService;

@RestController
@RequestMapping("/articulo")
public class MicroController {
	@Autowired
	private IService servicio;
	
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody Articulo articulo){
		
		if(servicio.insert(articulo))
			return new ResponseEntity<String>("OK", HttpStatus.CREATED);
		
		return new ResponseEntity<String>("Not OK", HttpStatus.BAD_REQUEST);	
	}
	
	@GetMapping
	public ResponseEntity<List<Articulo>> get(){
		return new ResponseEntity<List<Articulo>>(servicio.getAll(), HttpStatus.OK);
	}
	
}



package com.Bancolombia.app.services;

import java.util.List;

import com.Bancolombia.app.entities.Articulo;

public interface IService {
		
	boolean insert(Articulo articulo);
	List<Articulo> getAll();
	
}
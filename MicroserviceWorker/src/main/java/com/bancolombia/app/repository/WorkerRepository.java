package com.bancolombia.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bancolombia.app.entities.Worker;

@Component
public class WorkerRepository {
	private List<Worker> repositorio= new ArrayList<>();
	
	public boolean insert(Worker worker) {
		return repositorio.add(worker);
	}
	
	public List<Worker> getAll(){
	   return repositorio;	
	}
	
	public Worker findById(long id) {
		return repositorio.stream()
				.filter(t->t.getId()==id)
				.findFirst()
				.orElseThrow();
	}

}

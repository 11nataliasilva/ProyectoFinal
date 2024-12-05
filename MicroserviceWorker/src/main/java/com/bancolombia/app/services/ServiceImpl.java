package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.entities.Worker;
import com.bancolombia.app.repository.WorkerRepository;

@Service
public class ServiceImpl implements IService {
	
	@Autowired
	private WorkerRepository dao;

	@Override
	public boolean insert(Worker worker) {
		if(dao.insert(worker)) {
		   return true;
		}
		
		return false;
	}

	@Override
	public Worker findById(long id) {
		return dao.findById(id);
				
	}

	@Override
	public List<Worker> getAll() {
		return dao.getAll();
	}

}
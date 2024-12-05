package com.bancolombia.app.entities;


public class Worker {
	private long id;
	private String name;
	private String position;
	private Double salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return position;
	}
	public void setEmail(String position) {
		this.position = position;
	}
	public Double getAddress() {
		return salary;
	}
	public void setAddress(Double salary) {
		this.salary = salary;
	}

}

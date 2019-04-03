package com.fdmgroup.interfaces;

public class Passenger {

	private String name;

	public void travel(Vehicle vehicle){
		System.out.println(name+" is boarding the vehicle...");
		vehicle.accelerate();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

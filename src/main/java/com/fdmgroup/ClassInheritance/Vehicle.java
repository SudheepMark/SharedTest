package com.fdmgroup.ClassInheritance;

public abstract class Vehicle {

	private double maxSpeed;

	public void move() {
		System.out.println("Vehicle is moving...");
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}

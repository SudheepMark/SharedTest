package com.fdmgroup.ClassInheritance;

import java.util.ArrayList;

public class VehicleRunner {

	public static void main(String[] args) {
		
		//Vehicle vehicle = new Vehicle();
		
		Car car = new Car();
		Plane plane = new Plane();
		Boat boat = new Boat();
		
		
		//ArrayList of Abstract class Vehicle can add any type of Vehicle 
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(plane);
		vehicles.add(boat);
		
		// down casting from vehicle to car
		Car car2 = (Car) vehicles.get(0);
		
		//for-each loop to iterate
		for(Vehicle vehicle: vehicles){
			//if ArrayList contains car object
			if(vehicle instanceof Car){
				Car car3 = (Car) vehicle;
				car3.brake();
			}
			if(vehicle instanceof Plane){
				Plane plane2 = (Plane) vehicle;
				plane2.takeOff();
			}if(vehicle instanceof Boat){
				Boat boat2 = (Boat) vehicle;
				boat2.dropEngine();
			}
		}
		

	}

}

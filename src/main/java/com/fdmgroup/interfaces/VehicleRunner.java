package com.fdmgroup.interfaces;

import java.util.ArrayList;

public class VehicleRunner {

	public static void main(String[] args) {

		Car car = new Car();
		Plane plane = new Plane();
		Boat boat = new Boat();

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		vehicles.add(car);
		vehicles.add(plane);
		vehicles.add(boat);

		Passenger passenger1 = new Passenger();
		Passenger passenger2 = new Passenger();
		passenger1.setName("Sudheep");
		passenger2.setName("Jose");

		passenger1.travel(boat);
		passenger2.travel(plane);

		for (Vehicle vehicle : vehicles) {
			vehicle.accelerate();

		}

	}

}

package objectsAndClassesAnswers;

import java.util.List;

public class BusRunner {

	public static void main(String[] args) {
		Passenger passenger1 = new Passenger("passenger1",true,0.50);
		Passenger passenger2 = new Passenger("passenger2",false,0.50);
		Passenger passenger3 = new Passenger("passenger3",false,5.50);
		Passenger passenger4 = new Passenger("passenger4",true,20.00);
		Passenger passenger5 = new Passenger("passenger5",true,13.20);
		Passenger passenger6 = new Passenger("passenger6",false,1.50);
		Passenger passenger7 = new Passenger("passenger7",true,10.50);
		Passenger passenger8 = new Passenger("passenger8",true,18.50);
		Passenger passenger9 = new Passenger("passenger9",true,7.50);
		Passenger passenger10 = new Passenger("passenger10",true,3.50);
		
		Bus bus = new Bus("AB12CDE",8,1.20);
		
		bus.getOn(passenger1);
		bus.getOn(passenger2);
		bus.getOn(passenger3);
		bus.getOn(passenger4);
		bus.getOn(passenger5);
		bus.getOn(passenger6);
		bus.getOn(passenger7);
		bus.getOn(passenger8);
		bus.getOn(passenger9);
		bus.getOn(passenger10);
		
		List<Passenger> passengers = bus.getAllPassengers();
		
		// check that all passengers except passenger 2 and passenger 10 have boarded
		System.out.println("passengers who have boarded:");
		for (Passenger passenger : passengers) {
			System.out.println(passenger.getName());
		}
		
		bus.getoff(passenger5);
		
		passengers = bus.getAllPassengers();
		
		// check that all passengers except passengers 2, 5 & 10 are on the bus after passenger 5 has got off
		System.out.println("\npassengers still on the bus after passenger 5 has got off:");
		
		for (Passenger passenger : passengers) {
			System.out.println(passenger.getName());
		}
	}
	
}

package objectsAndClassesAnswers;

import java.util.ArrayList;
import java.util.List;

public class Bus {

	private final String registration;
	private final int capacity;
	private double fare;
	private List<Passenger> passengers = new ArrayList<Passenger>();

	public Bus(String registration, int capacity, double fare) {
		this.registration = registration;
		this.capacity = capacity;
		this.fare = fare;
	}
	
	public void getOn(Passenger passenger) {
		if (passengers.size() < capacity && (passenger.hasTravelPass() || passenger.getMoney() >= fare)) {
				passengers.add(passenger);
		}
	}
	
	public void getoff(Passenger passenger) {
		passengers.remove(passenger);
	}
	
	public List<Passenger> getAllPassengers(){
		return passengers;
	}

	public String getRegistration() {
		return registration;
	}
	public int getCapacity() {
		return capacity;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
}

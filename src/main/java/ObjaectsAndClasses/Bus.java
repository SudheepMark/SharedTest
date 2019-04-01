package ObjaectsAndClasses;

import java.util.ArrayList;

public class Bus {
	private final int registrationNumber;
	private ArrayList <Passenger> passengers = new ArrayList <Passenger>();
	private final int capacity;
	private int fare;
	private static int numberOfPassengers;
	
	
	public Bus(int registrationNumber, int capacity, int fare) {
		
		this.registrationNumber = registrationNumber;	
		this.capacity = capacity;
		this.fare = fare;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void addPassenger(Passenger passenger) {
		if (this.numberOfPassengers < this.capacity) {
			
			if(passenger.getPayment().equals("TravelCard"))
			{
				this.passengers.add(passenger);
				numberOfPassengers++;
				System.out.println("Passenger "+passenger.getName()+ " has entered.");
			}else if(passenger.getCash() >= this.fare){
					this.passengers.add(passenger);
					numberOfPassengers++;
					passenger.setCash(passenger.getCash()-this.fare);
					System.out.println("Passenger "+passenger.getName()+ " has entered.");
					}else {
						System.out.println("Passenger "+passenger.getName()+ " has not entered.");
					}
		}else 
		System.out.println("Bus is Full. "+passenger.getName()+" Passenger cannot enter.");
	}
	
	public void removePassenger(Passenger name) {
		System.out.println(name.getName()+" Passenger has exited.");
		passengers.remove(name);
		numberOfPassengers--;
				
			}
		
	
	public ArrayList<Passenger> getAllPassengers() {
		return passengers;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public int getCapacity() {
		System.out.println("Bus capacity is "+this.capacity);
		return capacity;
	}
	
	

}

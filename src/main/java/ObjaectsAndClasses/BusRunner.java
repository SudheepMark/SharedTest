package ObjaectsAndClasses;

public class BusRunner {

	public static void main(String[] args) {
		Passenger passenger1 = new Passenger("Wil", "Cash", 50);
		Passenger passenger2 = new Passenger("Dom", "TravelCard", 10);
		Passenger passenger3 = new Passenger("Michael", "Cash", 20);
		Passenger passenger4 = new Passenger("Sudheep", "TravelCard", 50);
		Passenger passenger5 = new Passenger("Jose", "Cash", 5);
		Passenger passenger6 = new Passenger("Naz", "Cash", 10);
		Passenger passenger7 = new Passenger("Jerin", "TravelCard", 20);
		Bus bus1 = new Bus(321, 5, 10);
		bus1.addPassenger(passenger1);
		bus1.addPassenger(passenger5);
		for (int count = 0; count < bus1.getAllPassengers().size(); count++) {
			System.out.println(bus1.getAllPassengers().get(count).getName());
		}

		bus1.getCapacity();
		bus1.addPassenger(passenger3);
		bus1.addPassenger(passenger2);
		bus1.addPassenger(passenger4);
		bus1.addPassenger(passenger6);
		bus1.addPassenger(passenger7);
		for (int count = 0; count < bus1.getAllPassengers().size(); count++) {
			System.out.println(bus1.getAllPassengers().get(count).getName());
		}
		bus1.removePassenger(passenger6);
		for (int count = 0; count < bus1.getAllPassengers().size(); count++) {
			System.out.println(bus1.getAllPassengers().get(count).getName());
		}
		// bus1.addPassenger(passenger7);

	}

}

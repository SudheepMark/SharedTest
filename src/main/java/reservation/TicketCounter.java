package reservation;

public class TicketCounter {
	
	private int availableTickets = 3;
	
	public synchronized void bookTickets(String name, int numberOfTickets){
		if (availableTickets >= numberOfTickets && availableTickets > 0){
			System.out.println("Congratulations "+name+" you've bought "+numberOfTickets+" tickets");
			availableTickets -= numberOfTickets;
		} else {
			System.out.println("Sorry "+name+" there are no tickets available");
		}
		
	}

}

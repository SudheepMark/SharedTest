package reservation;

public class TicketBookingThread extends Thread {

	private TicketCounter ticketCounter;
	private String name;
	private int numberOfTickets;
	
	public TicketBookingThread(TicketCounter ticketCounter, String name, int numberOfTickets) {
		super();
		this.ticketCounter = ticketCounter;
		this.name = name;
		this.numberOfTickets = numberOfTickets;
	}
	
	public void run(){
		ticketCounter.bookTickets(name, numberOfTickets);
	}	
	
}


package reservation;

public class Runner {

	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter();
		TicketBookingThread thread1 = new TicketBookingThread(ticketCounter,"Nick",2);
		TicketBookingThread thread2 = new TicketBookingThread(ticketCounter,"Bob",2);
		
		thread1.start();
		thread2.start();
	}

}

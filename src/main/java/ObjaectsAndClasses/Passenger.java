package ObjaectsAndClasses;

public class Passenger {
	
private String name;
private String payment;
private int cash;

public Passenger(String name, String payment, int cash) {
	
	this.name = name;
	this.payment = payment;
	this.cash = cash;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPayment() {
	return payment;
}

public void setPayment(String payment) {
	this.payment = payment;
}

public int getCash() {
	return cash;
}

public void setCash(int cash) {
	this.cash = cash;
}



}

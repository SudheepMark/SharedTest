package com.fdmgroup.observer;

import java.util.Observable;
import java.util.Observer;

public class CreditCard implements Observer{

	private double creditCardRate;

	public double getCreditCardRate() {
		return creditCardRate;
	}

	public void setCreditCardRate(double creditCardRate) {
		this.creditCardRate = creditCardRate;
	}

	public void update(Observable o, Object arg) {
		// arg is the arg passed into notifyObservers()
		// in the Observable class. Needs to be cast
		// to correct type
		creditCardRate = ((Double) arg) * 5;
		System.out.println("updating credit card rate to "+creditCardRate);
	}
	
	
	
}

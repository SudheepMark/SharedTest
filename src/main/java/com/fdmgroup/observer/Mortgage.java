package com.fdmgroup.observer;

import java.util.Observable;
import java.util.Observer;

public class Mortgage implements Observer {

	private double mortgageRate;
	
	public void update(Observable o, Object arg) {
		mortgageRate = ((Double) arg) * 1.5; 		
		System.out.println("updating mortgage rate to "+mortgageRate);
	}

	public double getMortgageRate() {
		return mortgageRate;
	}

	public void setMortgageRate(double mortgageRate) {
		this.mortgageRate = mortgageRate;
	}

}

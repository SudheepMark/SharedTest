package com.fdmgroup.observer;

import java.util.Observable;

public class CentralBank extends Observable {
	
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
		setChanged();  // sets boolean to true indicating
		               // this object has changed
		notifyObservers(interestRate); // calls update method
									   // on each observer class
									   // only works if setChanged()
									   // called first
	}
	
}

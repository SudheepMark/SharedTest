package com.fdmgroup.observer;

import java.util.Observable;
import java.util.Observer;

public class StudentLoan implements Observer{

	private double studentLoanRate;
	
	public void update(Observable o, Object arg) {
		studentLoanRate = ((Double) arg) + 3; 		
		System.out.println("updating student loan rate to "+studentLoanRate);
	}

	public double getStudentLoanRate() {
		return studentLoanRate;
	}

	public void setStudentLoanRate(double studentLoanRate) {
		this.studentLoanRate = studentLoanRate;
	}



}

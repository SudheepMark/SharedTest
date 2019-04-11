package com.fdmgroup.observer;

public class Runner {

	public static void main(String[] args) {
		CentralBank bankOfEngland = new CentralBank();
		
		CreditCard creditCard = new CreditCard();
		StudentLoan studentLoan = new StudentLoan();
		Mortgage mortgage = new Mortgage();
		bankOfEngland.addObserver(creditCard);
		bankOfEngland.addObserver(studentLoan);
		bankOfEngland.addObserver(mortgage);
		
		bankOfEngland.setInterestRate(1.5);


	}

}

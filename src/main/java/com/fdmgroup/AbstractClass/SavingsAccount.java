package com.fdmgroup.AbstractClass;

public class SavingsAccount extends PersonalAccount implements InterestPayingAccount{

	private static double interestRate;

	public SavingsAccount(long accountNumber) {
		super(accountNumber);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		SavingsAccount.interestRate = interestRate;
	}

	public void addinterest() {
		this.setBalance(this.getBalance()+(this.getBalance()*SavingsAccount.interestRate/100));
		
	}

}

package com.fdmgroup.finalKeyword;

public abstract class InterestPayingAccount {

	private int accountNumber;
	private double balance;

	public final void addInterest(double amount){
		double multiplier = 1 + (amount / 100);
		balance *= multiplier;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}

package com.fdmgroup.AbstractClass;

public abstract class Account {

	private final long accountNumber;
	private double balance;

	public Account(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void addFunds(double amount) {
		if(amount > 0){
			this.balance+=amount;
		}
	}

	public double withdrawFunds(double amount) {
		if(amount > 0){
			if(amount <= this.balance){
				this.balance-=amount;
				return amount;
			}
		}
		return 0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

}

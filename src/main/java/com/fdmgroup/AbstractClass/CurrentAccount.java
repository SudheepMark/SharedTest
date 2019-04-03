package com.fdmgroup.AbstractClass;

public class CurrentAccount extends PersonalAccount {

	private double overdraftLimit;
	
	public double withdrawFunds(double amount) {
		if(amount > 0){
			if(amount <= (this.overdraftLimit+this.getBalance())){
				this.setBalance(this.getBalance()-amount);
				return amount;
			}
		}
		return 0;
	}


	public CurrentAccount(long accountNumber) {
		super(accountNumber);
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

}

package com.fdmgroup.AbstractClass;

public class BusinessAccount extends Account implements InterestPayingAccount{

	private BusinessAccountHolder accountHolder;
	private static double interestRate;

	public BusinessAccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(BusinessAccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		BusinessAccount.interestRate = interestRate;
	}

	public BusinessAccount(long accountNumber) {
		super(accountNumber);

	}

	public void addinterest() {
		this.setBalance(this.getBalance()+(this.getBalance()*(BusinessAccount.interestRate/100)));
		
	}

}

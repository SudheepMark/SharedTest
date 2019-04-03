package com.fdmgroup.AbstractClass;

public abstract class PersonalAccount extends Account {

	private PersonalAccountHolder accountHolder;

	public PersonalAccount(long accountNumber) {
		super(accountNumber);
	}

	public PersonalAccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(PersonalAccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

}

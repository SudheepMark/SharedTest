package com.fdmgroup.AbstractClass;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Account> accounts = new ArrayList<Account>();

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public ArrayList<Account> getAllAccounts() {
		return accounts;

	}

	public ArrayList<BusinessAccount> getAllBusinessAccounts() {
		ArrayList<BusinessAccount> businessAccounts = new ArrayList<BusinessAccount>();
		for (Account account : accounts) {
			if (account instanceof BusinessAccount) {
				businessAccounts.add((BusinessAccount) account);
			}
		}
		return businessAccounts;

	}

	public ArrayList<PersonalAccount> getAllPersonalAccounts() {
		ArrayList<PersonalAccount> personalAccounts = new ArrayList<PersonalAccount>();
		for (Account account : accounts) {
			if (account instanceof PersonalAccount) {
				personalAccounts.add((PersonalAccount) account);
			}
		}
		return personalAccounts;

	}

	public ArrayList<InterestPayingAccount> getAllInterestPayingAccounts() {
		ArrayList<InterestPayingAccount> interestPayingAccounts = new ArrayList<InterestPayingAccount>();
		for (Account account : accounts) {
			if (account instanceof InterestPayingAccount) {
				interestPayingAccounts.add((InterestPayingAccount) account);
			}
		}
		return interestPayingAccounts;


	}

	public void updateInterestPayingAccounts() {
		for (Account account : accounts) {
			if (account instanceof InterestPayingAccount) {
				((InterestPayingAccount) account).addinterest();
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

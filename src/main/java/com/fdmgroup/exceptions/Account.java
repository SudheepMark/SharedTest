package com.fdmgroup.exceptions;

public class Account {
	private double balance;

	//throws Exception is marker to say method might throw an Exception
	public void addFund(double amount) throws AccountException{
		
		//code to deliberately throw runtime exception
	//	String[] strings = {"strings"};
	//	System.out.println(strings[1]);
		
		if(amount < 0){
			//method terminates on this line
			throw new AccountException("can't add negative amount");
		}
		balance += amount;
	}

	public void withdraw(double amount) throws AccountException{
		if(amount < 0){
			//method terminates on this line
			throw new AccountException("can't withdraw negative amount");
		}
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

}

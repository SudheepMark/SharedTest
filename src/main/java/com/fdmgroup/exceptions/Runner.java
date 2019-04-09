package com.fdmgroup.exceptions;

public class Runner {

	public static void main(String[] args) {

		Account account = new Account();
		try {
			account.addFund(-100.0);
			System.out.println("funds added sucessfully");
		} catch (AccountException e) {
			System.out.println("running code to handle the problem");
			e.printStackTrace();
		} finally {
			System.out.println("code is ruuning from finally block");
		}
		System.out.println("balance is "+account.getBalance());
	}

}

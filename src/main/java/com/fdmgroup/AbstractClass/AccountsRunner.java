package com.fdmgroup.AbstractClass;

import java.util.ArrayList;


public class AccountsRunner {

	public static void main(String[] args) {

		BusinessAccountHolder businessAccountHolder1 = new BusinessAccountHolder();
		BusinessAccountHolder businessAccountHolder2 = new BusinessAccountHolder();
		PersonalAccountHolder personalAccountHolder1 = new PersonalAccountHolder();
		PersonalAccountHolder personalAccountHolder2 = new PersonalAccountHolder();

		businessAccountHolder1.setName("ABC Computers plc");
		businessAccountHolder1.setId(123);
		businessAccountHolder1.setPostcode("AB1 2CD");
		businessAccountHolder1.setBusinessType("Electronics");
		businessAccountHolder1.setVatNumber(123456);

		businessAccountHolder2.setName("XYZ Cars");
		businessAccountHolder2.setId(456);
		businessAccountHolder2.setPostcode("CD4 5EF");
		businessAccountHolder2.setBusinessType("Car Manufacturer");
		businessAccountHolder2.setVatNumber(987654);

		personalAccountHolder1.setName("John Smith");
		personalAccountHolder1.setId(789);
		personalAccountHolder1.setPostcode("GH5 6KL");
		personalAccountHolder1.setTelephone("01985876123");
		personalAccountHolder1.setNationalInsuranceNumber("CD 12 34 56 E");

		personalAccountHolder2.setName("Jane Jones");
		personalAccountHolder2.setId(987);
		personalAccountHolder2.setPostcode("MN6 7PR");
		personalAccountHolder2.setTelephone("01764986745");
		personalAccountHolder2.setNationalInsuranceNumber("AB 34 56 78 C");

		BusinessAccount businessAccount1 = new BusinessAccount(123456789);
		BusinessAccount businessAccount2 = new BusinessAccount(987654321);
		BusinessAccount businessAccount3 = new BusinessAccount(123454321);

		businessAccount1.addFunds(1500000);
		businessAccount1.setAccountHolder(businessAccountHolder1);
		businessAccount2.addFunds(750000);
		businessAccount2.setAccountHolder(businessAccountHolder1);
		businessAccount3.addFunds(5000000);
		businessAccount3.setAccountHolder(businessAccountHolder2);

		SavingsAccount savingsAccount1 = new SavingsAccount(543212345);
		SavingsAccount savingsAccount2 = new SavingsAccount(987656789);
		CurrentAccount currentAccount1 = new CurrentAccount(857649372);
		CurrentAccount currentAccount2 = new CurrentAccount(375846397);

		savingsAccount1.setBalance(2500);
		savingsAccount1.setAccountHolder(personalAccountHolder1);
		savingsAccount2.setBalance(15000);
		savingsAccount2.setAccountHolder(personalAccountHolder2);
		currentAccount1.setBalance(350.75);
		currentAccount1.setAccountHolder(personalAccountHolder1);
		currentAccount1.setOverdraftLimit(250.0);
		currentAccount2.setBalance(1750.32);
		currentAccount2.setAccountHolder(personalAccountHolder2);
		currentAccount2.setOverdraftLimit(500.0);

		BusinessAccount.setInterestRate(10.0);
		SavingsAccount.setInterestRate(5.0);

		//businessAccount1.addinterest();
		//savingsAccount1.addinterest();
		System.out.println(businessAccount1.getBalance());
		System.out.println(savingsAccount1.getBalance());
		System.out.println(currentAccount1.withdrawFunds(1000.0));
		System.out.println(currentAccount1.withdrawFunds(600.0));

		Bank bank1 = new Bank();
		bank1.setName("FDM Bank");
		bank1.addAccount(businessAccount1);
		bank1.addAccount(businessAccount2);
		bank1.addAccount(businessAccount3);
		bank1.addAccount(savingsAccount1);
		bank1.addAccount(savingsAccount2);
		bank1.addAccount(currentAccount1);
		bank1.addAccount(currentAccount2);
		// ArrayList<Account> allAcounts = new ArrayList<Account>();
		ArrayList<Account> allAcounts = bank1.getAllAccounts();
		for (Account account : allAcounts) {
			System.out.println(account.getAccountNumber());
		}
		ArrayList<PersonalAccount> allPersonalAccounts = bank1.getAllPersonalAccounts();
		for (Account account : allPersonalAccounts) {
			System.out.println(account.getAccountNumber());
		}
		ArrayList<BusinessAccount> allBusinessAccounts = bank1.getAllBusinessAccounts();
		for (Account account : allBusinessAccounts) {
			System.out.println(account.getAccountNumber());
		}
		ArrayList<InterestPayingAccount> allInterestPayingAccounts = bank1.getAllInterestPayingAccounts();
		for (InterestPayingAccount account : allInterestPayingAccounts) {
				if(account instanceof BusinessAccount){
					BusinessAccount businessAccount = (BusinessAccount) account;
			System.out.println(((BusinessAccount) account).getAccountNumber());
		}else if(account instanceof PersonalAccount){
			PersonalAccount personalAccount = (PersonalAccount) account;
			System.out.println(((PersonalAccount) account).getAccountNumber());
			}
		}

		bank1.updateInterestPayingAccounts();
		ArrayList<InterestPayingAccount> allInterestPayingAccounts2 = bank1.getAllInterestPayingAccounts();
		for (InterestPayingAccount account : allInterestPayingAccounts2) {
				if(account instanceof BusinessAccount){
					BusinessAccount businessAccount = (BusinessAccount) account;
			System.out.println(((BusinessAccount) account).getAccountNumber()+" has balance "+((BusinessAccount) account).getBalance());
		}else if(account instanceof PersonalAccount){
			PersonalAccount personalAccount = (PersonalAccount) account;
			System.out.println(((PersonalAccount) account).getAccountNumber()+" has balance "+((PersonalAccount) account).getBalance());
			}
		}

	}

}

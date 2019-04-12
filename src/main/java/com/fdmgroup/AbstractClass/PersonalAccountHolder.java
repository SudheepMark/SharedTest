package com.fdmgroup.AbstractClass;

//child class of abstract class AccountHolder
public class PersonalAccountHolder extends AccountHolder {

	private String nationalInsuranceNumber;

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

}

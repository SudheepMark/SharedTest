package com.fdmgroup.pensions;

public class Client {

	public static void main(String[] args) {
		
		PensionController pensionController1 = new PensionController ();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		person1.setFirstname("John");
		person1.setLastname("Smith");
		person1.setDateOfBirth("28/06/1993");
		person2.setFirstname("Jane");
		person2.setLastname("Doe");
		person2.setDateOfBirth("05/01/1957");
		person3.setFirstname("Fred");
		person3.setLastname("Bloggs");
		person3.setDateOfBirth("12/12/1949");
		Person[] people = {person1, person2, person3};
		pensionController1.handlePensions(people);

	}

}

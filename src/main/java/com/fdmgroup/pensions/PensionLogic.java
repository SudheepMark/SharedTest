package com.fdmgroup.pensions;

public class PensionLogic {
	// Person person = new Person();
	public static boolean isPensionable(Person person, String year) {
		int dateOfBirth = Integer.parseInt(person.getDateOfBirth().substring(6));
		Integer year2 = Integer.valueOf(year);
		if (year2-dateOfBirth>=65) {
			return true;
		} else {
			return false;
		}
	}
}

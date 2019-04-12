package com.fdmgroup.interfaces;

public class ArbitrarySalaryCalculator implements ISalaryCalculator {

	// method from Interface - functionality changed accordingly
	public int calculateSalary(IEmployee iemployee, double increase) {

		if (iemployee.getName().charAt(0) == 'A') {
			int salary = (int) (iemployee.getSalary() + (iemployee.getSalary() * (2 * increase) / 100));
			return salary;
		} else {
			int salary = (int) (iemployee.getSalary() + (iemployee.getSalary() * increase / 100));
			return salary;
		}
	}

}

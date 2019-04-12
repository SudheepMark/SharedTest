package com.fdmgroup.interfaces;

public class EqualSalaryCalculator implements ISalaryCalculator {

	// method from Interface - functionality changed accordingly
	public int calculateSalary(IEmployee iemployee, double increase) {

		int salary = (int) (iemployee.getSalary() + (iemployee.getSalary() * increase / 100));
		return salary;
	}

}

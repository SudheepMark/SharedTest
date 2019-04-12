package com.fdmgroup.interfaces;

public class UnequalSalaryCalculator implements ISalaryCalculator {

	// method from Interface - functionality changed accordingly
	public int calculateSalary(IEmployee iemployee, double increase) {

		if (iemployee.getSalary() < 100000) {
			int salary = (int) (iemployee.getSalary() + (iemployee.getSalary() * increase / 100));
			return salary;
		} else {
			int salary = (int) (iemployee.getSalary() + (iemployee.getSalary() * (5 * increase) / 100));
			return salary;
		}
	}

}

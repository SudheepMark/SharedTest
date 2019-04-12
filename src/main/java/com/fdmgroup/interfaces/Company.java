package com.fdmgroup.interfaces;

import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<IEmployee> employees = new ArrayList<IEmployee>();
	private ISalaryCalculator salaryCalculator;

	public Company(String name, ISalaryCalculator salaryCalculator) {
		this.name = name;
		this.setSalaryCalculator(salaryCalculator);
	}

	public void givePayRise(double increase) {
		
		for (IEmployee employee: employees){
			employee.setSalary(salaryCalculator.calculateSalary(employee, increase));
		}
	}

	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}

	//method returns ArrayList employees
	public ArrayList<IEmployee> getAllEmployees() {

		return employees;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ISalaryCalculator getSalaryCalculator() {
		return salaryCalculator;
	}

	public void setSalaryCalculator(ISalaryCalculator salaryCalculator) {
		this.salaryCalculator = salaryCalculator;
	}

}

package com.fdmgroup.interfaces;

import java.util.ArrayList;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryEmployee factoryemployee1 = new FactoryEmployee();
		FactoryEmployee factoryemployee2 = new FactoryEmployee();
		FactoryEmployee factoryemployee3 = new FactoryEmployee();
		OfficeEmployee officeemployee1 = new OfficeEmployee();
		OfficeEmployee officeemployee2 = new OfficeEmployee();
		OfficeEmployee officeemployee3 = new OfficeEmployee();

		factoryemployee1.setName("Adrian");
		factoryemployee1.setSalary(20000);
		factoryemployee2.setName("Nick");
		factoryemployee2.setSalary(25000);
		factoryemployee3.setName("Kevin");
		factoryemployee3.setSalary(27000);

		officeemployee1.setName("Jo");
		officeemployee1.setSalary(60000);
		officeemployee2.setName("Andy");
		officeemployee2.setSalary(75000);
		officeemployee3.setName("Tim");
		officeemployee3.setSalary(110000);

		ArrayList<IEmployee> employees = new ArrayList<IEmployee>();

		employees.add(officeemployee1);
		employees.add(officeemployee2);
		employees.add(officeemployee3);
		employees.add(factoryemployee1);
		employees.add(factoryemployee2);
		employees.add(factoryemployee3);

		for (IEmployee IEmployee : employees) {
			IEmployee.doWork();

		}
		
		EqualSalaryCalculator equalSalaryCalculator = new EqualSalaryCalculator();
		UnequalSalaryCalculator unequalSalaryCalculator = new UnequalSalaryCalculator();
		ArbitrarySalaryCalculator arbitrarySalaryCalculator = new ArbitrarySalaryCalculator();
		
		System.out.println(equalSalaryCalculator.calculateSalary(officeemployee2, 5.0));
		System.out.println(equalSalaryCalculator.calculateSalary(officeemployee3, 5.0));
		System.out.println(equalSalaryCalculator.calculateSalary(factoryemployee1, 5.0));
		System.out.println(unequalSalaryCalculator.calculateSalary(officeemployee2, 5.0));
		System.out.println(unequalSalaryCalculator.calculateSalary(officeemployee3, 5.0));
		System.out.println(unequalSalaryCalculator.calculateSalary(factoryemployee1, 5.0));
		System.out.println(arbitrarySalaryCalculator.calculateSalary(officeemployee2, 5.0));
		System.out.println(arbitrarySalaryCalculator.calculateSalary(officeemployee3, 5.0));
		System.out.println(arbitrarySalaryCalculator.calculateSalary(factoryemployee1, 5.0));

		Company company1 = new Company("ABC Computers plc", equalSalaryCalculator);
		Company company2 = new Company("XYZ cars", arbitrarySalaryCalculator);
		Company company3 = new Company("123 Manufacturing", unequalSalaryCalculator);
		company1.addEmployee(factoryemployee1);
		company1.addEmployee(officeemployee1);
		company2.addEmployee(factoryemployee2);
		company2.addEmployee(officeemployee2);
		company3.addEmployee(factoryemployee3);
		company3.addEmployee(officeemployee3);
		
		company1.givePayRise(5.0);
		company2.givePayRise(5.0);
		company3.givePayRise(5.0);
		
		ArrayList<IEmployee> employees2 = new ArrayList<IEmployee>();
		ArrayList<IEmployee> employees3 = new ArrayList<IEmployee>();
		ArrayList<IEmployee> employees4 = new ArrayList<IEmployee>();
		
		employees2 = company1.getAllEmployees();
		for (IEmployee employee: employees2){
			System.out.println(employee.getSalary());
		}
		
		employees3 = company2.getAllEmployees();
		for (IEmployee employee: employees3){
			System.out.println(employee.getSalary());
		}
		
		employees4 = company3.getAllEmployees();
		for (IEmployee employee: employees4){
			System.out.println(employee.getSalary());
		}
	}

}

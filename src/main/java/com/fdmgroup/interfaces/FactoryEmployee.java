package com.fdmgroup.interfaces;

public class FactoryEmployee implements IEmployee {
	String name;
	int salary;

	public void clockIn() {
		// own method
		System.out.println(name + " has clocked in..");
	}

	public void doWork() {
		// method from interface
		System.out.println(name + " is doing Factory work");
	}

	public String getName() {
		// method from interface
		return name;
	}

	public void setName(String name) {
		// method from interface
		this.name = name;
	}

	public int getSalary() {
		// method from interface
		return salary;
	}

	public void setSalary(int salary) {
		// method from interface
		this.salary = salary;
	}

}

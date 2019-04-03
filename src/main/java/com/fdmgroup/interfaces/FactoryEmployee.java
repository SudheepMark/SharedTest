package com.fdmgroup.interfaces;

public class FactoryEmployee implements IEmployee {
	String name;
	int salary;

	public void clockIn() {
		// TODO Auto-generated method stub
		System.out.println(name + " has clocked in..");
	}

	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println(name + " is doing Factory work");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	public void setSalary(int salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
	}

}

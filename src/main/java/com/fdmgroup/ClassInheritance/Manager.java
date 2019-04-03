package com.fdmgroup.ClassInheritance;

import java.util.ArrayList;

public class Manager extends Employee {

	
	private ArrayList<Employee> team = new ArrayList<Employee>();
	
	public Manager(String name, int salary) {
		super(name, salary);
	}
	
	public void manage(){
		System.out.println(getName()+"is managing...");
	}

}

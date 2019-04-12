package com.fdmgroup.ClassInheritance;

public class ManagerRunner {

	public static void main(String[] args) {

		Manager manager = new Manager("Tim", 99999999);
		System.out.println(manager.getName()+" earns "+manager.getSalary());
		

	}

}

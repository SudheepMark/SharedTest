package com.fdmgroup.ClassInheritance;

public class Car extends Vehicle {

	//overriding method
	public void move(){
		System.out.println("car is moving");
	}
	
	public void brake() {
		// own method
		System.out.println("Car is braking..");
	}

	
	//overloading method
		public void move(int roadConditions){
			if(roadConditions < 4){
			System.out.println("car is moving slowly");
			}else {
				System.out.println("car is moving normally");
			}
		}
}

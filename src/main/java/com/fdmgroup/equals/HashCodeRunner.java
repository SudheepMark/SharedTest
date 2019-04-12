package com.fdmgroup.equals;

public class HashCodeRunner {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee("Brian","Java",7);
		Trainee trainee2 = new Trainee("Brian","Java",7);

		
		if (trainee1.equals(trainee2)){
			System.out.println("trainees are same");
		} else {
			System.out.println("trainees are different");
		}
		System.out.println(trainee1.hashCode());
		System.out.println(trainee2.hashCode());
	}

}

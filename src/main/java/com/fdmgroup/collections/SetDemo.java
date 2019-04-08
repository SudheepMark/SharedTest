package com.fdmgroup.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee(1,"Jose");
		Trainee trainee2 = new Trainee(2,"Sudheep");
		Trainee trainee3 = new Trainee(1,"Jose");
		
		Set<Trainee> trainees = new HashSet<Trainee>(Arrays.asList(trainee1,trainee2,trainee3));
		
		System.out.println("number of trainees is "+trainees.size());

	}

}

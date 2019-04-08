package com.fdmgroup.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee(1,"Jose");
		Trainee trainee2 = new Trainee(2,"Sudheep");
		Trainee trainee3 = new Trainee(3,"Dom");
		Trainee trainee4 = new Trainee(4,"Wil");
		Trainee trainee5 = new Trainee(5,"Michael");
		Trainee trainee6 = new Trainee(6,"Brian");
		
		Set<Trainee> trainees = new HashSet<Trainee>(Arrays.asList(trainee1,trainee2,
				                                                      trainee3,trainee4,
				                                                      trainee5,trainee6));
		
		int traineeToRemove = 4;
		
		Iterator<Trainee> iterator = trainees.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getId() == traineeToRemove){
				iterator.remove();
			}
		}
		
		
		for (Trainee trainee: trainees){
			System.out.println(trainee.getName());
		}
		

	}

}

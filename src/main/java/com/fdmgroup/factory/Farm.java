package com.fdmgroup.factory;

import java.util.ArrayList;

public class Farm {
	AnimalFactory animalFactory = new AnimalFactory();
	ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public ArrayList<Animal> getAllAnimals(){
		return animals;
	}
	
	public void addAnimal(String animal){
		Animal animalToAdd = animalFactory.getAnimal(animal);
		
		if(animalToAdd != null){
			animals.add(animalToAdd);
		}
	}
}

package com.fdmgroup.factory;

public class Runner {

	public static void main(String[] args) {
		PetShop petShop = new PetShop();
		Farm farm = new Farm();
		
		petShop.addAnimal("cat");
		petShop.addAnimal("dog");
		petShop.addAnimal("sheep");
		
		for (Animal animal : petShop.getAllAnimals()){
			animal.makeNoise();
		}
		
		farm.addAnimal("cow");
		farm.addAnimal("horse");
		farm.addAnimal("sheep");
		
		for (Animal animal : farm.getAllAnimals()){
			animal.makeNoise();
		}
		
	}
}

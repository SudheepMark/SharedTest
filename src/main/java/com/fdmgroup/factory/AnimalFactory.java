package com.fdmgroup.factory;

public class AnimalFactory {

	public Animal getAnimal(String type){
		
		if (type.equals("cat")){
			return new Cat();
		}
		
		if (type.equals("dog")){
			return new Dog();
		}
		
		if (type.equals("cow")){
			return new Cow();
		}
		
		if (type.equals("horse")){
			return new Horse();
		}
		if (type.equals("sheep")){
			return new Sheep();
		}
		
		return null;
	}
	
}

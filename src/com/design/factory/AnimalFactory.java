package com.design.factory;

public class AnimalFactory {
	public static Animal getAnimal(String animalType) {
		Animal animal=null;
		if(animalType.equalsIgnoreCase("dog"))
				animal=new Dog();
		else if(animalType.equalsIgnoreCase("cat"))
				animal=new Cat();
		return animal;
	}
}

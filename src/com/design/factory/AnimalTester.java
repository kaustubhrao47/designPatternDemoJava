package com.design.factory;

public class AnimalTester {

	public static void main(String[] args) {
		Animal obj1=AnimalFactory.getAnimal("dog");
		obj1.speak();
		Animal obj2=AnimalFactory.getAnimal("cat");
		obj2.speak();
	}

}

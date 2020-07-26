package com.design.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton obj1=Singleton.getObject();
		Singleton obj2=Singleton.getObject();
		if(obj1==obj2)
			System.out.println("Same object"); //Correct
		else 
			System.out.println("Different objects");
	}

}

package com.design.singleton;

/*
 * Rules for singleton design pattern:
 * A) Eager loading singleton
	 * 1. Make default constructor as private.
	 * 2. Create private static class type variable.
	 * 3. Initialize object to new object in constructor.
	 * 4. Create public static getObject / getInstance method which returns class object.
 * B) Lazy loading singleton
 	 * 1. Make default constructor as private.
	 * 2. Create private static class type variable.  	
	 * 3. Create public static getObject / getInstance method and return based on condition.	
 */
public class Singleton {
	
	//Eager loading singleton
	/*private static Singleton obj=null;
	private Singleton() {
		obj=new Singleton();
	}
	public static Singleton getObject() {
		return obj;
	}*/
	
	//Lazy loading singleton
	private static Singleton obj=null;
	private Singleton() {
	}
	public static Singleton getObject() {
		if(obj==null)
			obj=new Singleton();
		return obj;
	}
}

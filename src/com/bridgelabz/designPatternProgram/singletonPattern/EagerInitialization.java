package com.bridgelabz.designPatternProgram.singletonPattern;


public class EagerInitialization{
	public static void main(String[] args) {
		//	 EagerInitializedSingleton eagerInitializedSingleton = new EagerInitializedSingleton();// Two Time Object call
		EagerInitializedSingleton.getInstance();
	}
}

class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();//Static Instance Class Object

	//private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton(){ // Not default Constructor Used  it Always in Private Contructor
		System.out.println("Hi");
	}

	public static EagerInitializedSingleton getInstance(){ 
		return instance;
	}

}
/** 1. call the Constructor
 * 2.print Hi
 * 3.Static object call
 * 4.call the main method constructor getInstance()
 * return instance
 */

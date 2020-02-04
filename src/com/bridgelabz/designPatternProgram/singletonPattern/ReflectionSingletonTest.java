package com.bridgelabz.designPatternProgram.singletonPattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();// Print "Hi"
		EagerInitializedSingleton instanceTwo = null ;
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton)constructor.newInstance();// Print "Hi"
				break;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());// Hashcode of"Hi"
		System.out.println(instanceTwo.hashCode());// Hashcode of"Hi"
	}

}


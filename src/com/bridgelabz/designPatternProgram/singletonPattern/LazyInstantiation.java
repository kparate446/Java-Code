/**Initially object in Null*/
package com.bridgelabz.designPatternProgram.singletonPattern;

public class LazyInstantiation {
	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();// All object Created Initially Null
		Singleton obj1 = Singleton.getInstance();
	}
}
class Singleton{
	public static Singleton obj;
	private Singleton() {
		System.out.println("Instance Method");
	}
	public static Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();// Only One time Run the Method
		}
		return obj;
	}
}

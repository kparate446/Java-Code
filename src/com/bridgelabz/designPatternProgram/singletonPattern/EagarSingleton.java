package com.bridgelabz.designPatternProgram.singletonPattern;

// Loaded the memory

public class EagarSingleton {
	public static void main(String[] args) {
		//		Abc abc =new Abc(); // Error Because Constructor is private
		Abc obj = Abc.getInstance(); // (or) Abc.getInstance()
		//		Abc obj1 = Abc.getInstance();// Only call Only one Object
		//		Abc obj2 = Abc.getInstance();
		
	}
}
class Abc {
	
	/** Public instance initialization loading a Class.*/
	
	static Abc obj =new Abc(); //Static Instance class object
	//	 static Abc obj1 =new Abc();

	Abc() { /** It Not Used Default Constructor Only used in Private Constructor*/
		System.out.println("Hi");
	}

	public static  Abc getInstance() { // Method name Always static 
		return obj;

	}
}

/**class name-Enum , Singletonclass- INSTANCE */
package com.bridgelabz.designPatternProgram.singletonPattern;

public class EnumSingleton {
	public static void main(String[] args) {
		Enum obj1 = Enum.INSTANCE;
		obj1.i=5;
		obj1.show();
		
		Enum obj2 = Enum.INSTANCE;
		obj2.i=6;
		obj2.show();
//		readResolve();
		
	}
}
enum Enum{
	INSTANCE;// Private Constructor // It is Used in a (public static classname getInstance()
	int i; 
	public void show() {
		System.out.println(i);
	}
}

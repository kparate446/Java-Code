package com.bridgelabz.designPatternProgram.factoryDesignPattern.factory;

public class FactoryMain {
	public static void main(String[] args) {
		OpeartingSystemFactory osf = new OpeartingSystemFactory();
		OS obj = osf.getInstance("Open");
//		OS obj1 = osf.getInstance("Closed");
//		OS obj2 = osf.getInstance("Kunal");
		obj.spec();
//		obj1.spec();
//		obj2.spec();
	}

}

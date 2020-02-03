package com.bridgelabz.designPatternProgram.factoryDesignPattern;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu); // Compair the Name
		else if("Server".equalsIgnoreCase(type))return new PC(ram, hdd, cpu);
		return null;
		
	}
}

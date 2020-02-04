package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.visitorDesignPattern.visitorDesign;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor() );
						//Implement the Object
	}
		
}

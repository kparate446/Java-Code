package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.visitorDesignPattern.visitorDesign;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this); // this is used to Object in the keyboard i/p args to visit method
		
	}

}

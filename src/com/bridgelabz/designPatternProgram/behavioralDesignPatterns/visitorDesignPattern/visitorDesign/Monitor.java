package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.visitorDesignPattern.visitorDesign;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartvisitor) {
		computerPartvisitor.visit(this); // this is used to Object in the keyboard i/p args to visit method
		
	}

}

package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.visitorDesignPattern.visitorDesign;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartvisitor);
}

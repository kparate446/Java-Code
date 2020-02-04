package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.visitorDesignPattern;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.visitorDesignPattern;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}

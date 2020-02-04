package com.bridgelabz.designPatternProgram.structuralDesignPattern.Proxydesignpattern.ProxyDesign;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		// Image will be loaded from disk
		image.display();
		System.out.println();
		// Image will Not be loaded from disk
		image.display();
		
	}
}

package com.bridgelabz.designPatternProgram.structuralDesignPattern.adapterDesignPattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}
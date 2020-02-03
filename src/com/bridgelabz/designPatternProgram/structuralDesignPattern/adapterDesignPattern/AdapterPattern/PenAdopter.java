package com.bridgelabz.designPatternProgram.structuralDesignPattern.adapterDesignPattern.AdapterPattern;

public class PenAdopter implements Pen {
	PilotPen pp =new PilotPen();

	@Override
	public void write(String str) {
		pp.mark(str);
		
	}
	
}

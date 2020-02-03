package com.bridgelabz.designPatternProgram.structuralDesignPattern.adapterDesignPattern.AdapterPattern;

public class School {
	public static void main(String[] args) {
//		PilotPen pp = new PilotPen(); // pen is a setter method
		Pen p = new PenAdopter();// Pen Adopter is Used
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);// pen class set the Method Used Adopter
		aw.writeAssignment("I am write an Assignment");
	}
}

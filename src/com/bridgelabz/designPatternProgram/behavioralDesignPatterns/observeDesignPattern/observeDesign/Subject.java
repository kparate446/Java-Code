package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.observeDesignPattern.observeDesign;

public interface Subject {

	// Added the Subscriber
	void Subscribe(Subscriber sub);

	// Remove the Subscriber
	void Unsubscriber(Observer sub);

	void notifySubcriber();

	void update(String title);

}
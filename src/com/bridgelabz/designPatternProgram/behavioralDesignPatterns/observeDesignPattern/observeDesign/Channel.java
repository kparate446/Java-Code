package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.observeDesignPattern.observeDesign;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<Subscriber> subs = new ArrayList<>();
	String title;
	// Added the Subscriber
	@Override
	public void Subscribe(Subscriber sub) {
		subs.add(sub);
	}
	// Remove the Subscriber
	@Override
	public void Unsubscriber(Observer sub) {
		subs.remove(sub);
	}
	
	@Override
	public void notifySubcriber() {
		for(Observer sub :subs) {
			sub.update();
		}
	}
	@Override
	public void update(String title) {
		this.title = title;
		notifySubcriber();
	}
	
}

package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.observeDesignPattern.observeDesign;

public class Youtube {
	public static void main(String[] args) {
		Channel Java = new Channel();
		
		Subscriber s1 = new Subscriber("Krunal -");
		Subscriber s2 = new Subscriber("Mrunal ");
		Subscriber s3 = new Subscriber("Ankit -");
		Subscriber s4 = new Subscriber("Soham -");
		
		Java.Subscribe(s1);
		Java.Subscribe(s2);
		Java.Subscribe(s3);
		Java.Subscribe(s4);
		
		Java.Unsubscriber(s2);
		
		s1.subsribeChannel(Java);
		s2.subsribeChannel(Java);
		s3.subsribeChannel(Java);
		s4.subsribeChannel(Java);
		
		Java.update("-Java Programming");
	}
}

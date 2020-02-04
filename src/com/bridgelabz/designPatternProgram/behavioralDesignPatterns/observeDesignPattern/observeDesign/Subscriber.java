package com.bridgelabz.designPatternProgram.behavioralDesignPatterns.observeDesignPattern.observeDesign;

public class Subscriber implements Observer {

	private String name;
	private Channel channel = new Channel();
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey "+name+"Video Update"+channel.title);
	}
	@Override
	public void subsribeChannel(Channel ch) {
		channel = ch;
	}

}

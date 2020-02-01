package com.bridgelabz.designPatternProgram.singletonPattern;

public class StaticBlockSingleton {
	public static void main(String[] args) {
		
		StaticBlock.getInstance();
	}
}
class StaticBlock{
	private static StaticBlock instance ; /** object is created in the static block*/
	private StaticBlock() {
		System.out.println("Hi");
	}
	// Static Block Initialization for Exception Handling
	static {
		try {
			/**Creating a object*/
			instance = new StaticBlock(); 
		}catch(Exception e) {
			throw new RuntimeException("Exception creating Singleton Instance");
		}
	}
	
	public static StaticBlock getInstance() {
		return instance;
		
		
	}
	
	
}

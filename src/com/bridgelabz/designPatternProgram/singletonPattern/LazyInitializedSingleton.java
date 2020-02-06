/**Initially object in Null*/
package com.bridgelabz.designPatternProgram.singletonPattern;

public class LazyInitializedSingleton {
	public static void main(String[] args) {
		LazyInitialized.getInstance();
		LazyInitialized.getInstance();// Only One Time Object is created //Initially object is null 
	}

}
class LazyInitialized{
	private static LazyInitialized instance; // object created in bellow
	
	private LazyInitialized () {
		System.out.println("Hi");
	}
	public static LazyInitialized getInstance() {
		if(instance == null) {
			instance = new LazyInitialized(); //Object is Created in only one time
		}
		return instance;		
	}
}

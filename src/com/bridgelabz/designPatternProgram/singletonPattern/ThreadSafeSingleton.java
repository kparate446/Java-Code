package com.bridgelabz.designPatternProgram.singletonPattern;

public class ThreadSafeSingleton {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
			 	// TODO Auto-generated method stub
				ThreadSafe t1 = ThreadSafe.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
			 	// TODO Auto-generated method stub
				ThreadSafe t2 = ThreadSafe.getInstance();
			}
		});
		t1.start();
		t2.start();// only one object is created
	}
}
class ThreadSafe{
	
	private static ThreadSafe instance;
	private ThreadSafe() {
		System.out.println("Instance");
	}
	static synchronized ThreadSafe getInstance() {
		if(instance == null) {
			instance = new ThreadSafe();
		}
		return instance;
	}
	
}

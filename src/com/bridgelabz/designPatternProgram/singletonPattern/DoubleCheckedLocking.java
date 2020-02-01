package com.bridgelabz.designPatternProgram.singletonPattern;

public class DoubleCheckedLocking {
	public static void main(String[] args) {
		DoubleChecking.getinstance();
		DoubleChecking.getinstance();// Only one Object is Created
	}
}
class DoubleChecking {
	public static DoubleChecking obj;
	private DoubleChecking() {
		System.out.println("Instance Created");
	}
	public static DoubleChecking getinstance() {
		if(obj == null) {
			synchronized (DoubleChecking.class) {// Synchronized the Class
				if(obj==null)
					obj = new DoubleChecking();
			}
		}
		return obj;
	}
}

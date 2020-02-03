package com.bridgelabz.designPatternProgram.singletonPattern;

public class BillPughSingleton {
	public static void main(String[] args) {
		BillPugh.getInstance();
//		BillPugh.getInstance();
	}
	
}
 class BillPugh{
	
	 private BillPugh() {
		 System.out.println("Instance Created");
		 }
	 private static class InnerClass{ // Inner Class
		 private static final BillPugh Instance = new BillPugh();
	 }
	 public static BillPugh getInstance() {
		return InnerClass.Instance;
		 
	 }
}
/** Singleton Class is loaded & inner class in not loaded
 * do not used Synchronised*/

package com.bridgelabz.designPatternProgram.singletonPattern;

public class BillPughSingleton {
	public static void main(String[] args) {
		BillPugh.getInstance();
		BillPugh.getInstance();
	}
}
 class BillPugh{
	
	 private BillPugh() {
		 System.out.println("Instance Created");
		 }
	 // Not Loading the Object
	 private static class InnerClass{ // Inner Class
		 private static final BillPugh Instance = new BillPugh();
	 }
	 public static BillPugh getInstance() {
		return InnerClass.Instance;
		 
	 }
}
package com.bridgelabz.designPatternProgram.structuralDesignPattern.Proxydesignpattern;

public class ProxyPatternTest {

	public static void main(String[] args){
		// Provide a surrogate or Placeholder for another object to control it.
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}

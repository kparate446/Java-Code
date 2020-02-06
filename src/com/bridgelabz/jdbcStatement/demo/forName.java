package com.bridgelabz.jdbcStatement.demo;
public class forName {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");// Inbuild the Register Driver
//		ABC ad = new ABC();
//		Class.forName("ABC");
	}
}
class ABC{
	static {
		System.out.println("Static ");
	}
	{
		System.out.println("instance");
	}
}

package com.bridgelabz.designPatternProgram.structuralDesignPattern.Facadedesignpattern;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		System.out.println("Generate SQL Pdf Report");
		//get data from table and generate pdf report
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		System.out.println("Generate SQL HTML Report");
		//get data from table and generate pdf report
	}
}

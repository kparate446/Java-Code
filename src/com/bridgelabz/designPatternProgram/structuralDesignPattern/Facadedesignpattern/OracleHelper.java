package com.bridgelabz.designPatternProgram.structuralDesignPattern.Facadedesignpattern;

import java.sql.Connection;

public class OracleHelper {
	public static Connection getOracleDBConnection() {
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		System.out.println("Generate Oracle Pdf Report");
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		System.out.println("Generate Oracle HTML Report");
		//get data from table and generate pdf report
	}
	
}

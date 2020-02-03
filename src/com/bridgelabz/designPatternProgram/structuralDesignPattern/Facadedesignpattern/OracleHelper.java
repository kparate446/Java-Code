package com.bridgelabz.designPatternProgram.structuralDesignPattern.Facadedesignpattern;

import java.sql.Connection;

public class OracleHelper {
	public static Connection getOracleDBConnection() {
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
	
}

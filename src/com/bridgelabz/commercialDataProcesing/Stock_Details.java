package com.bridgelabz.commercialDataProcesing;
public class Stock_Details 
{
	public static void main(String[] args) 
	{
		StockService share = new StockServiceimp();
		{
			
			share.read();
			share.calculate();
			share.write();
//			share.read();
		}
		
	}

}
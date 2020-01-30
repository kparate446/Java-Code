package com.bridgelabz.commercialDataProcesing;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.inventory.Inventory;
//import com.bridgelab.Oops.InventoryManagement.model.Inventory;
//import com.bridgelab.Oops.Stock.model.Stock;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockServiceimp implements StockService
{
	List<Stock> stocks = new ArrayList<>();
	JSONParser parser = new JSONParser();
	JSONObject obj = new JSONObject();
	@Override
	public void read() 
	{
		JSONArray arr;
		{
			try {
				 arr = (JSONArray)parser.parse(new FileReader("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/Stock.json"));
				 for (Object  jak : arr)
				 {
					 Stock inc = new Stock();
					 JSONObject or = (JSONObject) jak;
//					 long stock = (Long)or.get("stock");
//					 inc.setStock(stock);
					 String name = (String)or.get("name");
					 inc.setName(name);
					 long sharenum = (Long)or.get("sharenum");
					 inc.setSharenum(sharenum);
					 double price = (double)or.get("price");
					 inc.setPrice(price);
					 stocks.add(inc);
//					 System.out.println(inc.toString());
					 System.out.println(jak);
				 }
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void write() 
	{
		Gson gs = new GsonBuilder().setPrettyPrinting().create();
		String json = gs.toJson(stocks);
		try (
			FileWriter pw = new FileWriter("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/Stock.json")){
//			pw.write(json);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("file content are : " + json);
		
		
	}
	
	public void add(String arr,String name,Long sharenum,long price) {
		Stock stock = new Stock();
		stock.setStock(arr);
		stock.setName(name);
		stock.setSharenum(sharenum);
		stock.setPrice(price);
		stocks.add(stock);
	}
	
	public void remove(String name) {
		stocks.removeIf(Stock -> Stock.getName().equals(name));
		write();
	}
	@Override
	public void calculate() 
	{
		
//		stocks.forEach(stock -> {
//			 
//			System.out.println(
//					"Total price of " + stock.getName() + " is " + (stock.getPrice() * stock.getSharenum()));
//			});
		
		Stock stock = new Stock();
		stocks.forEach(Stock -> System.out.println("Total price of " + Stock.getName() +" is "+(Stock.getPrice() * Stock.getSharenum())));
		
}
}

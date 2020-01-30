package com.bridgelabz.inventory;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//public class Inventoryserviceimp implements Inventoryservice{
public class Inventoryserviceimp{
	List<Inventory> inventories = new ArrayList<>();
	JSONParser parser = new JSONParser();
	JSONObject obj = new JSONObject();


	public void read() {
		JSONArray arr;

		try {
			arr=(JSONArray)parser.parse(new FileReader("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/Inventory.json"));
			
			for(Object jak : arr) {
				Inventory inc = new Inventory();
				JSONObject or =(JSONObject) jak;
				String name= (String)or.get("name");
				inc.setName(name);
				long weight =(Long)or.get("weight");
				inc.setWeight(weight);
				long price =(Long)or.get("price");
				inc.setPrice(price);
				inventories.add(inc);
//				System.out.println(inc.toString());
				System.out.println(jak);
				
			}

		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}
//		@Override
	public void calculate() {
		Inventory inc = new Inventory();
		inventories.forEach(Inventory -> System.out.println("Total price of " + Inventory.getName() + " is " + (Inventory.getPrice() * Inventory.getWeight())));
		
	}
//	public void calculateTotal() {
//		for(Object jak : arr) {
//			
//		}
//	}
//		Inventory inc = new Inventory();
//		System.out.println(inc.getName);
//	}
	public void remove(String name) {
		inventories.removeIf(Inventory -> Inventory.getName().equals(name));
		write();
	}


	//	@Override
	public void add(String arr, String name, long weight, long price) {
		read();
		Inventory invent = new  Inventory();
		invent.setInventory(arr);
		invent.setName(name);
		invent.setPrice(price);
		invent.setWeight(weight);
		inventories.add(invent);

	}

//	@Override
	public void write() {
		Gson gs = new GsonBuilder().setPrettyPrinting().create();
		String json = gs.toJson(inventories);
		try {
			FileWriter pw = new FileWriter("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/Inventory.json");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file content are : " +json);

	}

}

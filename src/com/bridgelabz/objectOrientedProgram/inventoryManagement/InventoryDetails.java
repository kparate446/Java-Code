package com.bridgelabz.objectOrientedProgram.inventoryManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Inventory.Properties;

public class InventoryDetails {
	String name;
	long weight;
	float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Properties [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	Properties properties = new Properties();
	static ObjectMapper mapper = new ObjectMapper(); // jackson mapper object to map data with json file
	
	File file = new File("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/InventoryManager.json"); // accessing json file of inventory
	
	// Read the File
	public List<Properties> readFile() throws IOException { // reading inventory json file
		List<Properties> list = mapper.readValue(file, new TypeReference<List<Properties>>() { });//mapping data with json file
//		});
		return list; //returning list of inventory
	}
	
	// Write the file
	public void writeFile(List<Properties> list) throws IOException {	//writing json file
		mapper.defaultPrettyPrintingWriter().writeValue(file, list); // writing data in inventory json file
	}
}


package com.bridgelabz.InventoryManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class InventoryMangement {
	
	
	public InventoryMangement() {
		// TODO Auto-generated constructor stub
	}

	public List<Product> readInventoryData(String path) {
		ObjectMapper mapper = new ObjectMapper();
		List<Product> list=null;//Product is a class
		
			try {
				list=mapper.readValue(new File(path), new TypeReference <List<Product>>() {});
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return list;

		}

	public void DisplayData(List<Product> readInventoryData) {
//		readInventoryData.stream().forEach(System.out::println);
		readInventoryData.stream().forEach(s -> System.out.println(s.toString()));
	}

}

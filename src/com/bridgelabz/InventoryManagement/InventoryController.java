package com.bridgelabz.InventoryManagement;

import java.io.IOException;
import java.util.List;

public class InventoryController {
	public static final String path = "/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/DataManagement";
	//private static InventoryMangement inventoryMangement;

	public static void main(String[] args) throws IOException {

		InventoryMangement inventoryMangement = new InventoryMangement();
		
		List<Product> readInventoryData = inventoryMangement.readInventoryData(path);
		
		inventoryMangement.DisplayData(readInventoryData);
	}

}

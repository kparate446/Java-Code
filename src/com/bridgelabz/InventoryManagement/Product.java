package com.bridgelabz.InventoryManagement;

public class Product {
	public String type;
	public String name;
	public long price;
	public long weight;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String type, String name, int price, int weight) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "" + "type ==>" + type +"\n name ==>" + name + "\n price ==>" + price + "\n weight ==>" + weight + "\n Total ==>"+ price*weight + " \n";
		
	}
	
	

}
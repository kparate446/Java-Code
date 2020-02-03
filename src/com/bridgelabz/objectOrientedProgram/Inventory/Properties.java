/** 
 * Cereated By:- Krunal Parate
 * Date :-
 */
package com.bridgelabz.objectOrientedProgram.Inventory;

public class Properties {
	String type;
	String name;
	long weight;
	float price;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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
		return "Properties [type=" + type + ", name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}




}

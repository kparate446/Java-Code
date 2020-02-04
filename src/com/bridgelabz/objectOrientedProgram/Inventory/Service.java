package com.bridgelabz.objectOrientedProgram.Inventory;

import java.util.List;

public interface Service {

	/**Add Inventory*/
	List<Properties> addInventory(List<Properties> list);

	/**Remove Inventory*/
	List<Properties> removeType(List<Properties> list);

	/** Calculation*/
	void calculations(List<Properties> list);

	/**Total Calculation*/
	List<Properties> Totalcalculation(List<Properties> list);

	/** Add the Type*/
	List<Properties> addType(List<Properties> list);

	/** Remove the Type*/
	List<Properties> removeInventory(List<Properties> list);

}
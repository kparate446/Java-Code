package com.bridgelabz.objectOrientedProgram.addressBook;

import java.io.IOException;
import java.util.List;

public interface Service {

	/**Add the PersonDetails*/
	List<PersonDetails> addPerson(List<PersonDetails> listOfPerson);

	/** Remove person
	 * @param firstName */
	List<PersonDetails> removePerson(List<PersonDetails> list);

	//Remove Of Person In Edit Function
	List<PersonDetails> removePerson1(List<PersonDetails> list, String name);
	
	/** Edit User
	 * @throws IOException */
	List<PersonDetails> editPerson(List<PersonDetails> list) throws IOException;

	/**Sorted Zip*/
	List<PersonDetails> sortzip(List<PersonDetails> listOfPerson);

	/**Sorted Last Name*/
	List<PersonDetails> sortLastName(List<PersonDetails> listOfPerson);

	/**Sorted Address*/
	List<PersonDetails> sortAddress(List<PersonDetails> listOfPerson);

}
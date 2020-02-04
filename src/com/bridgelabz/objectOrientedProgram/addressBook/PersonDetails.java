package com.bridgelabz.objectOrientedProgram.addressBook;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class PersonDetails { //POJO class

	String fname;
	String lname;
	String address;
	String city;
	String state;
	long zip;
	long phone;

	public PersonDetails() {
		super();

	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long string) {
		this.phone = string;
	}

	@Override
	public String toString() {
		return "AddressDetails [fname=" + fname + ", lname=" + lname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phone=" + phone + "]";
	}

	static ObjectMapper mapper = new ObjectMapper();// JavaObject-JSON & Json-JavaObject                                             

	/**Read The File*/
	File file = new File("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/AddressBook.json"); // accessing json file

	public List<PersonDetails> readFile() throws JsonParseException, JsonMappingException, IOException { // reading json file
		List<PersonDetails> read = mapper.readValue(file, new TypeReference<List<PersonDetails>>() { 
		}); 
		return read; //returning list of data
	}

	/**Write The File*/

	@SuppressWarnings("deprecation")
	public void writeFile(List<PersonDetails> list) throws JsonGenerationException, JsonMappingException, IOException { //writing data in json file
		mapper.defaultPrettyPrintingWriter().writeValue(file, list); 
	}


}

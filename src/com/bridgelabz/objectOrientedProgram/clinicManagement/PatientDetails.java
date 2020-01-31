package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Inventory.Properties;

public class PatientDetails {
	
	String patientName;
	long patientId;
	long mobileNumber;
	int age;
	String assignDoctor;


	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAssignDoctor() {
		return assignDoctor;
	}
	public void setAssignDoctor(String assignDoctor) {
		this.assignDoctor = assignDoctor;
	}

	@Override
	public String toString() {
		return "PatientDetails [patientName=" + patientName + ", patientId=" + patientId + ", mobileNumber="
				+ mobileNumber + ", age=" + age + ", assignDoctor=" + assignDoctor + "]";
	}
	
	/** Read and Write File*/
	Properties properties = new Properties();
	static ObjectMapper mapper = new ObjectMapper(); // jackson mapper object to map data with json file
	
	File file = new File("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/patient.json"); // accessing json file of inventory
	
	// Read the File
	public List<PatientDetails> readFile() throws IOException { // reading inventory json file
		List<PatientDetails> list = mapper.readValue(file, new TypeReference<List<PatientDetails>>() { });//mapping data with json file
//		});
		return list; //returning list of inventory
	}
	
	// Write the file
	@SuppressWarnings("deprecation")
	public void writeFile(List<PatientDetails> list) throws IOException {	//writing json file
		mapper.defaultPrettyPrintingWriter().writeValue(file, list); // writing data in inventory json file
	}
}

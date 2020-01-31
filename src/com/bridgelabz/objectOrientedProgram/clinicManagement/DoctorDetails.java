package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Inventory.Properties;

public class DoctorDetails {
	
	String doctorName;
	long doctorId;
	String specialization;
	String availability;
	long appoinment;
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public long getAppoinment() {
		return appoinment;
	}
	public void setAppoinment(long appoinment) {
		this.appoinment = appoinment;
	}
	@Override
	public String toString() {
		return "DoctorDetails [doctorName=" + doctorName + ", doctorId=" + doctorId + ", specialization="
				+ specialization + ", availability=" + availability + ", appoinment=" + appoinment + "]";
	}
	
	/**Read and Write File */
	Properties properties = new Properties();
	static ObjectMapper mapper = new ObjectMapper(); // jackson mapper object to map data with json file
	
	File file = new File("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/doctor.json"); // accessing json file of inventory
	
	// Read the File
	public List<DoctorDetails> readFile() throws IOException { // reading inventory json file
		List<DoctorDetails> list = mapper.readValue(file, new TypeReference<List<DoctorDetails>>() { });//mapping data with json file
//		});
		return list; //returning list of inventory
	}
	
	// Write the file
	@SuppressWarnings("deprecation")
	public void writeFile(List<DoctorDetails> list) throws IOException {	//writing json file
		mapper.defaultPrettyPrintingWriter().writeValue(file, list); // writing data in inventory json file
	}
	
}

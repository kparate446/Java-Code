package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Inventory.Properties;

public class AppoinmentDetails {
	
	String doctorName;
	long patientId;
	String patientName;
	String doctorSpecialization;
	String doctorAvaibility;
	long doctorAppointment;
	
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public String getDoctorAvaibility() {
		return doctorAvaibility;
	}
	public void setDoctorAvaibility(String doctorAvaibility) {
		this.doctorAvaibility = doctorAvaibility;
	}
	public long getDoctorAppointment() {
		return doctorAppointment;
	}
	public void setDoctorAppointment(long doctorAppointment) {
		this.doctorAppointment = doctorAppointment;
	}
	
	
	@Override
	public String toString() {
		return "AppoinmentDetails [doctorName=" + doctorName + ", patientId=" + patientId + ", patientName="
				+ patientName + ", doctorSpecialization=" + doctorSpecialization + ", doctorAvaibility="
				+ doctorAvaibility + ", doctorAppointment=" + doctorAppointment + "]";
	}
	
	/** Read and Write File*/
	Properties properties = new Properties();
	static ObjectMapper mapper = new ObjectMapper(); // jackson mapper object to map data with json file
	
	File file = new File("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/appoinment.json"); // accessing json file of inventory
	
	// Read the File
	public List<AppoinmentDetails> readFile() throws IOException { // reading inventory json file
		List<AppoinmentDetails> list = mapper.readValue(file, new TypeReference<List<AppoinmentDetails>>() { });//mapping data with json file
//		});
		return list; //returning list of inventory
	}
	
	// Write the file
	public void writeFile(List<AppoinmentDetails> list) throws IOException {	//writing json file
		mapper.defaultPrettyPrintingWriter().writeValue(file, list); // writing data in inventory json file
	}
	
}

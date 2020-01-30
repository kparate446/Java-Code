package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.IOException;
import java.util.List;


public class Operation {
	
	PatientDetails details = new PatientDetails();

	/**Add Patient*/
	public List<PatientDetails> addPatient(List<PatientDetails> list) { //method to add new Patient
		// Enter the data from User
		System.out.println("Enter the Patient Name: ");
		details.setPatientName(Utility.stringInput());

		System.out.println("Enter the Patient Id: ");
		details.setPatientId(Utility.integerInput());

		System.out.println("Enter the Patient Mobile Number: ");
		details.setMobileNumber(Utility.longInput());

		System.out.println("Enter the Patient Age");
		details.setAge(Utility.integerInput());

		list.add(details); //adding data to list
		System.out.println("Details added successfully!");
		return list; //returning list of data]
	}
	
	/**Add Patient*/
	DoctorDetails doctorDetails = new DoctorDetails();
	
	public List<DoctorDetails> addDoctor(List<DoctorDetails> read1) { //method to add new Doctor
		// Enter the data from User
		System.out.println("Enter the Doctor Name: ");
		doctorDetails.setDoctorName(Utility.stringInput());

		System.out.println("Enter the Doctor Id: ");
		doctorDetails.setDoctorId(Utility.longInput());

		System.out.println("Enter the Doctor Specialization: ");
		doctorDetails.setSpecialization(Utility.stringInput());

		System.out.println("Enter the Availability");
		doctorDetails.setAvailability(Utility.stringInput());

		read1.add(doctorDetails); //adding data to list
		System.out.println("Details added successfully!");
		return read1; //returning list of data]
	}
	
	/** Add Appoinment*/
	AppoinmentDetails appoinmentDetails = new AppoinmentDetails();
	
	public List<AppoinmentDetails> addAppoinment(List<AppoinmentDetails> list) { //method to add new Appoinment
		// Enter the data from User
		System.out.println("Enter the Doctor Name: ");
		appoinmentDetails.setDoctorName(Utility.stringInput());

		System.out.println("Enter the Patient Id: ");
		appoinmentDetails.setPatientId(Utility.longInput());
		
		System.out.println("Enter the Patient Name: ");
		appoinmentDetails.setPatientName(Utility.stringInput());

		System.out.println("Enter the Doctor Specialization: ");
		appoinmentDetails.setDoctorSpecialization(Utility.stringInput());

		System.out.println("Enter the Doctor Availability");
		appoinmentDetails.setDoctorAvaibility(Utility.stringInput());
		
		System.out.println("Enter the Doctor Appoinment: ");
		appoinmentDetails.setDoctorAppointment(Utility.longInput());
		
		list.add(appoinmentDetails); //adding data to list
		System.out.println("Details added successfully!");
		return list; //returning list of data]
	}
	
	/** Display the All Deatils*/
	public static int Display() throws IOException {
		
		PatientDetails patientDetails = new PatientDetails();
		DoctorDetails doctorDetails = new DoctorDetails();
		AppoinmentDetails appoinmentDetails = new AppoinmentDetails();
		Operation operation = new Operation();
		int choice = 0;
		List<PatientDetails> list = patientDetails.readFile(); //reading json file
		List<DoctorDetails> list1 = doctorDetails.readFile(); //reading json file
		List<AppoinmentDetails> list2 = appoinmentDetails.readFile(); //reading json file
		
		//Show the Doctor Details
				System.out.println("Doctor Details");
				for(DoctorDetails dd : list1) {			
					System.out.println("Doctor Name: "+dd.getDoctorName()+", Doctor Id: "+dd.getDoctorId()+", Specialization: "+dd.getSpecialization()+", Availibility: "+dd.getAvailability()+", Appoinment: "+dd.getAppoinment());
					System.out.println();
				}
				
		//Show the Patient Details
		System.out.println("Patient Details");
		for(PatientDetails pd : list) {			
			System.out.println("Patient Name: "+pd.getPatientName()+", Patient Id: "+pd.getPatientId()+", Mobile No: "+pd.getMobileNumber()+", Age: "+pd.getAge());
			System.out.println();
		}
		
		//Show the Appoinment Appoinment
		System.out.println("Appoinment Appoinment");
		for(AppoinmentDetails ad : list2) {			
			System.out.println("Doctor Name: "+ad.getDoctorName()+", Patient Id: "+ad.getPatientId()+", Patient Name: "+ad.getPatientName()+", Doctor Specialization: "+ad.getDoctorSpecialization()+", Doctor Avaibility: "+ad.getDoctorAvaibility()+" , Doctor Appoinment: "+ad.getDoctorAppointment());
			System.out.println();
		}
		return choice;
	}
	
}

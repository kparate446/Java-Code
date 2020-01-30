package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.stock.StockDetails;

public class ClinicManagement {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
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
		
		do {
			//performing different operations by users choice
			System.out.println();
			System.out.println("1.Add Doctor \n2.Add Patient \n3.Add Appointment\n4.Details \n5.Exit \n Enter your choice: ");
			try {
				choice = Utility.integerInput();
				switch(choice) {
				 //Add Doctor
				case 1:
					List<DoctorDetails> read3 = doctorDetails.readFile(); //reading json file
					List<DoctorDetails> list3 =operation.addDoctor(read3); //method to add the Doctor
					doctorDetails.writeFile(list3); //writing data in json file
					break;
				// Add Patient
				case 2:
					List<PatientDetails> read4 = patientDetails.readFile(); //reading json file
					List<PatientDetails> list4 =operation.addPatient(read4); //method to add the patient
					patientDetails.writeFile(list4); //writing data in json file
				// Add Appointment
				case 3:
					List<AppoinmentDetails> read5 = appoinmentDetails.readFile(); //reading json file
					List<AppoinmentDetails> list5 =operation.addAppoinment(read5); //method to add the Appointment
					appoinmentDetails.writeFile(list5); //writing data in json file
				case 4:
					Operation.Display();
					break;
					
				case 5:
					System.out.println("Thank You!");
					return;
				
				default:
					System.out.println("Enter correct choice!");
				}
				}catch (InputMismatchException e) {
					System.out.println("Please Enter integer Number only!");
					sc.next();
				}
		}while(choice!=5);
		
	}

}

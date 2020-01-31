package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClinicManagement {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		PatientDetails patientDetails = new PatientDetails();
		DoctorDetails doctorDetails = new DoctorDetails();
		AppoinmentDetails appoinmentDetails = new AppoinmentDetails();
		Operation operation = new Operation();
		int choice = 0;


		do {
			//performing different operations by users choice
			System.out.println();
			System.out.println("1.Add Doctor \n2.Add Patient \n3.Doctor Details \n4.Patient Details \n5.Appoinment Details \n6.Remove Doctor \n7.Remove Patient \n8.Remove Appoinment \n9.Search Doctor \n10.Search Patient \n11.Take Appoinment \n12.All Details \n13.Exit   \n Enter your choice: ");
			try {
				choice = Utility.integerInput();
				switch(choice) {

				//Add Doctor
				case 1:
					List<DoctorDetails> read1 = doctorDetails.readFile(); //reading json file
					List<DoctorDetails> list1 =operation.addDoctor(read1); //method to add the Doctor
					doctorDetails.writeFile(list1); //writing data in json file
					break;

					// Add Patient
				case 2:
					List<PatientDetails> read2 = patientDetails.readFile(); //reading json file
					List<PatientDetails> list2 =operation.addPatient(read2); //method to add the patient
					patientDetails.writeFile(list2); //writing data in json file
					break;

					// Doctor Details	
				case 3:
					List<DoctorDetails> read3 = doctorDetails.readFile(); //reading json file
					operation.getDoctorDetails(read3); //get the Doctor Details
					break;

					// Patient Details
				case 4:
					List<PatientDetails> read4 = patientDetails.readFile(); //reading json file
					operation.getPatientDetails(read4);// get the Patient Details
					break;

					// Appoinment Details
				case 5:
					List<AppoinmentDetails> read5 = appoinmentDetails.readFile(); //reading json file
					operation.getAppoinmentDetails(read5); //get Appoinment Details
					break;

					// Remove Doctor
				case 6:
					List<DoctorDetails> read6 = doctorDetails.readFile(); //reading json file
					List<DoctorDetails> list6 = operation.removeDoctor(read6); //method to remove Doctor
					doctorDetails.writeFile(list6);	//writing data in json file
					break;

					// Remove Patient Details
				case 7:
					List<PatientDetails> read7 = patientDetails.readFile(); //reading json file
					List<PatientDetails> list7 = operation.removePatient(read7); //method to remove stock
					patientDetails.writeFile(list7);	//writing data in json file
					break;

					// Removed Appoinment
				case 8:
					List<AppoinmentDetails> read8 = appoinmentDetails.readFile(); //reading json file
					List<AppoinmentDetails> list8 = operation.removeAppoinment(read8); //method to remove Appoinment
					appoinmentDetails.writeFile(list8);	//writing data in json file
					break;

					//Search Doctor
				case 9:
					List<DoctorDetails> read9 = doctorDetails.readFile(); //reading json file
					operation.searchDoctor(read9); //method to Search the Doctor
					break;

					//Search Patient
				case 10 :
					List<PatientDetails> read10 = patientDetails.readFile(); //reading json file
					operation.searchPatient(read10); //method to Search the Patient
					break;	

					// Take Appoinment
				case 11:
					List<AppoinmentDetails> read11 = appoinmentDetails.readFile(); //reading json file
					List<DoctorDetails> docList = doctorDetails.readFile();
					List<PatientDetails> patlist = patientDetails.readFile();
					List<AppoinmentDetails> list11 =operation.takeAppoinment(read11,docList,patlist); //method to add the Appointment
					appoinmentDetails.writeFile(list11); //writing data in json file
					break;

					// All Details
				case 12:
					Operation.Display(); // Dispaly the List
					break;

					//Exit
				case 13:
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







//Show the Doctor Details
/**List<PatientDetails> list = patientDetails.readFile(); //reading json file
		List<DoctorDetails> list1 = doctorDetails.readFile(); //reading json file
		List<AppoinmentDetails> list2 = appoinmentDetails.readFile(); //reading json file

		//Show the Doctor Details
		System.out.println("Doctor Details");
		for(DoctorDetails dd : list1) {			
			System.out.println("Doctor Name: "+dd.getDoctorName()+", Doctor Id: "+dd.getDoctorId()+", Specialization: "+dd.getSpecialization()+", Availibility: "+dd.getAvailability()+", Appoinment: "+dd.getAppoinment());
		}
		System.out.println();

		//Show the Patient Details
		System.out.println("Patient Details");
		for(PatientDetails pd : list) {			
			System.out.println("Patient Name: "+pd.getPatientName()+", Patient Id: "+pd.getPatientId()+", Mobile No: "+pd.getMobileNumber()+", Age: "+pd.getAge());
		}
		System.out.println();

		//Show the Appoinment Appoinment
		System.out.println("Appoinment Appoinment");
		for(AppoinmentDetails ad : list2) {			
			System.out.println("Doctor Name: "+ad.getDoctorName()+", Patient Id: "+ad.getPatientId()+", Patient Name: "+ad.getPatientName()+", Doctor Specialization: "+ad.getDoctorSpecialization()+", Doctor Avaibility: "+ad.getDoctorAvaibility()+" , Doctor Appoinment: "+ad.getDoctorAppointment());
		}
		System.out.println();
 */


////***** Add Appointment
//case 3:
//	List<AppoinmentDetails> read5 = appoinmentDetails.readFile(); //reading json file
//	List<AppoinmentDetails> list5 =operation.addAppoinment(read5); //method to add the Appointment
//	appoinmentDetails.writeFile(list5); //writing data in json file
//	break;

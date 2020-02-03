package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;

import com.bridgelabz.stock.Utility;

public class Operation {

	PatientDetails details = new PatientDetails();
	PatientDetails patientDetails = new PatientDetails();
	DoctorDetails doctorDetails = new DoctorDetails();
	AppoinmentDetails appoinmentDetails = new AppoinmentDetails();

	/**Add Patient*/
	public List<PatientDetails> addPatient(List<PatientDetails> list) { //method to add new Patient
		// Enter the data from User
		System.out.println("Enter the Patient Name: ");
		details.setPatientName(Utility.stringValidation(Utility.stringInput()));

		System.out.println("Enter the Patient Id: ");
		details.setPatientId(Utility.integerInput());

		System.out.println("Enter the Patient Mobile Number: ");
		details.setMobileNumber(Utility.longInput());

		System.out.println("Enter the Patient Age");
		details.setAge(Utility.integerInput());
		int choice=0;
		System.out.println("1.Submit \t 2.Exit");
		choice = Utility.integerInput();
		switch (choice) {
		case 1:
			list.add(details);//adding data to list
			break;
		case 2:
			return list ;
		default:
			break;
		}

//		list.add(details); //adding data to list
		System.out.println("Details added successfully!");
		return list; //returning list of data]
	}

	/**Add Doctor*/
	public List<DoctorDetails> addDoctor(List<DoctorDetails> read1) { //method to add new Doctor
		// Enter the data from User
		System.out.println("Enter the Doctor Name: ");
		doctorDetails.setDoctorName(Utility.stringValidation(Utility.stringInput()));

		System.out.println("Enter the Doctor Id: ");
		doctorDetails.setDoctorId(Utility.longInput());

		System.out.println("Enter the Doctor Specialization: ");
		String sp = Utility.stringValidation(Utility.stringInput());
		sp=Utility.stringValidation(Utility.stringInput());
		doctorDetails.setSpecialization(sp);
		//		doctorDetails.setSpecialization(Utility.stringInput());

		System.out.println("Enter the Availability");
		doctorDetails.setAvailability(Utility.stringValidation(Utility.stringInput()));
		
		int choice=0;
		System.out.println("1.Submit \t 2.Exit");
		choice = Utility.integerInput();
		switch (choice) {
		case 1:
			read1.add(doctorDetails);//adding data to list
			break;
		case 2:
			return read1 ;
		default:
			break;
		}
		
//		read1.add(doctorDetails); //adding data to list
		System.out.println("Details added successfully!");
		return read1; //returning list of data]
	}

	/** Add Appoinment*/
	public List<AppoinmentDetails> addAppoinment(List<AppoinmentDetails> list) { //method to add new Appoinment
		// Enter the data from User
		System.out.println("Enter the Doctor Name: ");
		appoinmentDetails.setDoctorName(Utility.stringValidation(Utility.stringInput()));

		System.out.println("Enter the Patient Id: ");
		appoinmentDetails.setPatientId(Utility.longInput());

		System.out.println("Enter the Patient Name: ");
		appoinmentDetails.setPatientName(Utility.stringValidation(Utility.stringInput()));

		System.out.println("Enter the Doctor Specialization: ");
		appoinmentDetails.setDoctorSpecialization(Utility.stringValidation(Utility.stringInput()));

		System.out.println("Enter the Doctor Availability");
		appoinmentDetails.setDoctorAvaibility(Utility.stringValidation(Utility.stringInput()));

		System.out.println("Enter the Doctor Appoinment: ");
		appoinmentDetails.setDoctorAppointment(Utility.longInput());
		
		int choice=0;
		System.out.println("1.Submit \t 2.Exit");
		choice = Utility.integerInput();
		switch (choice) {
		case 1:
			list.add(appoinmentDetails);//adding data to list
			break;
		case 2:
			return list ;
		default:
			break;
		}

//		list.add(appoinmentDetails); //adding data to list
		System.out.println("Details added successfully!");
		return list; //returning list of data]
	}

	/** Display the All Details*/
	public static int Display() throws IOException {

		PatientDetails patientDetails = new PatientDetails();
		DoctorDetails doctorDetails = new DoctorDetails();
		AppoinmentDetails appoinmentDetails = new AppoinmentDetails();
		int choice = 0;
		List<PatientDetails> list = patientDetails.readFile(); //reading json file
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
		return choice;
	}


	/** Doctor details*/
	public List<DoctorDetails> getDoctorDetails(List<DoctorDetails> docList) throws IOException {
		List<DoctorDetails> list1 = doctorDetails.readFile(); //reading json file
		System.out.println("Doctor Details");
		for(DoctorDetails dd : list1) {		
			System.out.println("Doctor Name: "+dd.getDoctorName()+", Doctor Id: "+dd.getDoctorId()+", Specialization: "+dd.getSpecialization()+", Availibility: "+dd.getAvailability()+", Appoinment: "+dd.getAppoinment());
		}
		System.out.println();
		return list1;

	}

	/** Patient Details*/
	public List<PatientDetails> getPatientDetails(List<PatientDetails> docList) throws IOException {
		List<PatientDetails> list = patientDetails.readFile(); //reading json file
		System.out.println("Patient Details");
		for(PatientDetails pd : list) {			
			System.out.println("Patient Name: "+pd.getPatientName()+", Patient Id: "+pd.getPatientId()+", Mobile No: "+pd.getMobileNumber()+", Age: "+pd.getAge());
		}
		System.out.println();
		return list;

	}

	/** Appoinment Details*/
	public List<AppoinmentDetails> getAppoinmentDetails(List<AppoinmentDetails> docList) throws IOException {
		List<AppoinmentDetails> list2 = appoinmentDetails.readFile(); //reading json file
		System.out.println("Appoinment Appoinment");
		for(AppoinmentDetails ad : list2) {			
			System.out.println("Doctor Name: "+ad.getDoctorName()+", Patient Id: "+ad.getPatientId()+", Patient Name: "+ad.getPatientName()+", Doctor Specialization: "+ad.getDoctorSpecialization()+", Doctor Avaibility: "+ad.getDoctorAvaibility()+" , Doctor Appoinment: "+ad.getDoctorAppointment());

		}
		System.out.println();
		return list2;

	}

	/** Delete patient Details*/
	public List<PatientDetails>removePatient(List<PatientDetails> list) { //method to remove Patient from file
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPatientName()); //showing all data by name
		}
		System.out.println("Enter name of Patient to remove: ");
		String nameOfPatient = Utility.stringValidation(Utility.stringInput());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPatientName().equalsIgnoreCase(nameOfPatient)) { //matching user input in list

				list.remove(i);
				System.out.println("Patient Removed!");
				break;
			}
		}
		return list;
	}

	/** Remove Appoinment*/ 
	public List<AppoinmentDetails>removeAppoinment(List<AppoinmentDetails> list) { //method to remove Patient from file
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPatientName()); //showing all data by name
		}
		System.out.println("Enter name of Patient to remove: ");
		String nameOfPatient = Utility.stringValidation(Utility.stringInput());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPatientName().equalsIgnoreCase(nameOfPatient)) { //matching user input in list

				list.remove(i);
				System.out.println("Appoinment Removed!");
				break;
			}
		}
		return list;
	}
	/** Remove Doctor*/
	public List<DoctorDetails>removeDoctor(List<DoctorDetails> List) { //method to remove Patient from file
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i).getDoctorName()); //showing all data by name
		}
		System.out.println("Enter name of Doctor to remove: ");
		String nameOfDoctor = Utility.stringValidation(Utility.stringInput());
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).getDoctorName().equalsIgnoreCase(nameOfDoctor)) { //matching user input in list

				List.remove(i);
				System.out.println("Doctor Removed!");
				break;
			}
		}
		return List;

	}


	/** Appoinment*/
	public List<AppoinmentDetails> takeAppoinment(List<AppoinmentDetails> appoinList,List<DoctorDetails> docList, List<PatientDetails> patList) throws IOException{

		try {
			System.out.println("Available Doctors are: ");
			getDoctorDetails(docList); // Doctor Details List
			System.out.println("choose available doctor");
			String docName = Utility.stringValidation(Utility.stringInput());// Enter the Doctor name
			for(int i=0 ;i< docList.size();i++) {
				if(docList.get(i).getDoctorName().equalsIgnoreCase(docName)) { //Compair Doctor Name Same or Not
					if(docList.get(i).getAppoinment() <=5) {
						//Asking the patient details
						System.out.println("Enter name of patient");
						String patientName = Utility.stringValidation(Utility.stringInput());
						patientDetails.setPatientName(patientName); // Set the Patient name in Patient Details
						appoinmentDetails.setPatientName(patientName); // Set the Patient Name in Appoinmen Details
						patientDetails.setAssignDoctor(docName);//Assign the Doctor in Patient Details
						System.out.println("Enter the Mobile Number of Patient");
						patientDetails.setMobileNumber(Utility.longInput()); // Set the Mobile Number Patient Details
						System.out.println("Enter the age of Patient");
						patientDetails.setAge(Utility.integerInput()); // Set the Age in Patient Details
						patientDetails.setPatientId(patList.size() +1); //old id +1
						long appoinment = docList.get(i).getAppoinment();// getting the Appoinment in Appoinment List
						appoinment = appoinment +1;//increasing doctor Appoinment
						//Setting data to doctor to patient
						docList.get(i).setAppoinment(appoinment); // Set the Doctor Appoinment
						// Set the data data in appoinment Details
						appoinmentDetails.setDoctorAppointment(appoinment);
						appoinmentDetails.setPatientId(patList.size() + 1);
						appoinmentDetails.setDoctorName(docName);
						appoinmentDetails.setDoctorSpecialization(docList.get(i).getSpecialization());
						appoinmentDetails.setDoctorAvaibility(docList.get(i).getSpecialization());
						appoinmentDetails.setDoctorAvaibility(docList.get(i).getAvailability());
						System.out.println("Appoinment Booked: ");
						break;
					}
					else {
						System.out.println("Appointment Full \n please take tomorrows Appointment");
						System.out.println("Enter name of patient");
						String patientName = Utility.stringValidation(Utility.stringInput());
						patientDetails.setPatientName(patientName);
						appoinmentDetails.setPatientName(patientName);
						patientDetails.setAssignDoctor(docName);
						System.out.println("Enter the Mobile Number of Patient");
						patientDetails.setMobileNumber(Utility.longInput());
						System.out.println("Enter the age of Patient");
						patientDetails.setAge(Utility.integerInput());
						patientDetails.setPatientId(patList.size() +1);
						long appoinment = docList.get(i).getAppoinment();
						appoinment = appoinment +1;//increasing doctor Appoinment
						//Setting data to doctor to patient
						docList.get(i).setAppoinment(appoinment);
						appoinmentDetails.setDoctorAppointment(appoinment);
						appoinmentDetails.setPatientId(patList.size() + 1);
						appoinmentDetails.setDoctorName(docName);
						appoinmentDetails.setDoctorSpecialization(docList.get(i).getSpecialization());
						appoinmentDetails.setDoctorAvaibility(docList.get(i).getSpecialization());
						appoinmentDetails.setDoctorAvaibility(docList.get(i).getAvailability());
						System.out.println("Appoinment Booked: ");
					}
				}
			}
			
			int choice=0;
			System.out.println("1.Submit \t 2.Exit");
			choice = Utility.integerInput();
			switch (choice) {
			case 1:
				patList.add(patientDetails);
				appoinList.add(appoinmentDetails);
				break;
			case 2:
				return appoinList ;
			default:
				break;
			}
//			patList.add(patientDetails);
//			appoinList.add(appoinmentDetails);
			doctorDetails.writeFile(docList);
			patientDetails.writeFile(patList);
		}catch (InputMismatchException e) {
			System.out.println("Enter valid Input");
		}
		return appoinList;
	}

	/**Search  Doctor*/
	public List<DoctorDetails> searchDoctor(List<DoctorDetails> docList) {
		for(int i=0 ;i<docList.size();i++) {
			System.out.println(docList.get(i).getDoctorName());
		}
		System.out.println("Enter the Doctor Name");
		String docName = Utility.stringValidation(Utility.stringInput());
		for(int i=0 ;i<docList.size();i++) {
			if(docList.get(i).getDoctorName().equalsIgnoreCase(docName)) {
				//Display details perticular doctor
				System.out.println("Doctor Name:-"+docList.get(i).getDoctorName()+", Doctor Id:-"+docList.get(i).getDoctorId()+", Specialization:-"+docList.get(i).getSpecialization()+", Availibility:-"+docList.get(i).getAvailability()+", Appoinment:-"+docList.get(i).getAppoinment());
				break;
			}
		}
		return docList;
	}
	/** Search Patient*/
	public List<PatientDetails> searchPatient(List<PatientDetails> patList) {
		for(int i=0 ;i<patList.size();i++) {
			System.out.println(patList.get(i).getPatientName());
		}
		System.out.println("Enter the Patient Name");
		String patientName = Utility.stringValidation(Utility.stringInput());
		for(int i=0 ;i<patList.size();i++) {
			if(patList.get(i).getPatientName().equalsIgnoreCase(patientName)) {
				//Display details perticular Patient
				System.out.println("Patient Name:-"+patList.get(i).getPatientName()+", Patient Id:-"+patList.get(i).getPatientId()+", Mobile No.:-"+patList.get(i).getMobileNumber()+", Age:-"+patList.get(i).getAge()+", AssignDoctor:-"+patList.get(i).getAssignDoctor());
				break;
			}
		}
		return patList;
	}
}

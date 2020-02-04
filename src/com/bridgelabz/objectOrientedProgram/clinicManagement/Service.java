package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.io.IOException;
import java.util.List;

public interface Service {

	/**Add Patient*/
	List<PatientDetails> addPatient(List<PatientDetails> list);

	/**Add Doctor*/
	List<DoctorDetails> addDoctor(List<DoctorDetails> read1);

	/** Add Appoinment*/
	List<AppoinmentDetails> addAppoinment(List<AppoinmentDetails> list);

	/** Doctor details*/
	List<DoctorDetails> getDoctorDetails(List<DoctorDetails> docList) throws IOException;

	/** Patient Details*/
	List<PatientDetails> getPatientDetails(List<PatientDetails> docList) throws IOException;

	/** Appoinment Details*/
	List<AppoinmentDetails> getAppoinmentDetails(List<AppoinmentDetails> docList) throws IOException;

	/** Delete patient Details*/
	List<PatientDetails> removePatient(List<PatientDetails> list);

	/** Remove Appoinment*/
	List<AppoinmentDetails> removeAppoinment(List<AppoinmentDetails> list);

	/** Remove Doctor*/
	List<DoctorDetails> removeDoctor(List<DoctorDetails> List);

	/** Appoinment*/
	List<AppoinmentDetails> takeAppoinment(List<AppoinmentDetails> appoinList, List<DoctorDetails> docList,
			List<PatientDetails> patList) throws IOException;

	/**Search  Doctor*/
	List<DoctorDetails> searchDoctor(List<DoctorDetails> docList);

	/** Search Patient*/
	List<PatientDetails> searchPatient(List<PatientDetails> patList);

}
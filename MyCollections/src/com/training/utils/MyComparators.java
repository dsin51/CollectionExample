package com.training.utils;

import java.util.Comparator;

import com.training.Doctor;
import com.training.Patient;

public class MyComparators {

	public class NameComparator implements Comparator<Doctor>{

		@Override
		public int compare(Doctor arg0, Doctor arg1) {
			
			return arg0.getDoctorName().compareTo(arg1.getDoctorName());
		}}
	
	public class SpecializationComparator implements Comparator<Doctor>{

		@Override
		public int compare(Doctor o1, Doctor o2) {
			return o1.getSpecialization().compareTo(o2.getSpecialization());
		}}
	
	public class PatientComparator implements Comparator<Patient> {

		@Override
		public int compare(Patient o1, Patient o2) {
			return o1.getPatientName().compareTo(o2.getPatientName());
		}
		
	}
}

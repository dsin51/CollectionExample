package com.training.utils;

import java.util.Comparator;

import com.training.Doctor;

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
}

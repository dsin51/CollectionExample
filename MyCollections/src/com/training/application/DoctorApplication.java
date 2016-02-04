package com.training.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import com.training.Doctor;
import com.training.NursingHome;
import com.training.Patient;

public class DoctorApplication {

	public static void main(String[] args) {
		
		NursingHome nursingHome = new NursingHome();
		
		Doctor doc1 = new Doctor(101, "Ramesh", "mental");
		Doctor doc2 = new Doctor(102, "Rajesh", "dental");
		Doctor doc3 = new Doctor(103, "Rakesh", "rental");
		Doctor doc4 = new Doctor(104, "Suresh", "surgeon");
		
		nursingHome.addDoctor(doc1);
		nursingHome.addDoctor(doc2);
		nursingHome.addDoctor(doc3);
		nursingHome.addDoctor(doc4);
		
		
		Patient p1 = new Patient(901, "Gaurav", 90);
		Patient p2 = new Patient(902, "Gaurav2", 90);
		
		TreeSet<Patient> patients = new TreeSet<Patient>();
//		HashSet<Patient> patients = new HashSet<Patient>();
		patients.add(p1);
		patients.add(p2);
		
		doc1.setPatients(patients);
		
		nursingHome.printDoctorList();
		
		
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter choice: 1/2/3");
		int key = sin.nextInt();
		nursingHome.printSortedList(key);
	}

}

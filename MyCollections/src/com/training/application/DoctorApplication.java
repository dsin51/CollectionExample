package com.training.application;

import java.util.Scanner;

import com.training.Doctor;
import com.training.NursingHome;

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
		
		nursingHome.printDoctorList();
		
		
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter choice: 1/2/3");
		int key = sin.nextInt();
		nursingHome.printSortedList(key);
	}

}

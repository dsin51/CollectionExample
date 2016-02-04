package com.training;

import java.util.*;

import com.training.utils.MyComparators;

public class NursingHome {

	private ArrayList<Doctor> doclist;
	
	
	public NursingHome()
	{
		super();
		doclist = new ArrayList<Doctor>();
	}
	
	public boolean addDoctor(Doctor doc) 
	{
		boolean result = doclist.add(doc);		
		return result;
	}
	
	public void printDoctorList() 
	{
	
		
		for(Doctor doc :doclist)
		{
			if(doc.getPatients()!=null)
			{
				System.out.println(doc);
				System.out.println("Appointments");
				for(Patient pat:doc.getPatients())
				{
					System.out.println(pat);
				}
			}
		}
	}
	
	public void printSortedList(int key)
	{
		switch (key) {
		case 1:
			printDoctorList();
			break;
		case 2:
			MyComparators mycomp1 = new MyComparators();
			MyComparators.NameComparator comp1 = mycomp1.new NameComparator();
			Collections.sort(doclist,comp1);
			printDoctorList();
			break;
		case 3:
			MyComparators mycomp2 = new MyComparators();
			MyComparators.SpecializationComparator comp2 = mycomp2.new SpecializationComparator();
			Collections.sort(doclist,comp2);
			printDoctorList();
			break;
		default:
			break;
		}
	}
}

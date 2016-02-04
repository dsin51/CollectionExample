package com.training;


public class Patient implements Comparable<Patient>{

	private long patientId;
	private String patientName;
	private int patientAge;
	
	
	
	public Patient(long patientId, String patientName, int patientAge) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	
	@Override
	public int compareTo(Patient o) {
		if(patientId < o.patientId) return -1;
		if(patientId > o.patientId) return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge + "]";
	}

	
}

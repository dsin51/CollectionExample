package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YourThread obj = new YourThread();
		
		Thread t1 = new Thread(obj,"Ram");
		Thread t2 = new Thread(obj,"Shyam");
		Thread t3 = new Thread(obj,"Sam");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
		
	}
}

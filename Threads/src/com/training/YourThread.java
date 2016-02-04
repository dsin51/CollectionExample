package com.training;

public class YourThread implements Runnable {
	
	double i = 100;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(calculate());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public double calculate() {
		
		return ++i;
	}
}

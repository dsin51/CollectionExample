package com.training.apps;

import com.training.ifaces.Greeting;

public class FirstApplication {

	public static void main(String[] args) {

		Greeting grt = () -> {System.out.println("Welcome to Java 8");};
		grt.show();
	}

}

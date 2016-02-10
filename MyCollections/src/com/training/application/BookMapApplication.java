package com.training.application;

import com.training.maps.Books;

public class BookMapApplication {

	public static void main(String[] args) {

		Books b = new Books();
		b.init();
		
		
		b.printDetails();
	}

}

package com.training.application;

import com.training.maps.TranslateService;

public class MapApplication {

	public static void main(String[] args) {
		
		TranslateService ts = new TranslateService();
		ts.printWords();
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println(ts.findEnglishWord("do"));
	}

}

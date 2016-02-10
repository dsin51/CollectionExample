package com.training.maps;

import java.util.*;

public class TranslateService {

	private Hashtable<String, String> hindiToEnglish;

	public TranslateService() {
		hindiToEnglish = new Hashtable<String, String>();
		init();
	}
	
	public void init() {
		
		hindiToEnglish.put("ek", "one");
		hindiToEnglish.put("do", "two");
		hindiToEnglish.put("chawal", "rice");
	}
	
	public String findEnglishWord(String hindiWord)
	{
		return hindiToEnglish.get(hindiWord);
	}
	
	public void printWords() {
		
		Set<Map.Entry<String, String>> list = hindiToEnglish.entrySet();
		
		for(Map.Entry<String, String> words:list) {
			
			System.out.println(words.getKey() + ":" + words.getValue());
		}
	}
	
	
}

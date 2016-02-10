package com.training.maps;

import java.util.*;

public class Books {
	
	private String bname;
	
	private Hashtable<String, List<Books>> bookTable;
	
	
	
	public Books(String bname) {
		super();
		this.bname = bname;
	}

	public Books() {
		bookTable = new Hashtable<String, List<Books>>();
		init();
	}
	
	public void init() {
		
		Books b1 = new Books("book101");
		Books b2 = new Books("book102");
		ArrayList<Books> list1 = new ArrayList<Books>();
		list1.add(b1);
		list1.add(b2);
		
		Books b3 = new Books("book201");
		Books b4 = new Books("book202");
		ArrayList<Books> list2 = new ArrayList<Books>();
		list2.add(b3);
		list2.add(b4);
		

		bookTable.put("one", list1);
		bookTable.put("two", list2);
		
		}
		public List<Books> findDetails(String number)
		{
			return bookTable.get(number);
		}
		
		public void printDetails()
		{
			Set<Map.Entry<String,List<Books>>> list = bookTable.entrySet();
			
			for(Map.Entry<String, List<Books>> book : list)
			{
				System.out.println(book.getKey() + ":" + book.getValue());
			}
		}
	
		@Override
		public String toString() {
			return "bname=" + bname ;
		}
}

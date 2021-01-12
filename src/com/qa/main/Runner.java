package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		Duck d1 = new Duck("Steve", false, 2);
		Duck d2 = new Duck("Bob", false, 2);
		Duck d3 = new Duck("Scruffy", true, 4);
		Duck d4 = new Duck("Feathers", false, 1);
		Duck d5 = new Duck("William IV the Eternal", true, 57000);
		
		DuckManager ListOfDucks = new DuckManager();
		ListOfDucks.addToList(d1);
		ListOfDucks.addToList(d2);
		ListOfDucks.addToList(d3);
		ListOfDucks.addToList(d4);
		ListOfDucks.addToList(d5);
		
		ListOfDucks.printAllDucks();
		ListOfDucks.duckSearch("William IV the Eternal");
		ListOfDucks.printMallardDucks();
		ListOfDucks.sortAndPrintList();
		
	}
	
	

}

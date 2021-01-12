package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckManager {
	
	// list implementation
	
		public List<Duck> DuckList = new ArrayList<>();
		
		
		// method to add object to DuckList
		
		public void addToList(Duck duck) {
			DuckList.add(duck);
		}
		

		
		// method to search for duck in DuckList
		
		public Duck duckSearch(String input) {
			for (Duck i: DuckList) {
				
				if (i.getName().equals(input)); {
					System.out.println("Our records contain this duck");
					return i;
				}
				
			}
			
			return null;
		}
		
		// method to print all Duck objects in DuckList 
		
		public void printAllDucks() {
			
			for (Duck i: DuckList) {
				System.out.println(i);
				
			}
		}
		
		// method to print all mallard duck objects in DuckList 
		
		public void printMallardDucks() {
			
			for (Duck i : DuckList) {
				if (i.isAMallard() == true) {
					System.out.println(i);
				}
			}
			System.out.println("These are the mallard ducks in our system.");
		}
		
		// method to sort and print all duck objects (using collections import and .sort() functionality
		
		public void sortAndPrintList() {
			List<String> duckNames = new ArrayList<>();
			
			for (Duck d : DuckList) {
				duckNames.add(d.getName());
			}
			Collections.sort(duckNames);
			System.out.println(duckNames);
		}

}

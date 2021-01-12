package com.qa.main;

public class Duck {
	
	// variables 
	
	private String name;
	private boolean isAMallard;
	private int age;
	
	// constructor 
	
	public Duck(String name, boolean isAMallard, int age) {
		super();
		this.name = name;
		this.isAMallard = isAMallard;
		this.age = age;
	}
	
	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAMallard() {
		return isAMallard;
	}

	public void setAMallard(boolean isAMallard) {
		this.isAMallard = isAMallard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Duck [name= " + name + ", isAMallard= " + isAMallard + ", age= " + age + "]";
	}
	
	

}

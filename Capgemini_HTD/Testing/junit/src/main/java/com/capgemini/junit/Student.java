package com.capgemini.junit;

public class Student {
	
	public Student() {
	}
	
	public Student(String name, Double percentage, char gender) {
		//this.id = id;    //auto-increment
		this.name = name;
		this.percentage = percentage;
		this.gender = gender;
	}



	private int id;
	private String name;
	private Double percentage;
	private char gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

}

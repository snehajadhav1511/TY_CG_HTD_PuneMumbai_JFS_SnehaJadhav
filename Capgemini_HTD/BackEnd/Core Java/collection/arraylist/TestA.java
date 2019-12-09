package com.capgemini.corejava.arraylist;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {

		ArrayList<Student> al =new ArrayList<Student>();
		Student s1= new Student(1, "Sneha", 34.80);
		Student s2= new Student(2, "Saumya", 50.00);
		Student s3= new Student(3, "Shubham", 78.90);
		Student s4= new Student(4, "Varsha", 80.66);
		Student s5= new Student(5, "Namdev", 82.66);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Helper h=new Helper();
		
		h.display(al);
		h.passStudent(al);
		h.onlyDistinction(al);

	}
}

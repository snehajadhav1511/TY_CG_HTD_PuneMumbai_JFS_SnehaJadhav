package com.capgemini.Assignment;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1= new Student(1, "Sneha", 70.80);
		Student s2= new Student(2, "Saumya", 77.00);
		Student s3= new Student(3, "Shubham", 78.90);
		Student s4= new Student(4, "Varsha", 80.66);
		Student s5= new Student(5, "Namdev", 82.66);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		void receive(Student t) {
			System.out.println("******I am Database*******");
			System.out.println("Student id is: "+t.getId());
			System.out.println("Student name is: "+t.getName());
			System.out.println("Student height is: "+t.getHeight());
		}
		
		
	}
}

package com.capgemini.Studentapp;

import java.util.ArrayList;
import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> al = new ArrayList<Student>();

		System.out.println("Enter number \n1.for add Student \n2.for display Student");
		int opt = sc.nextInt(); 
		switch (opt) {
		case 1:
			Student s = new Student();
			
			s.id=sc.nextInt();
			
			s.name=sc.
			
			break;

		default:
			break;
		}
		/*
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


			System.out.println("******I am Database*******");
			System.out.println("Student id is: "+t.getId());
			System.out.println("Student name is: "+t.getName());
			System.out.println("Student height is: "+t.getHeight());*/
	}


}


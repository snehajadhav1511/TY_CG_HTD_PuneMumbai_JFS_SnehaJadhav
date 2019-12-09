package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestO {
	public static void main(String[] args) {

		ArrayList<Student> al= new ArrayList<Student>();

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

		//
		for(Student s:al) {
			System.out.println("Student id is: "+s.id);
			System.out.println("Student name is:  "+s.name);
			System.out.println("Student percentage is: "+s.percentage);
			System.out.println("***********************************");

		}
		//
		for(int i=0;i<5;i++) {
			Student s=al.get(i);
			System.out.println("Student id is: "+s.id);
			System.out.println("Student name is:  "+s.name);
			System.out.println("Student percentage is: "+s.percentage);
			System.out.println("***********************************");
		}
		//
		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("Student id is: "+s.id);
			System.out.println("Student name is:  "+s.name);
			System.out.println("Student percentage is: "+s.percentage);
			System.out.println("***********************************");
		}



	}

}


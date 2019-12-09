package com.capgemini.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestStudent {

	public static void main(String[] args) {

		Student s1= new Student(1, "Sneha", 70.80);
		Student s2= new Student(2, "Saumya", 77.00);
		Student s3= new Student(3, "Shubham", 78.90);
		Student s4= new Student(4, "Varsha", 80.66);
		Student s5= new Student(5, "Namdev", 82.66);
		Student s6= new Student(6, "Snehal", 78.66);
		Student s7= new Student(7, "Roshan", 56.66);
		Student s8= new Student(8, "Nitish", 90.66);
		Student s9= new Student(9, "Nisha", 28.66);

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);

		ArrayList<Student> al2= new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);

		ArrayList<Student> al3= new ArrayList<Student>();
		al3.add(s6);
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);

		LinkedHashMap<String, ArrayList<Student>> hm = new LinkedHashMap<String , ArrayList<Student>>();

		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);

		ArrayList<Student> al = hm.get("first");
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is: "+s.name);
			System.out.println("Id is: "+s.id);
			System.out.println("Precentage is: "+s.percentage);
			System.out.println("-------------------------------");

		}

	}

}

package com.capgemini.corejava.arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class Helper {

	public void display(ArrayList<Student> k) {
		for(Student s:k) {
			System.out.println("name is:"+s.name);
			System.out.println("id is:"+s.id);
			System.out.println("perentage is:"+s.percentage);
			System.out.println("*********************");

		}
	}
	public void passStudent(ArrayList<Student> k) {

		System.out.println("Passed Students are:");

		Iterator<Student> it=k.iterator();
		while(it.hasNext()) {
			Student r=it.next();

			if(r.percentage>=35) {
				System.out.println(r.name);
			}
		}
		System.out.println("*********************");

	}
	public void onlyDistinction(ArrayList<Student> k) {

		System.out.println("Students who got Distinction:");

		Iterator<Student> it=k.iterator();
		while(it.hasNext()) {
			Student r=it.next();

			if(r.percentage>=70) {
				System.out.println(r.name);
			}
		}
	}



}

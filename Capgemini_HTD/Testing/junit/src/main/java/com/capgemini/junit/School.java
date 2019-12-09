package com.capgemini.junit;

import java.util.ArrayList;

public class School {
	
	private ArrayList<Student> al = new ArrayList<Student>();
	
	public Student registerStudent(Student student) {
		int rollnumber = al.size() + 1;
		student.setId(rollnumber);
		al.add(student);
		return student;
		
	}
}

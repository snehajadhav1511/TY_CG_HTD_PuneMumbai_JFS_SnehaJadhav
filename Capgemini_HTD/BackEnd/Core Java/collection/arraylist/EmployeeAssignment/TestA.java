package com.capgemini.corejava.arraylist.EmployeeAssignment;

import java.util.TreeSet;

public class TestA {
	public static void main(String[] args) {
	
	TreeSet<Employee> al = new TreeSet<Employee>();
	Employee e1 = new Employee(1, "Sneha", 35456.54);
	Employee e2 = new Employee(2, "Saumya", 40980.56);
	Employee e3 = new Employee(3, "Shubham", 49990.34);
	Employee e4 = new Employee(4, "Nisha", 50980.79);
	Employee e5 = new Employee(5, "Saumya", 40980.56);

	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	
	
	
	
	}
}

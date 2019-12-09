package com.capgemini.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestA {
	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee e1 = new Employee(1, "Sneha", 35456.54);
		Employee e2 = new Employee(2, "Saumya", 40980.56);
		Employee e3 = new Employee(3, "Shubham", 49990.34);
		Employee e4 = new Employee(4, "Nisha", 50980.79);
		Employee e5 = new Employee(5, "Saumya", 40980.56);

	
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println("Employee id is:"+e.id);
			System.out.println("Employee name is:"+e.name);
			System.out.println("Employee salary:"+e.salary);
			System.out.println("*********************");
		}
	}
	

}

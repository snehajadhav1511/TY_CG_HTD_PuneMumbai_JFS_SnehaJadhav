package com.capgemini.corejava.arraylist.EmployeeAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {
	
	ArrayList<Employee> al = new ArrayList<Employee>();
	
	public void display(ArrayList<Employee> al) {
		Iterator<Employee> it = al.iterator(); 
		while(it.hasNext()) {
			
		Employee e=it.next();
		
		System.out.println("Employee id is:"+e.id);
		System.out.println("Employee name is:"+e.name);
		System.out.println("Employee salary:"+e.salary);
		System.out.println("*********************");
		
		}
	}
	
}

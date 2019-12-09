package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class);
		System.out.println("Enter Employee Id:");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		String empName = sc.nextLine();
		
		emp1.setEmpId(empId);
		emp1.setEmpName(empName);
		
		System.out.println("Emp-1 Id   = "+emp1.getEmpId());
		System.out.println("Emp-1 Name = "+emp1.getEmpName());
		
EmployeeBean emp2 = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Enter Employee Id:");
		int empId2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		String empName2 = sc.nextLine();;
		
		emp2.setEmpId(empId2);
		emp2.setEmpName(empName2);
		
		System.out.println("Emp-1 Id   = "+emp1.getEmpId());
		System.out.println("Emp-1 Name = "+emp1.getEmpName());
		System.out.println("Emp-2 Id   = "+emp2.getEmpId());
		System.out.println("Emp-2 Name = "+emp2.getEmpName());

	}//end of main
}//end of class

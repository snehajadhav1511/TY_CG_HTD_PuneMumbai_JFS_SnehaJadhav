package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeDeptTest {
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee2.xml","department.xml");
		EmployeeBean employeeBean = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Employee ID is         = " + employeeBean.getEmpId());
		System.out.println("Employee Name is       = " + employeeBean.getEmpName());
		System.out.println("Employee Dept No. is   = " + employeeBean.getDeptBean().getDeptId());
		System.out.println("Employee Dept Name is  = " + employeeBean.getDeptBean().getDeptName());
	}

}

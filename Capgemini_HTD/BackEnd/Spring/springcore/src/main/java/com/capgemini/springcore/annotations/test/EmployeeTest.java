package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.beans.EmployeeBean;
import com.capgemini.springcore.annotations.config.DepartmentConfig;
import com.capgemini.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {
	public static void main(String[] args) {
		
		//Instatatiation
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		//
		
		System.out.println("Emp Id = "+ employeeBean.getEmpId());
		System.out.println("Emp Name = " + employeeBean.getEmpName());
		System.out.println("Department info------");
		System.out.println("Dept No. = "+employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept Name = "+employeeBean.getDeptBean().getDeptName());
		
		//To destroy object 
		((AbstractApplicationContext)context).close();
	}//End of main

}//End of class

package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;

import com.capgemini.springcore.annotations.beans.DepartmentBean;

public class DepartmentConfig {

	@Bean(name = "dev")
	public DepartmentBean getDevDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(501);
		bean.setDeptNmae("developer");
		return bean;
		
	}
	
	//more than 1 department
	@Bean(name = "test")
	public DepartmentBean getTestDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(502);
		bean.setDeptNmae("testing");
		return bean;
	}
	
	@Bean(name = "hr")
	//@Primary
	public DepartmentBean getHRDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(503);
		bean.setDeptNmae("HR");
		return bean;
		
	}
}

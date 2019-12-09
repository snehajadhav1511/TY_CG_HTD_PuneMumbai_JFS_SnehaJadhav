package com.capgemini.springboot.dao;

import java.util.List;

import com.capgemini.springboot.beans.EmployeeInfoBean;


public interface EmployeeDAO {

	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBeans);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBeans);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();
}

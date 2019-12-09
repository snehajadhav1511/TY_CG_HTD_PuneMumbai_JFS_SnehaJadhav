package com.capgemini.springrest.service;

import java.util.List;

import com.capgemini.springrest.beans.EmployeeInfoBean;

public interface EmployeeService {
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBeans);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBeans);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();

}

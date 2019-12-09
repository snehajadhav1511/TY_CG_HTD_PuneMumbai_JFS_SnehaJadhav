package com.capgemini.empwebapp.dao;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;

public interface EmployeeDAO {

	public EmployeeInfoBeans getEmployee(int empId);
	public EmployeeInfoBeans authenticate(int empId, String pwd);
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans);
}

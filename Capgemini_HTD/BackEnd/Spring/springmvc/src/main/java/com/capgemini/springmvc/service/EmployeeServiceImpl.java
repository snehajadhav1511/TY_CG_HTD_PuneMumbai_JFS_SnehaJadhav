package com.capgemini.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvc.beans.EmployeeInfoBeans;
import com.capgemini.springmvc.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public EmployeeInfoBeans getEmployee(int empId) {
		return dao.getEmployee(empId);
	}

	@Override
	public EmployeeInfoBeans authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans) {
		return dao.addEmployee(employeeInfoBeans);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans) {
		return dao.updateEmployee(employeeInfoBeans);
	}
	
	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}

	@Override
	public List<EmployeeInfoBeans> getAllEmployees() {
		return dao.getAllEmployees();
	}


}

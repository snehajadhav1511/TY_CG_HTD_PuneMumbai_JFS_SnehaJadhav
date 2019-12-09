package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if (employeeInfoBean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Employee Record Found");
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Employee Id " + empId + "Not Found");

		}
		return response;

	}// End of getEmployee()

	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public boolean addEmployee(@RequestBody EmployeeInfoBean employeeInfoBeans) {
		return service.addEmployee(employeeInfoBeans);
	}

	@DeleteMapping(path = "/deleteEmployee", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public boolean deleteEmployee(int empId) {

		return service.deleteEmployee(empId);

	}

	@PostMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public boolean updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBeans) {

		return service.updateEmployee(employeeInfoBeans);
	}

	@GetMapping(path = "/getAll", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getAllEmployee() {
		List<EmployeeInfoBean> employeeList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();

		if (employeeList != null && !employeeList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Employees Record Found...");
			response.setEmployeeList(employeeList);
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("EUnable to fetch Employee Records!");
		}
		return response;
	}
}// End of controller

package com.capgemini.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.beans.EmployeeInfoBeans;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/empLoginForm")
	public String DisplayLoginForm() {
		return "empLoginForm";

	}// End of DisplayLoginForm()

	@PostMapping("/empLogin")
	public String empLogin(int empId, String password, ModelMap modelMap, HttpServletRequest req) {
		EmployeeInfoBeans employeeInfoBeans = service.authenticate(empId, password);

		if (employeeInfoBeans != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBeans", employeeInfoBeans);
			return "empHomePage";

		} else {
			String msg = "Invalid Credential...";
			modelMap.addAttribute("msg", msg);
			return "empLoginForm";
		}
	}

	@GetMapping("/addEmployeeForm")
	public String displayAddEmployeeForm(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			//Invalid session
			return "empLoginForm";
		} else {
			//valid session
			return "addEmployeeForm";
		}	
	}

	@PostMapping("/addEmployee")
	public String addEmployee(EmployeeInfoBeans employeeInfoBeans,HttpSession session,ModelMap modelMap) { 
		
		if (session.isNew()) {
			//Invalid session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		} else {
			//valid session
			if(service.addEmployee(employeeInfoBeans)) {
				//if return true
				modelMap.addAttribute("msg", "employee Details updated Successfully");
			} else {
			
				modelMap.addAttribute("msg", "Unable to update Employee Details");				
			}
		}
		return "addEmployeeForm";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap modelMap) {
		session.invalidate();
		
		modelMap.addAttribute("msg", "Logged Out successfully");
		return "empLoginForm";
	}//End of logout()

	@GetMapping("/updateEmployeeForm")
	public String displayUpdateEmployeeForm(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			//Invalid session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		} else {
			//valid session
			return "updateEmployeeForm";
		}	
	}

	@PostMapping("/updateEmployee")
public String updateEmployee(EmployeeInfoBeans employeeInfoBeans,HttpSession session,ModelMap modelMap) { 
		
		if (session.isNew()) {
			
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		} else {
			if(service.updateEmployee(employeeInfoBeans)) {
				
				modelMap.addAttribute("msg", "employee updated");
			} else {
				modelMap.addAttribute("msg", "Unable to add Employee");				
			}
		}
		return "updateEmployeeForm";
	}
	@GetMapping("/searchEmployeeForm")
	public String displaySearchEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "searchEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()
	
	@GetMapping("/searchEmployee")
	public String searchEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			EmployeeInfoBeans employeeInfoBean = service.getEmployee(empId);
			if (employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!!!");
			}
			
			return "searchEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/deleteEmployeeForm")
	public String displayDeleteEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "deleteEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			if(service.deleteEmployee(empId)) {
				modelMap.addAttribute("msg", "Employee Deleted Successfully!");
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!");
			}
			
			return "deleteEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/displayAllEmployees")
	public String getAllEmployees(HttpSession session, ModelMap modelMap) {
		
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			List<EmployeeInfoBeans> employeesList = service.getAllEmployees();
			modelMap.addAttribute("employeesList", employeesList);
			
			return "displayAllEmployees";
		}
	}// End of getAllEmployees()
	
	@GetMapping("/home")
	public String displayEmpHomePage(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "empHomePage";
		}
	}// End of displayEmpHomePage()
}// End of class

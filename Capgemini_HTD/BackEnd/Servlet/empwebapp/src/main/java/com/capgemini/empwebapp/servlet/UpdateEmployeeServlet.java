package com.capgemini.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJImpl;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session = req.getSession();
		if (session != null ) {
			int empValId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName`");
			String password = req.getParameter("password");
			String mobile = req.getParameter("mobile");
			String age = req.getParameter("age");
			String gender = req.getParameter("gender");
			String salary = req.getParameter("salary");
			String designation = req.getParameter("designation");
			//long mobileVal = Long.parseLong(req.getParameter("mobile"));
			
			EmployeeInfoBeans employeeInfoBeans = new EmployeeInfoBeans();
			employeeInfoBeans.setEmpId(empValId);
			
			if(empName!=null && empName.isEmpty()) {
				employeeInfoBeans.setEmpName(empName);
				
			}
			if (password != null && password.isEmpty()) {
				employeeInfoBeans.setPassword(password);
			}
			if(mobile != null && mobile.isEmpty()) {
				employeeInfoBeans.setMobile(Long.parseLong(mobile));
			}
			if(age != null && age.isEmpty()) {
				employeeInfoBeans.setAge(Integer.parseInt(age));
			}
			if(gender != null && gender.isEmpty()) {
				employeeInfoBeans.setGender(gender.charAt(0));
			}
			if(salary != null && salary.isEmpty()) {
				employeeInfoBeans.setSalary(Double.parseDouble(salary));
			}
			
			EmployeeDAO dao = new EmployeeDAOJImpl();
			boolean isAdded = dao.updateEmployee(employeeInfoBeans);
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (isAdded) {
				out.println("<h2>Employee Record Updated Successfully...</h2>");
			}else {
				out.println("<h2 style=''color :red>Unable to update Employee Record!!!...</h2>");
			}
			out.println("</body>");
			out.println("</html>");
			
		} else {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Please Login First...</h2>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);

		}
	}//end of doPost
}//end of class

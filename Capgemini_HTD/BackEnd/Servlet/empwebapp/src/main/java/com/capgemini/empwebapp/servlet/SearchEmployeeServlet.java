package com.capgemini.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJImpl;

@WebServlet("/Searchemployee")
public class SearchEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get the form data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EmployeeDAO dao = new EmployeeDAOJImpl();
		EmployeeInfoBeans employeeInfoBeans = dao.getEmployee(empId);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<html>");
		out.println("<body>");

		if (employeeInfoBeans != null) {
			// display emp record
			out.println("<h2>Employee ID " + empId + " Found<h2>");
			out.println("Employee Name: " + employeeInfoBeans.getEmpName());
			out.println("<br>Employee Age: " + employeeInfoBeans.getAge());
			out.println("<br>Employee Gender: " + employeeInfoBeans.getGender());
			out.println("<br>Employee mobile: " + employeeInfoBeans.getMobile());
			out.println("<br>Employee salary: " + employeeInfoBeans.getSalary());
			out.println("<br>Employee designation: " + employeeInfoBeans.getDesignation());
			out.println("<br>Employee Password: " + employeeInfoBeans.getPassword());

		} else {
			// display error message
			out.println("<h3 style='color:red'>Employee ID " + empId + " Not Found</h3>");

		}
		out.println("</body>");
		out.println("</html>");
	}
}// end of class

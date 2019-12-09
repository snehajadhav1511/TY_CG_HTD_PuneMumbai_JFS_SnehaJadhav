package com.capgemini.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		String empIdVal = req.getParameter("empId");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Employee Id " + empIdVal + " Found</h1>");
		out.print("Employee name: Sneha<br>");
		out.print("Designation: Developer<br>");
		out.print("Salary: 25000<br>");
		out.println("Employee address: Mumbai");
		out.print("</body>");
		out.print("</html>");
	}

}

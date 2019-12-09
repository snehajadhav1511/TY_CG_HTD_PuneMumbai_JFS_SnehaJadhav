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

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null) {
			// valid session
			// get the form data
			int empValId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName`");
			String password = req.getParameter("password");
			long mobileVal = Long.parseLong(req.getParameter("mobile"));

			EmployeeInfoBeans employeeInfoBeans = new EmployeeInfoBeans();
			employeeInfoBeans.setEmpId(empValId);
			employeeInfoBeans.setEmpName(empName);
			employeeInfoBeans.setPassword(password);

			EmployeeDAO dao = new EmployeeDAOJImpl();
			boolean isAdded = dao.addEmployee(employeeInfoBeans);
			System.out.println(isAdded);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");

			if (isAdded) {
				out.println("<h2>Employee Record Added Successfully...</h2>");
			} else {

				out.println("<h2 style=''color :red>Unable to add Employee Record!!!...</h2>");
			}
			out.println("</body>");
			out.println("</html>");
		} else {
			// Invalid Session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Please Login First...</h2>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);

		}
	}

}

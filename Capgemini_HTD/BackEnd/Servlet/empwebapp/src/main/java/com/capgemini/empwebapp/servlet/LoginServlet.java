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

import org.hibernate.Session;
import org.hibernate.cfg.SetSimpleValueTypeSecondPass;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empIdVal = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");
		
		resp.setContentType("text/html");
		EmployeeDAO dao = new EmployeeDAOJImpl();
		EmployeeInfoBeans employeeInfoBeans = dao.authenticate(empIdVal, password);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		RequestDispatcher dispatcher = null;
		if(employeeInfoBeans != null) {
			HttpSession httpSession = req.getSession(true);
			//httpSession.setMaxInactiveInterval(60);                //arg in secs 1 min=60 sec  for 7 days 7*24*60*60
			httpSession.setAttribute("empInfo", employeeInfoBeans);
			out.println("<h2>  Hello "+ employeeInfoBeans + "</h2>");
			dispatcher = req.getRequestDispatcher("./homePage.html");
		}else {
			out.println("<h2 style: 'color:red'>Invalid Credentials</h2>");
			dispatcher = req.getRequestDispatcher("./loginForm.html");
		}
		dispatcher.include(req, resp);
		
		out.println("</body>");
		out.println("</html>");

	}

}

package com.capgemini.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	
	public  DateServlet() {
		System.out.println("It's Instsantiation phase");
	}
	
	@Override
	public void init() throws ServletException {
System.out.println("It's Initiation phase");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("It's Service phase");

		Date date = new Date();
				
		ServletContext context = getServletContext();
		String CompanyNameVal = context.getInitParameter("CompanyName");
		
		//resp.setHeader("refresh", "1");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv='refresh' content='1'>");
		out.println("<body>");
		out.println("<h1>Current system Date & Time- <br>");
		out.println(date + "</h1>");
		out.println("<h2> Context param value is - " + CompanyNameVal + "<h2>");
		out.println("</body>");	
		out.println("</html>");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("It's Destroy");
	}
}

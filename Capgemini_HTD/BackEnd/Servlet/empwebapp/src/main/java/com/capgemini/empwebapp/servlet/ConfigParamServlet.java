package com.capgemini.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigParamServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		ServletConfig config = getServletConfig();
		String empNameVal = config.getInitParameter("empName");

		ServletContext context = getServletContext(); // another method to create ServletContext-----req.getServletContext()
		String CompanyNameVal = context.getInitParameter("CompanyName");

		PrintWriter o = resp.getWriter();
		o.println("<html>");
		o.println("<body>");
		o.println("<h2> Config param value is - " + empNameVal + "<h2>");
		o.println("<h2> Context param value is - " + CompanyNameVal + "<h2>");
		o.println("</body>");
		o.println("</html>");

	}// emd of doget
}// end of class

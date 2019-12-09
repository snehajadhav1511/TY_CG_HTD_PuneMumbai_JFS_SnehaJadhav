package com.capgemini.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//String url = "./currentDate";           //dynamic resource
		
		//response of servlet is included
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h4>Hello user</h4>");
		
		String url = "./Searchemployee.html";   //static resource

		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.include(req, resp);
		
		out.println("<br>Thank you for visiting!!!!");
		out.println("</body>");
		out.println("</html>");
		
	}

}

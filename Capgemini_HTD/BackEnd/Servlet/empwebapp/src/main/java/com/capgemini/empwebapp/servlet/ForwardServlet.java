package com.capgemini.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	// we are typing url so we used of get method
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//String url = "./currentDate";    //dynamic resource
		String url = "./Searchemployee.html";   //static resource
		
		//response of servlet is not forwarded or not included
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello");
		out.println("</body>");
		out.println("</html>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		//giving child object 
		dispatcher.forward(req, resp);
	}
}

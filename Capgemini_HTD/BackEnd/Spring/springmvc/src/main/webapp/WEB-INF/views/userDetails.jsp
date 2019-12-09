<%@page import="com.capgemini.springmvc.beans.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	/* String empId = (String) request.getAttribute("empId"); */
	/* 		String password = (String) request.getAttribute("pwd");
	 */
	/* int empId = (int) request.getAttribute("empId");
	String password = (String) request.getAttribute("password"); */ //for approach 3

	//for approach4
	UserBean userBean = (UserBean) request.getAttribute("userBean");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Entered employee Id =
	<%=empId%>
	Entered password =
	<%=password%> --%>
	<!-- for approach 4 -->
	Entered employee Id =
	<%= userBean.getEmpId() %>
	<br>
	Entered password =
	<%= userBean.getPassword() %>
	<br>
	Entered DOB = 
	<%= userBean.getDate() %>
</body>
</html>
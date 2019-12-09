<%@page import="com.capgemini.springmvc.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page session="false"%>

<%
	HttpSession session = request.getSession(false);
	EmployeeInfoBeans employeeInfoBeans = (EmployeeInfoBeans) session.getAttribute("employeeInfoBeans");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
		Welcome
		<%=employeeInfoBeans.getEmpName()%>!!
	</h3>
	<a href="./searchEmployeeForm">Search Employee</a><br>
	<a href="./addEmployeeForm">Add Employee</a><br>
	<a href="./updateEmployeeForm">Update Employee</a><br>
	<a href="./deleteEmployeeForm">Delete Employee</a><br>
	<a href="./displayAllEmployees">See All Employees</a>
	<br>
	<a href="./logout">Logout</a>
</body>
</html>
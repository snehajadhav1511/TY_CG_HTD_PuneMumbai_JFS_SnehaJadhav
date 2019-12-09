<%@page import="java.util.List"%>
<%@page import="com.capgemini.springmvc.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="false" %>

<%	List<EmployeeInfoBeans> employeesList = (List<EmployeeInfoBeans>) request.getAttribute("employeesList"); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<br>
	<br>
	<%
		if (employeesList != null && !employeesList.isEmpty()) {
	%>
	<div align="center">
		<table>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Mobile</th>
			</tr>
			<%
				for (EmployeeInfoBeans employeeInfoBean : employeesList) {
			%>
			<tr>
				<td><%=employeeInfoBean.getEmpName()%></td>
				<td><%=employeeInfoBean.getAge()%></td>
				<td><%=employeeInfoBean.getSalary()%></td>
				<td><%=employeeInfoBean.getDesignation()%></td>
				<td><%=employeeInfoBean.getMobile()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	<%
		} else {
	%>
	<h3 style="color: red;">Unable To Fetch Records!!!</h3>
	<%
		}
	%>
	F
</body>
</html>
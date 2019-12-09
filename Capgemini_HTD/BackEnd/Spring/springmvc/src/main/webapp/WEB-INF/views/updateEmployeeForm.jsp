<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="false" %>

<%String msg = (String) request.getAttribute("msg"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if (msg != null && !msg.isEmpty()) { %>
	<%=msg%>
	<%} %>
	<fieldset>
		<legend>Update Employee</legend>
		<form action="./updateEmployee" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="text" name="empId">
				</tr>
				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="empName">
				</tr>
				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age">
				</tr>
				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary">
				</tr>
				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation">
				</tr>
				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type="text" name="gender">
				</tr>
				<tr>
					<td>Mobile No.</td>
					<td>:</td>
					<td><input type="number" name="mobile">
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="text" name="password">
				</tr>
				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						value="Update Details"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
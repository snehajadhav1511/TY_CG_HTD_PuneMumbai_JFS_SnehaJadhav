<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="false" %>

<%	String msg = (String) request.getAttribute("msg"); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
		<br><br>
		<fieldset>
			<legend style="background: navy; color: white;">Search Employee</legend>
			<form action="./deleteEmployee" method="get">
				<table border="1">
					<tr>
						<td>Enter Employee ID</td>
						<td> : </td>
						<td><input type="text" name="empId" required></td>
					</tr>
					<tr>
						<td colspan="3" align="center"><br>
							<input type="submit" value="Delete">
						</td>
					</tr>
				</table>
			</form>
		</fieldset>
		<br>
		<% if (msg != null && !msg.isEmpty()) { %>
			<h3 style="color: red;"><%=msg%></h3>
		<% } %>
</body>
</html>
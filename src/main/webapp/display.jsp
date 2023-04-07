<%@page import="dto.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
	<tr>
	<th>id</th>
	<th>name</th>
	<th>email</th>
	<th>pwd</th>
	</tr>
	
	<%
	StudentDto data= (StudentDto)request.getAttribute("key");
	%>
	<tr>
			<td><%=data.getId() %></td>
			<td><%=data.getName() %></td>
			<td><%=data.getEmail() %></td>
			<td><%=data.getPwd() %></td>
		</tr>
</table>
</body>
</html>
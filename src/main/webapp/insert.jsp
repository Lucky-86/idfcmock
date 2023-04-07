<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="insert" modelAttribute="stdobject">
	Id:<form:input path="id"/>
	Name:<form:input path="name"/>
	Email:<form:input path="email"/>
	Password:<form:input path="pwd"/>
	<form:button>Submit</form:button>
	</form:form>
</body>
</html>
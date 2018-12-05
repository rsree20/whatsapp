<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login">
		<center>
			<font color="red"><%=request.getAttribute("message")%></font> User
			name = <input type="text" name="email" />mailID</br> 
			Password = <input type="password" name="pwd" /></br>
			<input type="submit" value=login /> <a href = "ForgotPassword.jsp"> click here for Forgot Password </a></center>

</body>
</html>
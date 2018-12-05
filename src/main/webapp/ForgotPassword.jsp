<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center><h1>Security Questions</h1>
<body>
	<form action="ForgotPassword">
	<font color="red"><%=request.getAttribute("message")%></font><br>
		
			Email=<input type="text" name="email" /><br>
			Question1: <select
				name="question1"><br>
				<option value="favourite color">favourite color</option>
				<option value="favoruite person">favoruite person</option>
				<option value="favoruite place">favoruite place</option>
			</select>
			your answer:<input type="text" name="answer1"><br>
			Question2: <select name="question2"><br>
				<option value="favourite sport">favourite sport</option>
				<option value="collage name">collage name</option>
				<option value="best friend">best friend</option>
			</select> your answer:<input type="text" name="answer2"><br>
			<input type="submit" value="check"></center>
	</form>
</body>
</html>
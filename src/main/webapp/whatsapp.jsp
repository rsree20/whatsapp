<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Loginpage">
		<center>UserName :<input type="text" name="email" />@gmail.com <br>
		Password :<input type="password" name="pwd" /> <br>
		Mobile Number :<input type="text" name="mbl" /><br>
		Name :<input type="text" name="name" /><br>
		Salary :<input type="text" name="sal" /> <br>
		Company :<input type="text" name="comp" /> <br>
		Security Questions
		Question1:
		<select name= "question1"><br>
		<option value = "favourite color">favourite color</option>
		<option value = "favoruite person">favoruite person</option>
		<option value = "favoruite place">favoruite place</option>
		</select>
		your answer:<input type ="text" name="answer1"><br>
		Question2:
		<select name= "question2"><br> 
		<option value = "favourite sport">favourite sport</option>
		<option value = "collage name">collage name</option>
		<option value = "best friend">best friend</option>
		</select>
		your answer:<input type ="text" name="answer2"><br>
		<input type="submit" value="click on me" />
		<a href = "WhatsappLogin.jsp"> click here to login </a></center>
	</form>
	
	<<!-- form action="save">
		<center><input type="submit" value="save" /></center>
	</form> -->
</body>
</html> 
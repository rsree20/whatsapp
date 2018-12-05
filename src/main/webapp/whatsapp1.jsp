<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	your are sucessfully Registred<br>
	<font color=red">
	<%-- user name : <%=request.getParameter("uname")%><br>
	password : <%=request.getParameter( "pwd")%><br> --%>
	<%-- User name : <%= request.getParameter("mail")%><br>
	Password : <%= request.getParameter("pwd")%><br> 
	Name : <%= request.getParameter("name")%><br>
	Mobile Number : <%= request.getParameter("mbl")%><br> 
	Salary : <%= request.getParameter("sal")%><br> 
	Company : <%= request.getParameter("comp")%><br> --%>
	
	User name : <%= request.getAttribute("mail")%><br>
	Password : <%= request.getAttribute("pwd")%><br> 
	Name : <%= request.getAttribute("name")%><br>
	Mobile Number : <%= request.getAttribute("mbl")%><br> 
	Salary : <%= request.getAttribute("sal")%><br> 
	Company : <%= request.getAttribute("comp")%><br>
	</font>
	please use these credentials to login!!
</body>
</html>
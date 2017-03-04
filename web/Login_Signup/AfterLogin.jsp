<%-- 
    Document   : AfterLogin
    Created on : Feb 10, 2017, 9:36:25 PM
    Author     : code_eagle
--%>

<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Success Page</title>
</head>
<body>
<%
String userName = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("username")) userName = cookie.getValue();
}
}
if(userName == null) response.sendRedirect("http://localhost:8080/j2ee/Login_Signup/Login.html");
%>
<h3>Hi <%=userName %>, Login successful.</h3>
<br>
<form action="http://localhost:8080/j2ee/Logout" method="post">
<input type="submit" value="Logout" >
</form>
</body>
</html>
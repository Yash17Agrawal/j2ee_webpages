<%-- 
    Document   : Login
    Created on : Mar 4, 2017, 7:40:15 AM
    Author     : code_eagle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
        response.setHeader( "Cache-Control", "private,no-store, no-cache, must-revalidate");  //HTTP 1.1
        response.setHeader("Pragma","no-cache"); //HTTP 1.0
        response.setDateHeader ("Expires", 0);
        String name=(String)session.getAttribute("username");
        if(name != null )
        {
            response.sendRedirect("http://localhost:8080/j2ee/Login_Signup/AfterLogin.jsp");
        }  
       
%>

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body >
        <form action=http://localhost:8080/j2ee/Login  method="GET">
            Username   <input type="text" name="username"><br>
            Password   <input type="text" name="password"><br>
            Login      <input type="submit" name="login"><br>
        </form>
    </body>
</html>

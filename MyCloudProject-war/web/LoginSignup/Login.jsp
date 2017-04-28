<%-- 
    Document   : Login
    Created on : Apr 18, 2017, 7:36:10 PM
    Author     : code_eagle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="http://localhost:24807/MyCloudProject-war/LoginSingupNew"  method="POST">
            UserId   <input type="text" name="userId"><br>
            Password   <input type="password" name="password"><br>
            Login      <input type="submit" name="login"><br>
        </form>
    </body>
</html>

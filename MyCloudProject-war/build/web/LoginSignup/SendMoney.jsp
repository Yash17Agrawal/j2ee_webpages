<%-- 
    Document   : SendMoney
    Created on : Apr 18, 2017, 8:32:30 PM
    Author     : code_eagle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send mOney</title>
    </head>
    <body>
        <form action="http://localhost:24807/MyCloudProject-war/Transaction"  method="POST">
            To UserId   <input type="number" name="userId"><br>
            Amount   <input type="number" name="amount"><br>
            Ok      <input type="submit" name="login"><br>
        </form>
    </body>
</html>

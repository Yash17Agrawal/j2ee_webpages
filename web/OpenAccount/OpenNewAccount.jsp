<%-- 
    Document   : OpenNewAccount
    Created on : Mar 18, 2017, 12:17:17 PM
    Author     : code_eagle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Open New Account</title>
    </head>
    <body>
        <h1>Hello </h1>
        <form action=http://localhost:8080/j2ee/CreateAccount  method="GET">

            Account Type 
            <select>
              <option value="savings">Savings</option>
              <option value="current">Current</option>
              
            </select><br>
           <!-- Account Type <input list="accounts" name="accounts">
            <datalist id="accounts">
              <option value="Savings">
              <option value="Current">
              
            </datalist>
            <br>-->
            Pin   <input type="text" name="pin"><br>
            Create Account      <input type="submit"><br>
        </form>
    </body>
</html>

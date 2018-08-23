<%-- 
    Document   : index
    Created on : Aug 20, 2018, 1:23:47 PM
    Author     : THHN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login form</title>
    </head>
    <body>
        <h1>Login authentication</h1>
        <form action="LoginServlet" method="POST">
            Username: <input type="text" name="username"></input>
            Password: <input type="password" name="password"></input>
            <input type="submit" value="Login">
            <input type="reset" value="Reset"> 
        </form>
    </body>
</html>

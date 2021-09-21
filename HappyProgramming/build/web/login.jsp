<%-- 
    Document   : loginJsp
    Created on : Sep 21, 2021, 8:27:13 PM
    Author     : QMC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            Object mess = request.getAttribute("mess");
            if (mess == null) {
                mess = "";
            }
        %>
        <div>
            <form action="UserControllerMap" method="POST">
                <input type="hidden" name ="service" value="login">
                <input type="text" name="username" placeholder="username">
                <input type="password" name="password" placeholder="pass">
                        <button type="submit">SIGN IN</button>
            </form>
            <%= mess.toString()%>
        </div>
    </body>
</html>


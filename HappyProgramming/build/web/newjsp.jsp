<%-- 
    Document   : newjsp
    Created on : Sep 19, 2021, 10:10:07 PM
    Author     : Duong
--%>

<%@page import="entity.User"%>
<%@page import="model.impl.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<!DOCTYPE html>
<html>
    <%
        ArrayList<User> list = (ArrayList<User>) request.getAttribute("userlist");
        %> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= list.size()%> 
        
        <% 
            for (User u: list){%>
                <%=u.getUsername()%> <%=u.getPassword() %>
            <%}        
        %>
    </body>
</html>

<%-- 
    Document   : rating
    Created on : Sep 23, 2021, 8:11:47 PM
    Author     : Duong
--%>

<%@page import="dao.iplm.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Mentor: ${mentor.fullname}
        <c:forEach var="x" items="${rList}">
            <p>From <a href="${"UserControllerMap?service=info&uId="}${x.fromId}">${x.fromName}</a>
            <p>Comment:  ${x.comment}
            <p>Rate:     ${x.rating}
            <p>Day rate: ${x.date}
            </c:forEach> 
    </body>
</html>

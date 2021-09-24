<%-- 
    Document   : createSkill
    Created on : Sep 23, 2021, 7:51:55 PM
    Author     : Duong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SkillControllerMap" method="POST">
            <input type="hidden" name ="service" value="createSkill">
            <p><input type="text" name="sName" placeholder="Skill Name" required/> 
            <p><input type="text" name="sDetail" placeholder="Details" required/> 
            <button type="submit">Create</button>
            <button type="reset">Reset</button>
        </form> 
        ${mess}
    </body>
</html>

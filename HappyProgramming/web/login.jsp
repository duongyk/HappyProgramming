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
        <div>
            <form action="UserControllerMap" method="post">
                <input type="hidden" name ="service" value="get">
                <table>
                    <tr>
                        <th colspan="2">
                            Login Form
                        </th>
                    </tr>
                    <tr>
                        <td>
                            User:
                        </td> 
                        <td>
                            <input type="text" name ="username">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Password:
                        </td> 
                        <td>
                            <input type="password" name ="password">
                        </td>
                    </tr>

                    <tr>
                        <td>
                             <input type="submit" value ="Login">
                        </td> 
                    </tr>          
                </table>
            </form>
        </div>
    </body>
</html>


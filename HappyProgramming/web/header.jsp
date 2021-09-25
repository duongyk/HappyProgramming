<%-- 
    Document   : header
    Created on : Sep 21, 2021, 10:56:19 PM
    Author     : solov
--%>

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="vi">

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>Home</title>
        <link rel="stylesheet" href="css/nicepage.css" media="screen">
        <link rel="stylesheet" href="css/Home.css" media="screen">
        <script class="u-script" type="text/javascript" src="js/jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
        <link id="u-theme-google-font" rel="stylesheet"
              href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    </head>
    <%
        User x = (User) request.getSession().getAttribute("currUser");
    %>
    <body class="u-body">
        <header class="u-clearfix u-custom-color-1 u-header ">
            <a href="" class="u-image u-logo u-image-1" data-image-width="313" data-image-height="95" t>
                <img src="images/Logo.png" class="u-logo-image u-logo-image-1">
            </a>
            <nav class="u-align-right u-menu x u-offcanvas u-menu-1" data-position="" data-responsive-from="MD">

                <div class="u-nav-container">
                    <ul class="u-custom-font u-nav u-spacing-30 u-text-font u-unstyled u-nav-1">
                        <li class="u-nav-item"><a
                                class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"
                                href="" style="padding: 10px 36px;">All mentors</a>
                        </li>
                        <li class="u-nav-item"><a
                                class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"
                                href="SkillControllerMap?service=allSkill" style="padding: 10px 36px;">All skills</a>
                        </li>
                        <%if (x != null){%>
                            <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"
                            href="UserControllerMap?service=listRequest" style="padding: 10px 36px;">Request</a>
                        </li> 
                        <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"
                            href="UserControllerMap?service=profile" style="padding: 10px 36px;">Profile</a>
                        </li> 
                        <%} else {%>
                        <li class="u-nav-item"><a
                                class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"  
                                href="Sign-in.jsp"style="padding: 10px 36px;">Login</a>
                        </li>
                        <%}%>
                    </ul>
                </div>

            </nav>
        </header>

    </body>
</html>

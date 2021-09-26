<%-- 
    Document   : Update-CV
    Created on : Sep 24, 2021, 8:04:14 AM
    Author     : PC
--%>

<%@page import="entity.CV"%>
<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="vi">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>Update CV</title>
        <link rel="stylesheet" href="css/nicepage.css" media="screen">
        <link rel="stylesheet" href="css/Update-CV.css" media="screen">
        <script class="u-script" type="text/javascript" src="js/jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 3.25.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">


        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="Update CV">
        <meta property="og:description" content="">
        <meta property="og:type" content="website">
    </head>
    <%
        String title = request.getAttribute("title").toString();
        
        User mentorProfile = (User)request.getAttribute("mentorprofile");
        CV mentorCV = (CV) request.getAttribute("mentorcv");
    %>    
    <body class="u-body"><header class="u-clearfix u-custom-color-1 u-header u-header" id="sec-6b6d"><a href="Home.html" data-page-id="745383" class="u-image u-logo u-image-1" data-image-width="313" data-image-height="95" title="D">
                <img src="images/Logo.png" class="u-logo-image u-logo-image-1">
            </a><nav class="u-align-right u-menu u-menu-dropdown u-offcanvas u-menu-1" data-position="" data-responsive-from="MD">
                <div class="menu-collapse" style="font-size: 0.875rem; letter-spacing: 0px; font-weight: 700; text-transform: uppercase;">
                    <a class="u-button-style u-custom-active-border-color u-custom-active-color u-custom-border u-custom-border-color u-custom-border-radius u-custom-borders u-custom-color u-custom-hover-border-color u-custom-hover-color u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-hover-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#" style="">
                        <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
                        <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                        </symbol>
                        </defs></svg>
                    </a>
                </div>
                <div class="u-custom-menu u-nav-container">
                    <ul class="u-custom-font u-nav u-spacing-30 u-text-font u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90" href="All-mentors.html" style="padding: 10px 36px;">All mentors</a>
                        </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90" href="All-skills.html" style="padding: 10px 36px;">All skills</a>
                        </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90" href="Sign-in.html" style="padding: 10px 36px;">Sign in</a>
                        </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90" href="Sign-up.html" style="padding: 10px 36px;">Sign up</a>
                        </li></ul>
                </div>
                <div class="u-custom-menu u-nav-container-collapse">
                    <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                        <div class="u-inner-container-layout u-sidenav-overflow">
                            <div class="u-menu-close"></div>
                            <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="All-mentors.html" style="padding: 10px 36px;">All mentors</a>
                                </li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="All-skills.html" style="padding: 10px 36px;">All skills</a>
                                </li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Sign-in.html" style="padding: 10px 36px;">Sign in</a>
                                </li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Sign-up.html" style="padding: 10px 36px;">Sign up</a>
                                </li></ul>
                        </div>
                    </div>
                    <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                </div>
            </nav></header>
        <section class="u-clearfix u-custom-color-2 u-section-1" id="sec-ebef">
            <div class="u-clearfix u-sheet u-sheet-1">
                <h4 class="u-text u-text-default u-text-1"><%=title %></h4>
                <div class="u-form u-form-1">
                    <form id="my_form"  action="CVController?service=submitFormUpdate" method="POST" class="u-clearfix u-form-spacing-9 u-form-vertical u-inner-form" source="custom" name="form" style="padding: 0px;">
                        <input type="hidden" name="uid" value="<%= mentorProfile.getuId() %>" readonly="readonly" value="<%= mentorProfile.getuId() %>"/>
                        <div class="u-form-group u-form-group-1">
                            <label for="text-891d" class="u-form-control-hidden u-label"></label>
                            <input type="text" placeholder="User name" id="text-891d" name="username" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required" value="<%= mentorProfile.getUsername() %>">
                        </div>
                        <div class="u-form-group u-form-group-2">
                            <label for="text-3911" class="u-form-control-hidden u-label"></label>
                            <input type="text" placeholder="Fullname" id="text-3911" name="fullname" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required" value="<%= mentorProfile.getFullname() %>">
                        </div>
                        <div class="u-form-date u-form-group u-form-partition-factor-2 u-form-group-3">
                            <label for="text-13e0" class="u-label">Date of birth</label>
                            <input type="date" id="text-13e0" name="dob" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" value="<%= mentorProfile.getDob() %>">
                        </div>
                        <div class="u-form-group u-form-partition-factor-2 u-form-select u-form-group-4">
                            <label for="select-6004" class="u-label">Sex</label>
                            <div class="u-form-select-wrapper">
                                <select id="select-6004" name="sex" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                </select>
                                <svg xmlns="http://www.w3.org/2000/svg" width="14" height="12" version="1" class="u-caret"><path fill="currentColor" d="M4 8L0 4h8z"></path></svg>
                            </div>
                        </div>
                        <div class="u-form-group u-form-group-5">
                            <label for="text-b9a0" class="u-form-control-hidden u-label"></label>
                            <input type="text" placeholder="Mail" id="text-b9a0" name="mail" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required" value="<%= mentorProfile.getuMail() %>">
                        </div>
                        <div class="u-form-group u-form-group-6">
                            <label for="text-0855" class="u-form-control-hidden u-label"></label>
                            <input type="text" placeholder="Phone" id="text-0855" name="phone" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required" value="<%= mentorProfile.getuPhone() %>">
                        </div>
                        <div class="u-form-group u-form-group-7">
                            <label for="text-1c7c" class="u-form-control-hidden u-label"></label>
                            <input type="text" placeholder="Profession" id="text-1c7c" name="profession" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required" value="<%= mentorCV.getProfession() %>">
                        </div>
                        <div class="u-form-group u-form-message u-form-group-8">
                            <label for="text-b048" class="u-form-control-hidden u-label"></label>
                            <textarea placeholder="Profession introduction" id="text-b048" name="professionIntro" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required" ><%= mentorCV.getProfessionIntro()%></textarea>
                        </div>
                        <div class="u-form-group u-form-message u-form-group-9">
                            <label for="text-47b9" class="u-form-control-hidden u-label"></label>
                            <textarea placeholder="Service description" id="text-47b9" name="serviceDescription" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" pattern="\+?\d{0,2}[\s\(\-]?([0-9]{3})[\s\)\-]?([\s\-]?)([0-9]{3})[\s\-]?([0-9]{2})[\s\-]?([0-9]{2})" required="required"><%= mentorCV.getServiceDescript() %></textarea>
                        </div>
                        <div class="u-form-group u-form-textarea u-form-group-10">
                            <label for="textarea-3873" class="u-form-control-hidden u-label"></label>
                            <textarea rows="4" cols="50" id="textarea-3873" name="achievement" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="" placeholder="Achievement"><%= mentorCV.getAchivement()%></textarea>
                        </div>
                        <div class="u-form-checkbox u-form-group u-form-partition-factor-2 u-form-group-11">
                            <input type="checkbox" id="checkbox-2a81" name="checkbox-1" value="On">
                            <label for="checkbox-2a81" class="u-label">Java</label>
                        </div>
                        <div class="u-form-checkbox u-form-group u-form-partition-factor-2 u-form-group-12">
                            <input type="checkbox" id="checkbox-d2f0" name="checkbox" value="On">
                            <label for="checkbox-d2f0" class="u-label">C++</label>
                        </div>
                        <div class="u-align-center u-form-group u-form-submit">
                            <a href="javascript:{}" onclick="document.getElementById('my_form').submit();" class="u-border-none u-btn u-btn-submit u-button-style u-custom-color-3 u-text-body-alt-color u-btn-1">Update CV</a>
                        </div>
                        
                    </form>
                </div>
                <img class="u-image u-image-default u-preserve-proportions u-image-1" src="images/79506d11e688f731ccd8668ea9a270a8f1c3bbe48deaaa39778eb19163c1b45a18be6e4c3e8f265299f9a3284a2e8cc04605fdfc7290b9d7c20251_1280.png" alt="" data-image-width="1280" data-image-height="1280">
                <a href="https://nicepage.com/joomla-templates" class="u-border-2 u-border-black u-btn u-button-style u-hover-custom-color-3 u-none u-text-black u-text-hover-white u-btn-2">Change avatar</a>
                <p class="u-text u-text-default u-text-2">Skills:&nbsp;</p>
            </div>
        </section>


        <footer class="u-align-center u-clearfix u-footer u-white u-footer" id="sec-b0a2"><img class="u-image u-image-1" src="images/logowhite.png" data-image-width="571" data-image-height="388"><a href="https://nicepage.com/wordpress-themes" class="u-active-none u-btn u-btn-rectangle u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-btn-1">0123456789</a><p class="u-text u-text-default u-text-1"> San Jose,Silicon Valley, California</p><p class="u-text u-text-2"> HappyProgramming@gmail.com</p><div class="u-grey-light-2 u-map u-map-1">
                <div class="embed-responsive">
                    <iframe class="embed-responsive-item" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d287205.9795192053!2d-121.9745609966744!3d37.31390644748984!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fcae48af93ff5%3A0xb99d8c0aca9f717b!2sSan%20Jose%2C%20California%2C%20Hoa%20K%E1%BB%B3!5e0!3m2!1svi!2s!4v1632219783213!5m2!1svi!2s" data-map="JTdCJTIycG9zaXRpb25UeXBlJTIyJTNBJTIybWFwLWVtYmVkJTIyJTJDJTIyYWRkcmVzcyUyMiUzQSUyMk1hbmhhdHRhbiUyQyUyME5ldyUyMFlvcmslMjIlMkMlMjJ6b29tJTIyJTNBMTAlMkMlMjJ0eXBlSWQlMjIlM0ElMjJyb2FkJTIyJTJDJTIybGFuZyUyMiUzQW51bGwlMkMlMjJhcGlLZXklMjIlM0ElMjJkJTIyJTJDJTIybWFya2VycyUyMiUzQSU1QiU1RCUyQyUyMmVtYmVkJTIyJTNBJTIyaHR0cHMlM0ElMkYlMkZ3d3cuZ29vZ2xlLmNvbSUyRm1hcHMlMkZlbWJlZCUzRnBiJTNEITFtMTghMW0xMiExbTMhMWQyODcyMDUuOTc5NTE5MjA1MyEyZC0xMjEuOTc0NTYwOTk2Njc0NCEzZDM3LjMxMzkwNjQ0NzQ4OTg0ITJtMyExZjAhMmYwITNmMCEzbTIhMWkxMDI0ITJpNzY4ITRmMTMuMSEzbTMhMW0yITFzMHg4MDhmY2FlNDhhZjkzZmY1JTI1M0EweGI5OWQ4YzBhY2E5ZjcxN2IhMnNTYW4lMjUyMEpvc2UlMjUyQyUyNTIwQ2FsaWZvcm5pYSUyNTJDJTI1MjBIb2ElMjUyMEslMjVFMSUyNUJCJTI1QjMhNWUwITNtMiExc3ZpITJzITR2MTYzMjIxOTc4MzIxMyE1bTIhMXN2aSEycyUyMiU3RA=="></iframe>
                </div>
            </div><img class="u-image u-image-default u-image-2" src="images/contact.png" alt="" data-image-width="177" data-image-height="361"></footer>
        <section class="u-backlink u-clearfix u-grey-80">

            <p class="u-text">
                <span>Copyright © 2021 Happy Programming. All rights reserved.</span>
            </p>

        </section>
    </body>
</html>
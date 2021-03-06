

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="vi">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>Rating</title>
        <link rel="stylesheet" href="css/nicepage.css" media="screen">
        <link rel="stylesheet" href="css/Rating.css" media="screen">
        <script class="u-script" type="text/javascript" src="js/jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 3.25.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">



        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "Happyprogramming",
            "logo": "images/Logo.png"
            }</script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="Rating">
        <meta property="og:description" content="">
        <meta property="og:type" content="website">
    </head>
    <%
        User x = (User) request.getSession().getAttribute("currUser");
    %>
    <header class="u-clearfix u-custom-color-1 u-header ">
            <a href="index.jsp" class="u-image u-logo u-image-1" data-image-width="313" data-image-height="95" t>
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
                        <%if (x != null) {%>
                        <li class="u-nav-item"><a
                                class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"
                                href="RequestControllerMap?service=listRequestByMe" style="padding: 10px 36px;">Request</a>
                        </li> 
                        <li class="u-nav-item"><a
                                class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"
                                href="UserControllerMap?service=profile" style="padding: 10px 36px;">Profile</a>
                        </li> 
                        <%} else {%>
                        <li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90" href="Sign-up.jsp" style="padding: 10px 16px;">Sign up</a> </li> 
                        <li class="u-nav-item"><a
                                class="u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90"  
                                href="Sign-in.jsp"style="padding: 10px 36px;">Sign-in</a>
                        </li>
                        <%}%>
                    </ul>
                </div>

            </nav>
        </header>
        <section class="u-clearfix u-custom-color-2 u-section-1" id="sec-e496">
            <h5 class="u-text u-text-default u-text-font u-text-1">Mentor: ${mentor.fullname}</h5>
            <div class="u-container-style u-group u-shape-rectangle u-white u-group-1">
                <div class="u-container-layout u-container-layout-1">
                    <ol class="u-text u-text-2">
                        <c:forEach items="${listRating}" var="rating">
                        <li>
                            <span class="mentee-name">${rating.fromName}:  
                                <span class="mentee-cmt">${rating.comment}      
                                </span>
                            </span>
                            <span class="time-cmt">${rating.date}       </span>
                            <span class="mentee-name">| ${rating.rating}/10  
                        </li>
                        </c:forEach>
                    </ol>
                    <div class="u-expanded-width u-palette-5-base u-shape u-shape-rectangle u-shape-1"></div>
                    <div class="u-form u-form-1">
                        <form action="RatingControllerMap" method="POST" class="u-clearfix u-form-custom-backend u-form-spacing-5 u-form-vertical u-inner-form" source="custom" name="form" style="padding: 0px;" redirect="true">
                            <div class="u-form-group u-form-name">
                                <label for="name-dc8a" class="u-form-control-hidden u-label"></label>
                                <input type="text" placeholder="Enter your comment" id="name-dc8a" name="comment" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                            </div>
                            <div class="u-form-group u-form-select u-form-group-2">
                                <label for="select-d713" class="u-label">Rating for mentor (1-5)</label>
                                <div class="u-form-select-wrapper">
                                    <select id="select-d713" name="rate" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>

                                    </select>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="14" height="12" version="1" class="u-caret"><path fill="currentColor" d="M4 8L0 4h8z"></path></svg>
                                </div>
                            </div>
                            <div class="u-align-center u-form-group u-form-submit">
                                <a href="#" class="u-border-none u-btn u-btn-submit u-button-style u-palette-5-dark-1 u-btn-1">Submit</a>
                                <input type="submit" value="submit" class="u-form-control-hidden">
                                <input type="hidden" name="service" value="rateMentor">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <img class="u-image u-image-default u-preserve-proportions u-image-1" src="images/79506d11e688f731ccd8668ea9a270a8f1c3bbe48deaaa39778eb19163c1b45a18be6e4c3e8f265299f9a3284a2e8cc04605fdfc7290b9d7c20251_1280.png" alt="" data-image-width="1280" data-image-height="1280">
            <h6 class="u-text u-text-font u-text-3">Rating: ${avg}/10</h6>
        </section>



        <footer class="u-align-center u-clearfix u-footer u-white u-footer" id="sec-b0a2"><img class="u-image u-image-1" src="images/logowhite.png" data-image-width="571" data-image-height="388"><a href="https://nicepage.com/wordpress-themes" class="u-active-none u-btn u-btn-rectangle u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-btn-1">0123456789</a><p class="u-text u-text-default u-text-1"> San Jose,Silicon Valley, California</p><p class="u-text u-text-2"> HappyProgramming@gmail.com</p><div class="u-grey-light-2 u-map u-map-1">
                <div class="embed-responsive">
                    <iframe class="embed-responsive-item" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d287205.9795192053!2d-121.9745609966744!3d37.31390644748984!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fcae48af93ff5%3A0xb99d8c0aca9f717b!2sSan%20Jose%2C%20California%2C%20Hoa%20K%E1%BB%B3!5e0!3m2!1svi!2s!4v1632219783213!5m2!1svi!2s" data-map="JTdCJTIycG9zaXRpb25UeXBlJTIyJTNBJTIybWFwLWVtYmVkJTIyJTJDJTIyYWRkcmVzcyUyMiUzQSUyMk1hbmhhdHRhbiUyQyUyME5ldyUyMFlvcmslMjIlMkMlMjJ6b29tJTIyJTNBMTAlMkMlMjJ0eXBlSWQlMjIlM0ElMjJyb2FkJTIyJTJDJTIybGFuZyUyMiUzQW51bGwlMkMlMjJhcGlLZXklMjIlM0ElMjJkJTIyJTJDJTIybWFya2VycyUyMiUzQSU1QiU1RCUyQyUyMmVtYmVkJTIyJTNBJTIyaHR0cHMlM0ElMkYlMkZ3d3cuZ29vZ2xlLmNvbSUyRm1hcHMlMkZlbWJlZCUzRnBiJTNEITFtMTghMW0xMiExbTMhMWQyODcyMDUuOTc5NTE5MjA1MyEyZC0xMjEuOTc0NTYwOTk2Njc0NCEzZDM3LjMxMzkwNjQ0NzQ4OTg0ITJtMyExZjAhMmYwITNmMCEzbTIhMWkxMDI0ITJpNzY4ITRmMTMuMSEzbTMhMW0yITFzMHg4MDhmY2FlNDhhZjkzZmY1JTI1M0EweGI5OWQ4YzBhY2E5ZjcxN2IhMnNTYW4lMjUyMEpvc2UlMjUyQyUyNTIwQ2FsaWZvcm5pYSUyNTJDJTI1MjBIb2ElMjUyMEslMjVFMSUyNUJCJTI1QjMhNWUwITNtMiExc3ZpITJzITR2MTYzMjIxOTc4MzIxMyE1bTIhMXN2aSEycyUyMiU3RA=="></iframe>
                </div>
            </div><img class="u-image u-image-default u-image-2" src="images/contact.png" alt="" data-image-width="177" data-image-height="361"></footer>
        <section class="u-backlink u-clearfix u-grey-80">
            <a class="u-link" href="https://nicepage.com/html-templates" target="_blank">
                <span>Free HTML Templates</span>
            </a>
            <p class="u-text">
                <span>created with</span>
            </p>
            <a class="u-link" href="https://nicepage.com/" target="_blank">
                <span>WYSIWYG Web Builder</span>
            </a>. 
        </section>
    </body>
</html>

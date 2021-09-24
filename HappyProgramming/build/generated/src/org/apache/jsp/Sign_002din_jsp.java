package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sign_002din_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html style=\"font-size: 16px;\" lang=\"vi\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\r\n");
      out.write("        <title>Sign in</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nicepage.css\" media=\"screen\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Sign-in.css\" media=\"screen\">\r\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/jquery.js\" defer=\"\"></script>\r\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/nicepage.js\" defer=\"\"></script>\r\n");
      out.write("        <meta name=\"generator\" content=\"Nicepage 3.25.0, nicepage.com\">\r\n");
      out.write("        <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"theme-color\" content=\"#478ac9\">\r\n");
      out.write("        <meta property=\"og:title\" content=\"Sign in\">\r\n");
      out.write("        <meta property=\"og:description\" content=\"\">\r\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"u-body\"><header class=\"u-clearfix u-custom-color-1 u-header u-header\" id=\"sec-6b6d\"><a href=\"Home.html\" data-page-id=\"745383\" class=\"u-image u-logo u-image-1\" data-image-width=\"313\" data-image-height=\"95\" title=\"D\">\r\n");
      out.write("                <img src=\"images/Logo.png\" class=\"u-logo-image u-logo-image-1\">\r\n");
      out.write("            </a><nav class=\"u-align-right u-menu u-menu-dropdown u-offcanvas u-menu-1\" data-position=\"\" data-responsive-from=\"MD\">\r\n");
      out.write("                <div class=\"menu-collapse\" style=\"font-size: 0.875rem; letter-spacing: 0px; font-weight: 700; text-transform: uppercase;\">\r\n");
      out.write("                    <a class=\"u-button-style u-custom-active-border-color u-custom-active-color u-custom-border u-custom-border-color u-custom-border-radius u-custom-borders u-custom-color u-custom-hover-border-color u-custom-hover-color u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-hover-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base\" href=\"#\" style=\"\">\r\n");
      out.write("                        <svg><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#menu-hamburger\"></use></svg>\r\n");
      out.write("                        <svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><defs><symbol id=\"menu-hamburger\" viewBox=\"0 0 16 16\" style=\"width: 16px; height: 16px;\"><rect y=\"1\" width=\"16\" height=\"2\"></rect><rect y=\"7\" width=\"16\" height=\"2\"></rect><rect y=\"13\" width=\"16\" height=\"2\"></rect>\r\n");
      out.write("                        </symbol>\r\n");
      out.write("                        </defs></svg>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"u-custom-menu u-nav-container\">\r\n");
      out.write("                    <ul class=\"u-custom-font u-nav u-spacing-30 u-text-font u-unstyled u-nav-1\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\" href=\"All-mentors.html\" style=\"padding: 10px 36px;\">All mentors</a>\r\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\" href=\"All-skills.html\" style=\"padding: 10px 36px;\">All skills</a>\r\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\" href=\"Sign-in.html\" style=\"padding: 10px 36px;\">Sign in</a>\r\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\" href=\"Sign-up.html\" style=\"padding: 10px 36px;\">Sign up</a>\r\n");
      out.write("                        </li></ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"u-custom-menu u-nav-container-collapse\">\r\n");
      out.write("                    <div class=\"u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav\">\r\n");
      out.write("                        <div class=\"u-inner-container-layout u-sidenav-overflow\">\r\n");
      out.write("                            <div class=\"u-menu-close\"></div> <form action=\"UserControllerMap\" method=\"POST\">\r\n");
      out.write("                            <ul class=\"u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"All-mentors.html\" style=\"padding: 10px 36px;\">All mentors</a>\r\n");
      out.write("                                </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"All-skills.html\" style=\"padding: 10px 36px;\">All skills</a>\r\n");
      out.write("                                </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Sign-in.html\" style=\"padding: 10px 36px;\">Sign in</a> \r\n");
      out.write("                                </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Sign-up.html\" style=\"padding: 10px 36px;\">Sign up</a>\r\n");
      out.write("                                </li></ul> </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"u-black u-menu-overlay u-opacity u-opacity-70\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav></header>\r\n");
      out.write("        <section class=\"u-align-center u-clearfix u-custom-color-2 u-section-1\" id=\"sec-eec3\">\r\n");
      out.write("            <div class=\"u-clearfix u-sheet u-sheet-1\">\r\n");
      out.write("                <div class=\"u-align-center u-container-style u-group u-radius-50 u-shape-round u-white u-group-1\">\r\n");
      out.write("                    <div class=\"u-container-layout u-container-layout-1\">\r\n");
      out.write("                        <h3 class=\"u-text u-text-1\">Sign In</h3>\r\n");
      out.write("                        <div class=\"u-form u-login-control u-form-1\">\r\n");
      out.write("                            <form action=\"#\" method=\"POST\" class=\"u-clearfix u-form-custom-backend u-form-spacing-35 u-form-vertical u-inner-form\" source=\"custom\" name=\"form-2\" style=\"padding: 10px;\">\r\n");
      out.write("                                <div class=\"u-form-group u-form-name\">\r\n");
      out.write("                                    <label for=\"username-708d\" class=\"u-form-control-hidden u-label\"></label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Enter your Username\" id=\"username-708d\" name=\"username\" class=\"u-grey-5 u-input u-input-rectangle\" required=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"u-form-group u-form-password\">\r\n");
      out.write("                                    <label for=\"password-708d\" class=\"u-form-control-hidden u-label\"></label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Enter your Password\" id=\"password-708d\" name=\"password\" class=\"u-grey-5 u-input u-input-rectangle\" required=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"u-form-checkbox u-form-group\">\r\n");
      out.write("                                    <input type=\"checkbox\" id=\"checkbox-708d\" name=\"remember\" value=\"On\">\r\n");
      out.write("                                    <label for=\"checkbox-708d\" class=\"u-label\">Remember me</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"u-align-center u-form-group u-form-submit\">\r\n");
      out.write("                                    <a href=\"#\" class=\"u-btn u-btn-round u-btn-submit u-button-style u-radius-17 u-text-body-alt-color u-btn-1\">Login</a>\r\n");
      out.write("                                    <input type=\"submit\" value=\"submit\" class=\"u-form-control-hidden\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"hidden\" value=\"\" name=\"recaptchaResponse\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"\" class=\"u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-login-control u-login-forgot-password u-none u-text-palette-1-base u-btn-2\">Forgot password?</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <img class=\"u-image u-image-default u-image-1\" src=\"images/login.png\" alt=\"\" data-image-width=\"764\" data-image-height=\"805\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"u-align-center u-clearfix u-footer u-white u-footer\" id=\"sec-b0a2\"><img class=\"u-image u-image-1\" src=\"images/logowhite.png\" data-image-width=\"571\" data-image-height=\"388\"><a href=\"https://nicepage.com/wordpress-themes\" class=\"u-active-none u-btn u-btn-rectangle u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-btn-1\">0123456789</a><p class=\"u-text u-text-default u-text-1\"> San Jose,Silicon Valley, California</p><p class=\"u-text u-text-2\"> HappyProgramming@gmail.com</p><div class=\"u-grey-light-2 u-map u-map-1\">\r\n");
      out.write("                <div class=\"embed-responsive\">\r\n");
      out.write("                    <iframe class=\"embed-responsive-item\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d287205.9795192053!2d-121.9745609966744!3d37.31390644748984!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fcae48af93ff5%3A0xb99d8c0aca9f717b!2sSan%20Jose%2C%20California%2C%20Hoa%20K%E1%BB%B3!5e0!3m2!1svi!2s!4v1632219783213!5m2!1svi!2s\" data-map=\"JTdCJTIycG9zaXRpb25UeXBlJTIyJTNBJTIybWFwLWVtYmVkJTIyJTJDJTIyYWRkcmVzcyUyMiUzQSUyMk1hbmhhdHRhbiUyQyUyME5ldyUyMFlvcmslMjIlMkMlMjJ6b29tJTIyJTNBMTAlMkMlMjJ0eXBlSWQlMjIlM0ElMjJyb2FkJTIyJTJDJTIybGFuZyUyMiUzQW51bGwlMkMlMjJhcGlLZXklMjIlM0ElMjJkJTIyJTJDJTIybWFya2VycyUyMiUzQSU1QiU1RCUyQyUyMmVtYmVkJTIyJTNBJTIyaHR0cHMlM0ElMkYlMkZ3d3cuZ29vZ2xlLmNvbSUyRm1hcHMlMkZlbWJlZCUzRnBiJTNEITFtMTghMW0xMiExbTMhMWQyODcyMDUuOTc5NTE5MjA1MyEyZC0xMjEuOTc0NTYwOTk2Njc0NCEzZDM3LjMxMzkwNjQ0NzQ4OTg0ITJtMyExZjAhMmYwITNmMCEzbTIhMWkxMDI0ITJpNzY4ITRmMTMuMSEzbTMhMW0yITFzMHg4MDhmY2FlNDhhZjkzZmY1JTI1M0EweGI5OWQ4YzBhY2E5ZjcxN2IhMnNTYW4lMjUyMEpvc2UlMjUyQyUyNTIwQ2FsaWZvcm5pYSUyNTJDJTI1MjBIb2ElMjUyMEslMjVFMSUyNUJCJTI1QjMhNWUwITNtMiExc3ZpITJzITR2MTYzMjIxOTc4MzIxMyE1bTIhMXN2aSEycyUyMiU3RA==\"></iframe>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><img class=\"u-image u-image-default u-image-2\" src=\"images/contact.png\" alt=\"\" data-image-width=\"177\" data-image-height=\"361\"></footer>\r\n");
      out.write("        <section class=\"u-backlink u-clearfix u-grey-80\">\r\n");
      out.write("\r\n");
      out.write("            <p class=\"u-text\">\r\n");
      out.write("                <span>Copyright © 2021 Happy Programming. All rights reserved.</span>\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

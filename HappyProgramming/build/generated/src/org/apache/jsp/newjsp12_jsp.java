package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp12_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html style=\"font-size: 16px;\" lang=\"vi\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\r\n");
      out.write("  <title>Home</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"nicepage.css\" media=\"screen\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"Home.css\" media=\"screen\">\r\n");
      out.write("  <script class=\"u-script\" type=\"text/javascript\" src=\"jquery.js\" defer=\"\"></script>\r\n");
      out.write("  <script class=\"u-script\" type=\"text/javascript\" src=\"nicepage.js\" defer=\"\"></script>\r\n");
      out.write("  <link id=\"u-theme-google-font\" rel=\"stylesheet\"\r\n");
      out.write("    href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"u-body\">\r\n");
      out.write("  <header class=\"u-clearfix u-custom-color-1 u-header \" ><a href=\"\" \r\n");
      out.write("      class=\"u-image u-logo u-image-1\" data-image-width=\"313\" data-image-height=\"95\" t>\r\n");
      out.write("      <img src=\"images/Logo.png\" class=\"u-logo-image u-logo-image-1\">\r\n");
      out.write("    </a>\r\n");
      out.write("    <nav class=\"u-align-right u-menu x u-offcanvas u-menu-1\" data-position=\"\" data-responsive-from=\"MD\">\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"u-nav-container\">\r\n");
      out.write("        <ul class=\"u-custom-font u-nav u-spacing-30 u-text-font u-unstyled u-nav-1\">\r\n");
      out.write("          <li class=\"u-nav-item\"><a\r\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\r\n");
      out.write("              href=\"All-mentors.html\" style=\"padding: 10px 36px;\">All mentors</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"u-nav-item\"><a\r\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\r\n");
      out.write("              href=\"Request.html\" style=\"padding: 10px 36px;\">Request</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"u-nav-item\"><a\r\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\r\n");
      out.write("              href=\"All-skills.html\" style=\"padding: 10px 36px;\">All skills</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"u-nav-item\"><a\r\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\r\n");
      out.write("              style=\"padding: 10px 36px;\">User Profile</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"u-custom-menu u-nav-container-collapse\">\r\n");
      out.write("        <div class=\"u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav\">\r\n");
      out.write("          <div class=\"u-sidenav-overflow\">\r\n");
      out.write("            <div class=\"u-menu-close\"></div>\r\n");
      out.write("            <ul class=\"u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2\">\r\n");
      out.write("              <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"\"\r\n");
      out.write("                  style=\"padding: 10px 36px;\">All mentors</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"\"\r\n");
      out.write("                  style=\"padding: 10px 36px;\">Request</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"\"\r\n");
      out.write("                  style=\"padding: 10px 36px;\">All skills</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" style=\"padding: 10px 36px;\">User Profile</a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"u-black u-menu-overlay u-opacity u-opacity-70\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <section class=\"u-clearfix u-custom-color-1 u-section-1\" id=\"sec-cd32\">\r\n");
      out.write("    <div class=\"u-clearfix u-sheet u-valign-middle u-sheet-1\">\r\n");
      out.write("      <img class=\"u-image u-image-1\" src=\"images/Homepagechalogin.png\" data-image-width=\"1812\" data-image-height=\"917\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"u-align-center u-clearfix u-footer \"><img class=\"u-image u-image-1\"\r\n");
      out.write("      src=\"images/logowhite.png\" data-image-width=\"571\" data-image-height=\"388\"><a\r\n");
      out.write("      class=\"u-active-none u-btn u-btn-rectangle u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-btn-1\">0123456789</a>\r\n");
      out.write("    <p class=\"u-text u-text-default u-text-1\"> San Jose,Silicon Valley, California</p>\r\n");
      out.write("    <p class=\"u-text u-text-2\"> HappyProgramming@gmail.com</p>\r\n");
      out.write("    <div class=\"u-grey-light-2 u-map u-map-1\">\r\n");
      out.write("      <div class=\"embed-responsive\">\r\n");
      out.write("        <iframe class=\"embed-responsive-item\"\r\n");
      out.write("          src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d287205.9795192053!2d-121.9745609966744!3d37.31390644748984!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fcae48af93ff5%3A0xb99d8c0aca9f717b!2sSan%20Jose%2C%20California%2C%20Hoa%20K%E1%BB%B3!5e0!3m2!1svi!2s!4v1632219783213!5m2!1svi!2s\"\r\n");
      out.write("          data-map=\"JTdCJTIycG9zaXRpb25UeXBlJTIyJTNBJTIybWFwLWVtYmVkJTIyJTJDJTIyYWRkcmVzcyUyMiUzQSUyMk1hbmhhdHRhbiUyQyUyME5ldyUyMFlvcmslMjIlMkMlMjJ6b29tJTIyJTNBMTAlMkMlMjJ0eXBlSWQlMjIlM0ElMjJyb2FkJTIyJTJDJTIybGFuZyUyMiUzQW51bGwlMkMlMjJhcGlLZXklMjIlM0ElMjJkJTIyJTJDJTIybWFya2VycyUyMiUzQSU1QiU1RCUyQyUyMmVtYmVkJTIyJTNBJTIyaHR0cHMlM0ElMkYlMkZ3d3cuZ29vZ2xlLmNvbSUyRm1hcHMlMkZlbWJlZCUzRnBiJTNEITFtMTghMW0xMiExbTMhMWQyODcyMDUuOTc5NTE5MjA1MyEyZC0xMjEuOTc0NTYwOTk2Njc0NCEzZDM3LjMxMzkwNjQ0NzQ4OTg0ITJtMyExZjAhMmYwITNmMCEzbTIhMWkxMDI0ITJpNzY4ITRmMTMuMSEzbTMhMW0yITFzMHg4MDhmY2FlNDhhZjkzZmY1JTI1M0EweGI5OWQ4YzBhY2E5ZjcxN2IhMnNTYW4lMjUyMEpvc2UlMjUyQyUyNTIwQ2FsaWZvcm5pYSUyNTJDJTI1MjBIb2ElMjUyMEslMjVFMSUyNUJCJTI1QjMhNWUwITNtMiExc3ZpITJzITR2MTYzMjIxOTc4MzIxMyE1bTIhMXN2aSEycyUyMiU3RA==\"></iframe>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div><img class=\"u-image u-image-default u-image-2\" src=\"images/contact.png\" alt=\"\" data-image-width=\"177\"\r\n");
      out.write("      data-image-height=\"361\">\r\n");
      out.write("  </footer>\r\n");
      out.write("  <section class=\"copyright u-backlink u-clearfix u-grey-80\" style=\"height: 80px; \">\r\n");
      out.write("    <span>Copyright © 2021 HappyProgramming. All rights reserved.</span>\r\n");
      out.write("  </section>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

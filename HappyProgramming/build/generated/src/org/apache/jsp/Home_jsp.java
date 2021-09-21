package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px;\" lang=\"vi\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\n");
      out.write("  <title>Home</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/nicepage.css\" media=\"screen\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/Home.css\" media=\"screen\">\n");
      out.write("  <script class=\"u-script\" type=\"text/javascript\" src=\"js/jquery.js\" defer=\"\"></script>\n");
      out.write("  <script class=\"u-script\" type=\"text/javascript\" src=\"js/nicepage.js\" defer=\"\"></script>\n");
      out.write("  <link id=\"u-theme-google-font\" rel=\"stylesheet\"\n");
      out.write("    href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"u-body\">\n");
      out.write("  <header class=\"u-clearfix u-custom-color-1 u-header \"><a href=\"\" \n");
      out.write("      class=\"u-image u-logo u-image-1\" data-image-width=\"313\" data-image-height=\"95\" t>\n");
      out.write("      <img src=\"images/Logo.png\" class=\"u-logo-image u-logo-image-1\">\n");
      out.write("    </a>\n");
      out.write("    <nav class=\"u-align-right u-menu x u-offcanvas u-menu-1\" data-position=\"\" data-responsive-from=\"MD\">\n");
      out.write("    \n");
      out.write("      <div class=\"u-nav-container\">\n");
      out.write("        <ul class=\"u-custom-font u-nav u-spacing-30 u-text-font u-unstyled u-nav-1\">\n");
      out.write("          <li class=\"u-nav-item\"><a\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\n");
      out.write("              href=\"All-mentors.html\" style=\"padding: 10px 36px;\">All mentors</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"u-nav-item\"><a\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\n");
      out.write("              href=\"Request.html\" style=\"padding: 10px 36px;\">Request</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"u-nav-item\"><a\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\n");
      out.write("              href=\"All-skills.html\" style=\"padding: 10px 36px;\">All skills</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"u-nav-item\"><a\n");
      out.write("              class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\n");
      out.write("              style=\"padding: 10px 36px;\">User Profile</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("  <section class=\"u-clearfix u-custom-color-1 u-section-1\" id=\"sec-cd32\">\n");
      out.write("    <div class=\"u-clearfix u-sheet u-valign-middle u-sheet-1\">\n");
      out.write("      <img class=\"u-image u-image-1\" src=\"images/Homepagechalogin.png\" data-image-width=\"1812\" data-image-height=\"917\">\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <footer class=\"u-align-center u-clearfix u-footer \"><img class=\"u-image u-image-1\"\n");
      out.write("      src=\"images/logowhite.png\" data-image-width=\"571\" data-image-height=\"388\"><a\n");
      out.write("      class=\"u-active-none u-btn u-btn-rectangle u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-btn-1\">0123456789</a>\n");
      out.write("    <p class=\"u-text u-text-default u-text-1\"> San Jose,Silicon Valley, California</p>\n");
      out.write("    <p class=\"u-text u-text-2\"> HappyProgramming@gmail.com</p>\n");
      out.write("    <div class=\"u-grey-light-2 u-map u-map-1\">\n");
      out.write("      <div class=\"embed-responsive\">\n");
      out.write("        <iframe class=\"embed-responsive-item\"\n");
      out.write("          src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d287205.9795192053!2d-121.9745609966744!3d37.31390644748984!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fcae48af93ff5%3A0xb99d8c0aca9f717b!2sSan%20Jose%2C%20California%2C%20Hoa%20K%E1%BB%B3!5e0!3m2!1svi!2s!4v1632219783213!5m2!1svi!2s\"\n");
      out.write("          data-map=\"JTdCJTIycG9zaXRpb25UeXBlJTIyJTNBJTIybWFwLWVtYmVkJTIyJTJDJTIyYWRkcmVzcyUyMiUzQSUyMk1hbmhhdHRhbiUyQyUyME5ldyUyMFlvcmslMjIlMkMlMjJ6b29tJTIyJTNBMTAlMkMlMjJ0eXBlSWQlMjIlM0ElMjJyb2FkJTIyJTJDJTIybGFuZyUyMiUzQW51bGwlMkMlMjJhcGlLZXklMjIlM0ElMjJkJTIyJTJDJTIybWFya2VycyUyMiUzQSU1QiU1RCUyQyUyMmVtYmVkJTIyJTNBJTIyaHR0cHMlM0ElMkYlMkZ3d3cuZ29vZ2xlLmNvbSUyRm1hcHMlMkZlbWJlZCUzRnBiJTNEITFtMTghMW0xMiExbTMhMWQyODcyMDUuOTc5NTE5MjA1MyEyZC0xMjEuOTc0NTYwOTk2Njc0NCEzZDM3LjMxMzkwNjQ0NzQ4OTg0ITJtMyExZjAhMmYwITNmMCEzbTIhMWkxMDI0ITJpNzY4ITRmMTMuMSEzbTMhMW0yITFzMHg4MDhmY2FlNDhhZjkzZmY1JTI1M0EweGI5OWQ4YzBhY2E5ZjcxN2IhMnNTYW4lMjUyMEpvc2UlMjUyQyUyNTIwQ2FsaWZvcm5pYSUyNTJDJTI1MjBIb2ElMjUyMEslMjVFMSUyNUJCJTI1QjMhNWUwITNtMiExc3ZpITJzITR2MTYzMjIxOTc4MzIxMyE1bTIhMXN2aSEycyUyMiU3RA==\"></iframe>\n");
      out.write("      </div>\n");
      out.write("    </div><img class=\"u-image u-image-default u-image-2\" src=\"images/contact.png\" alt=\"\" data-image-width=\"177\"\n");
      out.write("      data-image-height=\"361\">\n");
      out.write("  </footer>\n");
      out.write("  <section class=\"copyright u-backlink u-clearfix u-grey-80\" style=\"height: 80px; \">\n");
      out.write("    <span>Copyright © 2021 HappyProgramming. All rights reserved.</span>\n");
      out.write("  </section>\n");
      out.write("</body>\n");
      out.write("</html>");
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

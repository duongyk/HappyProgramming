package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nicepage.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Home.css\" media=\"screen\">\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/jquery.js\" defer=\"\"></script>\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/nicepage.js\" defer=\"\"></script>\n");
      out.write("        <link id=\"u-theme-google-font\" rel=\"stylesheet\"\n");
      out.write("              href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"u-body\">\n");
      out.write("        <header class=\"u-clearfix u-custom-color-1 u-header \">\n");
      out.write("            <a href=\"\" class=\"u-image u-logo u-image-1\" data-image-width=\"313\" data-image-height=\"95\" t>\n");
      out.write("                <img src=\"images/Logo.png\" class=\"u-logo-image u-logo-image-1\">\n");
      out.write("            </a>\n");
      out.write("            <nav class=\"u-align-right u-menu x u-offcanvas u-menu-1\" data-position=\"\" data-responsive-from=\"MD\">\n");
      out.write("\n");
      out.write("                <div class=\"u-nav-container\">\n");
      out.write("                    <ul class=\"u-custom-font u-nav u-spacing-30 u-text-font u-unstyled u-nav-1\">\n");
      out.write("                        <li class=\"u-nav-item\"><a\n");
      out.write("                                class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\n");
      out.write("                                href=\"\" style=\"padding: 10px 36px;\">All mentors</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"u-nav-item\"><a\n");
      out.write("                                class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"\n");
      out.write("                                href=\"\" style=\"padding: 10px 36px;\">All skills</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"u-nav-item\"><a\n");
      out.write("                                class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-grey-90 u-text-hover-grey-90\"  href=\"login.jsp\" \n");
      out.write("                                style=\"padding: 10px 36px;\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

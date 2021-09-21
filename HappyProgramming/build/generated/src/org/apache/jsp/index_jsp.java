package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nicepage.css\" media=\"screen\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Home.css\" media=\"screen\">\r\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/jquery.js\" defer=\"\"></script>\r\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/nicepage.js\" defer=\"\"></script>\r\n");
      out.write("        <link id=\"u-theme-google-font\" rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body class=\"u-body\">\r\n");
      out.write("        <header>\r\n");
      out.write("             ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        <section class=\"u-clearfix u-custom-color-1 u-section-1\" id=\"sec-cd32\">\r\n");
      out.write("            <div class=\"u-clearfix u-sheet u-valign-middle u-sheet-1\">\r\n");
      out.write("                <img class=\"u-image u-image-1\" src=\"images/Homepagechalogin.png\" data-image-width=\"1812\" data-image-height=\"917\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <footer> ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" </footer>\r\n");
      out.write("    </body>\r\n");
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

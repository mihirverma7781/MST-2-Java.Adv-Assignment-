package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Covid 19 database</title>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\n");
      out.write("         <h2 style=\"color: white\" style=\"\">Covid-19 Admin Login Panel</h2>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </nav></marquee>\n");
      out.write("    \n");
      out.write("     <!-----------------------admin login---------------------------------->\n");
      out.write("<section class=\"my-5\" id=\"abc\">\n");
      out.write("  <div class=\"py-5\">\n");
      out.write("    <h2 class=\"text-center\">Admin Login</h2>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w-50 m-auto\">\n");
      out.write("    <form action=\"login_check.jsp\" method=\"POST\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Username</label>\n");
      out.write("        <input type=\"text\" name=\"username\" autocomplete=\"off\" class=\"form-control\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Password</label>\n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"password\"></input>\n");
      out.write("      </div>\n");
      out.write(" <button type=\"submit\" class=\"btn btn-success\">Login</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
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

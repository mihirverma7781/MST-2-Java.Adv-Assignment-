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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Covid 19 Citizen Details</title>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("        <marquee><h2 style=\"color: white\">Covid19 Citizen Details</h2></marquee>\n");
      out.write("  \n");
      out.write("<ul class=\"navbar-nav ml-auto\">\n");
      out.write("    <a class=\"nav-link \" href=\"login.jsp\">\n");
      out.write("        Admin Log In\n");
      out.write("      </a>\n");
      out.write("    </nav>\n");
      out.write("      <section class=\"my-5\" id=\"abc\">\n");
      out.write("  <div class=\"py-5\" >\n");
      out.write("    <h2 class=\"text-center\">Enter Details </h2>\n");
      out.write("  </div>\n");
      out.write("          <div class=\"w-50 m-auto\">\n");
      out.write("    <form bg action=\"details\" method=\"post\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Name</label>\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Full Name\" autocomplete=\"off\" class=\"form-control\" required>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label>Aadhar Number</label>\n");
      out.write("        <input type=\"text\" name=\"aadhar\" placeholder=\"Aadhar Number\" autocomplete=\"off\" class=\"form-control\" required>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label>Mobile Number</label>\n");
      out.write("        <input type=\"number\" name=\"mobile\" placeholder=\"Mobile Number\" autocomplete=\"off\" class=\"form-control\" required>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label>Current Location</label>\n");
      out.write("        <input type=\"text\" name=\"current_location\" placeholder=\"Current Location\" autocomplete=\"off\" class=\"form-control\" required>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Home Location</label>\n");
      out.write("        <input type=\"text\" name=\"home_location\" placeholder=\"Home Town\" autocomplete=\"off\" class=\"form-control\" required>\n");
      out.write("      </div>  \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Getting Meal three times a day</label>\n");
      out.write("       <div class=\"radio\">\n");
      out.write("  <label><input type=\"radio\" name=\"meal\" value=\"yes\">Yes</label>\n");
      out.write("  <label><input type=\"radio\" name=\"meal\" value=\"no\">No</label>\n");
      out.write("       </div></div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("  <label>Any sick member in family</label>\n");
      out.write("        <div class=\"radio\">\n");
      out.write("      <label><input type=\"radio\" name=\"sick\" value=\"yes\">Yes</label>\n");
      out.write("  <label><input type=\"radio\" name=\"sick\" value=\"no\">No</label>\n");
      out.write("        </div></div>\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("        <label>Number of family member stranded</label>\n");
      out.write("        <input type=\"number\" name=\"mem\" placeholder=\"members\" autocomplete=\"off\" class=\"form-control\" required>\n");
      out.write("      </div>\n");
      out.write(" <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SIGN UP</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("  <h2 style=\"color: white\">HEALTH COUNCIL</h2>\n");
      out.write("    \n");
      out.write("<ul class=\"navbar-nav ml-auto\">\n");
      out.write("    <a class=\"nav-link \" href=\"login.jsp\">\n");
      out.write("     Log In\n");
      out.write("      </a>\n");
      out.write("<ul class=\"navbar-nav ml-auto\">\n");
      out.write("    <a class=\"nav-link active\" href=\"signup.jsp\">\n");
      out.write("      Create Acc.\n");
      out.write("      </a>\n");
      out.write(" \n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("      <section class=\"my-5\" id=\"abc\">\n");
      out.write("  <div class=\"py-5\">\n");
      out.write("    <h2 class=\"text-center\">ADMIN SIGNUP </h2>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w-50 m-auto\">\n");
      out.write("    <form action=\"reg.jsp\" method=\"POST\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>First Name</label>\n");
      out.write("        <input type=\"text\" name=\"fname\" placeholder=\"Fisrt Name \" autocomplete=\"off\" class=\"form-control\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label>Last Name</label>\n");
      out.write("        <input type=\"text\" name=\"lname\" placeholder=\"Last Name \" autocomplete=\"off\" class=\"form-control\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label>E-mail</label>\n");
      out.write("        <input type=\"email\" name=\"email\" placeholder=\"E-mail \" autocomplete=\"off\" class=\"form-control\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label>Mobile Number</label>\n");
      out.write("        <input type=\"number\" name=\"mobile\" placeholder=\"Mobile Number\" autocomplete=\"off\" class=\"form-control\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Pin No.</label>\n");
      out.write("        <input type=\"password\" placeholder=\"Password\" class=\"form-control\" name=\"password\"></input>\n");
      out.write("      </div>\n");
      out.write(" <button type=\"submit\" class=\"btn btn-success\">Sign Up</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("        \n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"page-footer font-small unique-color-dark\">\n");
      out.write("\n");
      out.write("  <div style=\"background-color: black;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <!-- Grid row-->\n");
      out.write("      <div class=\"row py-4 d-flex align-items-center\">\n");
      out.write("          <!-- Grid column -->\n");
      out.write("        <div class=\"col-md-6 col-lg-7 text-center text-md-right\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("          <!--Instagram-->\n");
      out.write("          <a class=\"ins-ic\">\n");
      out.write("            <i class=\"fab fa-instagram white-text\"> </i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Grid column -->\n");
      out.write("\n");
      out.write("      \n");
      out.write("      <!-- Grid row-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"container text-center text-md-left mt-5\">\n");
      out.write("   <div class=\"row mt-3\">\n");
      out.write("    <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\n");
      out.write("        <h2 class=\"text-uppercase font-weight-bold\" style=\"color: white\">HEALTH COUNCIL</h2>\n");
      out.write("        <hr class=\"deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("        <p style=\"color: white\"></p>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\" style=\"color: white\">Help Section</h6>\n");
      out.write("        <hr class=\"deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("        <p style=\"color: white\">\n");
      out.write("          Your Account\n");
      out.write("        </p>\n");
      out.write("        <p style=\"color: white\">\n");
      out.write("          Become an Affiliate\n");
      out.write("        </p>\n");
      out.write("        <p style=\"color: white\">\n");
      out.write("          Queries\n");
      out.write("        </p>\n");
      out.write("        <p style=\"color: white\">\n");
      out.write("          Contact        </p>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n");
      out.write("\n");
      out.write("        <!-- Links -->\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\" style=\"color: white\">Contact</h6>\n");
      out.write("        <hr class=\"deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("        <p style=\"color: white\">\n");
      out.write("          <i class=\"fas fa-home mr-3\"></i>INDORE</p>\n");
      out.write("        <p style=\"color: white\">\n");
      out.write("          <i class=\"fas fa-envelope mr-3\"></i> Mpgovt@hotmail.com.com</p>\n");
      out.write("        <p style=\"color: white\">\n");
      out.write("          <i class=\"fas fa-phone mr-3\"></i> +91 7000510276</p>\n");
      out.write("       \n");
      out.write("         \n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("  <div class=\"footer-copyright text-center py-3\">© 2020 Copyright: @MIHIR-VERMA\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <!-- Copyright -->\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("  </body>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write("      .content-table{\n");
      out.write("          border-collapse: collapse;\n");
      out.write("          margin: 25px 0;\n");
      out.write("          font-size: 0.9em;\n");
      out.write("          min-width: 400px;\n");
      out.write("          border-radius: 5px 5px 0 0;\n");
      out.write("          overflow: hidden;\n");
      out.write("          box-shadow: 0 0 20px rgba(0,0,0,0.15);\n");
      out.write("      }\n");
      out.write("      .content-table thead tr{\n");
      out.write("          background-color: #009879;\n");
      out.write("          color: #ffffff;\n");
      out.write("          text-align: left;\n");
      out.write("          font-weight: bold;\n");
      out.write("          \n");
      out.write("      }\n");
      out.write("      .content-table th,\n");
      out.write("      .content-table td{\n");
      out.write("          padding: 12px 15px;\n");
      out.write("      }\n");
      out.write("      .content-table tbody tr{\n");
      out.write("          border-bottom: 1px solid #dddddd;\n");
      out.write("      }\n");
      out.write("      .content-table tbody tr:nth-of-type(even){\n");
      out.write("          background-color: #f3f3f3;\n");
      out.write("      }\n");
      out.write("      .content-table tbody tr:last-of-type{\n");
      out.write("          border-bottom: 2px solid #009879;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <nav class= \"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("         <marquee><h1 style=\"color: white\">Covid19 Citizen Details</h1></marquee>\n");
      out.write("</nav>\n");
      out.write("<!---------------------------------nav bar ends------------>\n");
      out.write("\n");
      out.write("    <center><br><br>\n");
      out.write("        <table class=\"content-table\"  >\n");
      out.write("            <thead>\n");
      out.write("    <tr  style=\"\">\n");
      out.write("        <th>S.No</th>\n");
      out.write("        <th>Name</th>\n");
      out.write("        <th>Aadhar Number</th>\n");
      out.write("        <th>Mobile Number</th>\n");
      out.write("          <th>Current Location</th>\n");
      out.write("            <th>Home Location</th>\n");
      out.write("            <th>Getting meals 3 times a day</th>\n");
      out.write("            <th>Any sick family members</th>\n");
      out.write("            <th>Number of family member stranded</th>\n");
      out.write("    </tr>\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("          \n");
      out.write("         ");

             Connection con =null;
             Statement st=null;
             ResultSet rs=null;
   try{
   Class.forName("com.mysql.jdbc.Driver");
   con= DriverManager.getConnection("jdbc:mysql://localhost:3307/covid","root","bitnami");
  st=con.createStatement();
  String qry="Select * from citizen";
  rs=st.executeQuery(qry);
  while(rs.next()){
  
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      <td>");
      out.print( rs.getString(1));
      out.write("</td>\n");
      out.write("      <td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("      <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("      <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("      <td>");
      out.print( rs.getString(5) );
      out.write("</td>\n");
      out.write("      <td>");
      out.print( rs.getString(6));
      out.write("</td>\n");
      out.write("      <td>");
      out.print( rs.getString(7));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( rs.getString(8));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( rs.getString(9));
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  ");

  }
   }
   catch(Exception e)
   {
       
   }
         
      out.write("\n");
      out.write("</table></center>\n");
      out.write("</body>\n");
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

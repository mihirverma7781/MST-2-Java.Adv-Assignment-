import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/details")
public class details extends HttpServlet {     
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
   String name=request.getParameter("name");
   String aadhar=request.getParameter("aadhar");
   String mobile=request.getParameter("mobile");  
   String current_location=request.getParameter("current_location");  
   String home_location=request.getParameter("home_location");
  String meal=request.getParameter("meal");
  String sick=request.getParameter("sick");
  String mem=request.getParameter("mem");
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/covid","root","bitnami");
              Statement st= conn.createStatement();
  ResultSet rt;
  int i =st.executeUpdate("insert into citizen(name,aadhar,mobile,current_location,home_location,meal,sick,mem) values ('"+name+"','"+aadhar+"','"+mobile+"','"+current_location+"','"+home_location+"','"+meal+"','"+sick+"','"+mem+"')");
  RequestDispatcher rs= request.getRequestDispatcher("/index.jsp");
             rs.forward(request, response);
             
        } catch (SQLException ex) {
           out.print("error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(details.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
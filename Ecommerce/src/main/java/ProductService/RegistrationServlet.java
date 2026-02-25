package ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Role based Registration
		response.setContentType("text/html");

    	try(PrintWriter out=response.getWriter();){
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String role = request.getParameter("role");
        
        out.println("user: "+ user);
        out.println("password: "+ pass);
        
        String url = "jdbc:mysql://localhost:3306/ecommerce";
        String DBuser = "root";
        String DBpassword = "hema";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection con = DriverManager.getConnection(url, DBuser, DBpassword);
                 PreparedStatement as = con.prepareStatement(
                     "INSERT INTO users(username, password, role) VALUES (?, ?, ?)");) {

                as.setString(1, user);
                as.setString(2, pass);
                as.setString(3, role);

                int value = as.executeUpdate();

                if (value == 1) {
                    response.sendRedirect(request.getContextPath() + "/Login.jsp");
                } else {
                    out.println("Registration Failed");
                }
            }
      
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
	}

}

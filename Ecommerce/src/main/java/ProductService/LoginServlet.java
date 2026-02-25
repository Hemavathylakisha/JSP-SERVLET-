package ProductService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Role based 
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        String selectedRole  = request.getParameter("role");

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/ecommerce",
	                    "root",
	                    "hema");

	            PreparedStatement ps = con.prepareStatement(
	                    "SELECT * FROM users WHERE username=? AND password=? AND role=?");

	            ps.setString(1, username);
	            ps.setString(2, password);
	            ps.setString(3, selectedRole );

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {

	                String role = rs.getString("role");

	                HttpSession session = request.getSession();
	                session.setAttribute("username", username);
	                session.setAttribute("role", role);

	             // 🔥 ROLE BASED REDIRECT
	                if (role.equalsIgnoreCase("admin")) {

	                    response.sendRedirect(
	                        request.getContextPath() + "/adminDashboard.jsp");

	                } else if (role.equalsIgnoreCase("user")) {

	                    response.sendRedirect(
	                        request.getContextPath() + "/ProductServlet");

	                }

	            } else {
	                request.setAttribute("error", "Invalid Credentials");
	                request.getRequestDispatcher("/Login.jsp")
	                       .forward(request, response);
	            }

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}

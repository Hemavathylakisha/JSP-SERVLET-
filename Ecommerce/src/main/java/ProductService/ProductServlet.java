package ProductService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
    	response.setContentType("text/html");
    	
    	HttpSession session = request.getSession(false);

    	if (session == null) {
    	    response.sendRedirect("Login.jsp");
    	    return;
    	}

    	String role = (String) session.getAttribute("role");
        String action = request.getParameter("action");
        
        if (role == null) {
    	    response.sendRedirect(request.getContextPath() + "/Login.jsp");
    	    return;
    	}

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ecommerce",
                    "root",
                    "hema");

            // 🔹 DELETE (Admin Only)
            if ("delete".equals(action)) {

            	if (!"admin".equalsIgnoreCase(role)) {
                    response.sendRedirect(request.getContextPath() + "/login.jsp");
                    return;
                }

                int id = Integer.parseInt(
                        request.getParameter("id"));

                PreparedStatement ps =
                        con.prepareStatement(
                                "DELETE FROM products WHERE id=?");

                ps.setInt(1, id);
                ps.executeUpdate();
            }
         // 🔹 EDIT - Fetch single product by ID
            if ("edit".equals(action)) {

                int id = Integer.parseInt(request.getParameter("id"));

                PreparedStatement ps = con.prepareStatement(
                        "SELECT * FROM products WHERE id=?");

                ps.setInt(1, id);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    request.setAttribute("id", rs.getInt("id"));
                    request.setAttribute("name", rs.getString("name"));
                    request.setAttribute("price", rs.getDouble("price"));
                    request.setAttribute("category", rs.getString("category"));

                    request.getRequestDispatcher("editProduct.jsp")
                           .forward(request, response);
                    return;   // VERY IMPORTANT
                }
            }
            // 🔹 FETCH PRODUCTS (NO CONSTRUCTOR)
            PreparedStatement ps =
                    con.prepareStatement(
                            "SELECT * FROM products");

            ResultSet rs = ps.executeQuery();

            List<String[]> list = new ArrayList<>();

            while (rs.next()) {

                String[] row = new String[4];
                row[0] = String.valueOf(rs.getInt("id"));
                row[1] = rs.getString("name");
                row[2] = String.valueOf(rs.getDouble("price"));
                row[3] = rs.getString("category");

                list.add(row);
            }

            request.setAttribute("list", list);
            request.getRequestDispatcher("/viewProducts.jsp")
                   .forward(request, response);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
    	
    	response.setContentType("text/html");
        HttpSession session = request.getSession(false);

        if (session == null ||
        			!"admin".equalsIgnoreCase((String) session.getAttribute("role"))) {

            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return;
        }

        String action = request.getParameter("action");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ecommerce",
                    "root",
                    "hema");

            // 🔹 INSERT
            if ("insert".equals(action)) {

                String name = request.getParameter("name");
                double price = Double.parseDouble(
                        request.getParameter("price"));
                String category =
                        request.getParameter("category");

                PreparedStatement ps =
                        con.prepareStatement(
                                "INSERT INTO products(name,price,category) VALUES(?,?,?)");

                ps.setString(1, name);
                ps.setDouble(2, price);
                ps.setString(3, category);

                ps.executeUpdate();
            }

            // 🔹 UPDATE
            else if ("update".equals(action)) {

                int id = Integer.parseInt(
                        request.getParameter("id"));

                String name = request.getParameter("name");
                double price = Double.parseDouble(
                        request.getParameter("price"));
                String category =
                        request.getParameter("category");

                PreparedStatement ps =
                        con.prepareStatement(
                                "UPDATE products SET name=?, price=?, category=? WHERE id=?");

                ps.setString(1, name);
                ps.setDouble(2, price);
                ps.setString(3, category);
                ps.setInt(4, id);

                ps.executeUpdate();
            }

            response.sendRedirect(request.getContextPath() +"/ProductServlet");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

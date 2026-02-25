<%@ page session="true" %>
<%
    String role = (String) session.getAttribute("role");
    if(role == null || !role.equals("admin")){
        response.sendRedirect("accessDenied.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>AdminDashboard</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
</head>
<body>
<div class="container">
<div class="header">
<h2>Welcome Admin: <%= session.getAttribute("username") %></h2>
</div> 
<a href="addProduct.jsp">Add Product</a> |
<a href="ProductServlet?action=view">View Products</a> |
<a href="ProductServlet?action=update">update Products</a> |
<a href="LogoutServlet">Logout</a>
</div>
</body>
</html>

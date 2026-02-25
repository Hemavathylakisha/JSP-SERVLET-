<%@ page session="true" %>
<%
    String role = (String) session.getAttribute("role");
    if(role == null || !role.equals("user")){
        response.sendRedirect("accessDenied.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>UserDashboard</title>
</head>
<body>

<h2>Welcome User: <%= session.getAttribute("username") %></h2>

<a href="ProductServlet?action=view">View Products</a> |
<a href="LogoutServlet">Logout</a>

</body>
</html>

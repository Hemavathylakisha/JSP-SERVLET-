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
    <title>Add Product</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
</head>
<body>

<h2>Add Product</h2>
<div class="box">
<form action="ProductServlet" method="post">
    <input type="hidden" name="action" value="insert" />

    Name: <input type="text" name="name" required /><br><br>
    Price: <input type="number" name="price" required /><br><br>
    category: <input type="text" name="category" required /><br><br>

    <input type="submit" value="Add Product">
</form>

<a href="adminDashboard.jsp">Back</a>
</div>
</body>
</html>

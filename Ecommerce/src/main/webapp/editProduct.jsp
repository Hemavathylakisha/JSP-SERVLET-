<%
    String role = (String) session.getAttribute("role");

    if(role == null || !role.equalsIgnoreCase("admin")){
        response.sendRedirect("Login.jsp");
        return;
    }
%>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
<div class="box">
<h2>Edit Product</h2>

<form action="ProductServlet" method="post">

    <input type="hidden" name="action" value="update">
    <input type="hidden" name="id" value="<%= request.getAttribute("id") %>">

    Name:
    <input type="text" name="name"
           value="<%= request.getAttribute("name") %>"><br><br>

    Price:
    <input type="number" step="0.01" name="price"
           value="<%= request.getAttribute("price") %>"><br><br>

    Category:
    <input type="text" name="category"
           value="<%= request.getAttribute("category") %>"><br><br>

    <input type="submit" value="Update Product">

</form>

<a href="ProductServlet">Back</a>
</div>
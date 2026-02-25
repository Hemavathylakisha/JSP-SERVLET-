<%@ page import="java.util.List" %>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
<%
    List<String[]> list =
        (List<String[]>) request.getAttribute("list");

    String role =
        (String) session.getAttribute("role");
%>
<div class="container">
<h2>Welcome : <%= session.getAttribute("username") %> | <a href="LogoutServlet">Logout</a></h2>
<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Category</th>

    <% if("admin".equalsIgnoreCase(role)) { %>
        <th colspan=2>Actions</th>
    <% } %>
</tr>

<%
    if(list != null){
        for(String[] row : list){
%>

<tr>
    <td><%= row[0] %></td>
    <td><%= row[1] %></td>
    <td><%= row[2] %></td>
    <td><%= row[3] %></td>

    <% if("admin".equalsIgnoreCase(role)) { %>
     <td>
        <a href="ProductServlet?action=edit&id=<%= row[0] %>">
            Update
        </a>
    </td>
    <td>
        <a href="ProductServlet?action=delete&id=<%= row[0] %>">
            Delete
        </a>
    </td>
    <% } %>
</tr>

<%
        }
    }
%>

</table>
</div>
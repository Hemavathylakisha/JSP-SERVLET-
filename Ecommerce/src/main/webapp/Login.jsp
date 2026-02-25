<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">

<script type="text/javascript">
function validate(){

    const user = document.getElementById("username").value;
    const pass = document.getElementById("password").value;
    const role = document.getElementById("role").value;

    if(user.trim() === ""){
        alert("Username must be given");
        return false;
    }

    if(pass.trim() === ""){
        alert("Password must be given");
        return false;
    }

    if(role === ""){
        alert("Please select your role");
        return false;
    }

    return true;
}
</script>

</head>
<body>

<h1>LOGIN HERE</h1>

<div class="box">
    <form action="LoginServlet" onsubmit="return validate()" method="post">

        <div>
            <label for="username">User Name :</label>
            <input type="text" name="username" id="username"/>
        </div>

        <div>
            <label for="password">Password :</label>
            <input type="password" name="password" id="password"/>
        </div>

        <div>
            <label for="role">Role :</label>
            <select name="role" id="role">
                <option value="">-- Select Role --</option>
                <option value="admin">Admin</option>
                <option value="user">User</option>
            </select>
        </div>

        <br>
        <input type="submit" value="Login" />

    </form>
    <p>Do you want to <a href="Registration.jsp">Register?</a></p>
</div>
<font color="red">
    ${error}
</font>
</body>
</html>

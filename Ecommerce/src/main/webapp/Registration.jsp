<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
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

	if(role.trim() === ""){
		alert("Enter your role");
		return false;
	}
return true;
}
</script>
</head>
<body>
<h1>REGISTER HERE</h1>
	<div class="box">
		<form action="RegistrationServlet" onsubmit="return validate()" method="post">
		<div>
			<Label for="username">User name :</Label>
			<input type="text" name="username" id="password"/>
		</div>
		<div>
			<Label for="password">Password :</Label>
			<input type="password" name="password" id="password"/>
		</div>
		<div>
			<Label for="role">Role :</Label>
			<input type="text" name="role" id="role"/>
		</div>
		<input type="submit" value="Register" />
		</form>
		<p>Do you want to <a href="Login.jsp">Login?</a></p>
	</div>
</body>
</html>
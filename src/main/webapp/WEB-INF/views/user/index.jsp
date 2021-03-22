<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title> Login Page </title>
</head>
<body>
	<div align="center">
		<h2>User Search</h2>
		<div style="color:red">${msg}</div>
				<h1>Please Sign In</h1>
        		<form id="submitLogin" action="/user/login" method="post">
        			username: <input type="text" name="username" /><br />
        			password:<input type = "password" name="password"/> <br/>
        			<input type="submit" value="login" />
        			<a href="registerform.html"> register</a>
        		</form>
		</form>
		
		
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Login Page</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
	<header>
		<h1>BookMyShow.com</h1>
	</header>
	<h1>Login Page</h1>
	<div class="Form">
		<form action="Login" method="POST">
			<table>
				<tr>
					<td><label for="UserType">UserType : </label></td>
					<td><select id="UserType" name="UserType" required>
							<option value="User">User</option>
							<option value="Admin" selected>Admin</option>
					</select></td>
				</tr>
				<tr>
					<td><label>User ID : </label></td>
					<td><input type="text" name="UserID"></td>
				</tr>
				<tr>
					<td><label>Password : </label></td>
					<td><input type="password" name="Password"></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit">Login</button></td>
				</tr>
			</table>
		</form>
		<h2 style="color: red">${errorMsg}</h2>
	</div>
	<form style="display: block; margin-left: 40%"
		action="UserRegistration" method="get">
		<button type="Submit">Registration</button>
	</form>
</body>
</html>
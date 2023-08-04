<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
	background-image:
		url("https://t3.ftcdn.net/jpg/02/88/21/58/240_F_288215857_sqnJAikWXZTu9GpgmtXrgOyoON7SiE4R.jpg");
	background-position: center;
	background-repeat: no-repeat;
	background-size: 100% 100%;
	background-attachment: fixed;
	back
}
</style>
<meta name="viewport" contents="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<link rel="stylesheet" href="/css/Login1.css">

</head>
<body>

	<br>
	<br>
	<br>
	<br>
	<div class="container">

		<form action="Login1" class="form" method="POST">
			<h2>SIGN IN</h2>


			<input type="text" name="UserID" class="box"
				placeholder="Enter Userid" required> <input type="password"
				name="Password" class="box" placeholder="Enter Password" required>
			<input type="submit" value="SIGN IN" id="submit"> <a
				href="UserRegistration">REGISTER </a>
		</form>

		<div class="side">
			<img
				src="https://as2.ftcdn.net/v2/jpg/05/05/37/09/1000_F_505370998_zkiRZmSKt6em0Ii5RZ2XjaLhDurQ84xP.jpg">
		</div>
	</div>
	<br>
	<br>
	<div>
		<h2 style="color: red">${errorMsg}</h2>
	</div>


</body>
</html>
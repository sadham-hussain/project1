<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<title>Responsive Slider</title>
</head>
<body>

	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img
					src=" https://t4.ftcdn.net/jpg/04/43/85/93/240_F_443859396_PIyf45RCWQlLe59mQNQ2RAaUvkeZNB1Q.jpg"
					class="d-block w-80" alt="...">
			</div>
			<div class="carousel-item">
				<img
					src="https://t4.ftcdn.net/jpg/05/63/82/09/240_F_563820969_n1AtS8rZehCs8eVVLMrAPLBOyi25A75c.jpg"
					class="d-block w-80" alt="...">
			</div>

		</div>
		<button class="carousel-control-prev" type="button"
			data-target="#carouselExampleIndicators" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-target="#carouselExampleIndicators" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
		</button>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>


</body>
</html>

<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/style.css">

<style type="text/css">
body {
	background-color: white;
}
</style>
<title>User Registration Page</title>
</head>
<body>
	<header>
		<h1>BookMyShow.com</h1>
	</header>
	<h1>Registration Page</h1>
	<h2>${UserID}</h2>
	<div class="Form">
		<form action="UserRegistration" method="post">
			<table>
				<tr>
					<td><label for="FirstName">First Name : </label></td>
					<td><input type="text" id="FirstName" name="FirstName"
						required></td>
				</tr>
				<tr>
					<td><label for="LastName">Last Name : </label></td>
					<td><input type="text" id="LastName" name="LastName" required></td>
				</tr>

				<tr>
					<td><label for="Logintype">Login Type : </label></td>
					<td><select id="Logintype" name="Logintype" required>

							<option value="User">User</option>
							<option value="Admin" selected>Admin</option>

					</select></td>
				</tr>

				<tr>
					<td><label for="dob">DOB : </label></td>
					<td><input type="date" pattern="yyyyMMdd" id="dob" name="dob"
						min="1950-01-01" max="2017-01-01" required></td>
				</tr>



				<!-- 	<tr>
					<td><label for="Age">Age : </label></td>
					<td><input type="number" id="Age" name="Age" required></td>
				</tr> -->
				<tr>
					<td><label for="Gender">Gender : </label></td>
					<td><select id="Gender" name="Gender" required>
							<option value="Male" selected>Male</option>
							<option value="Female">Female</option>
					</select></td>
				</tr>
				<tr>
					<td><label for="Password">Password : </label></td>
					<td><input type="password" id="Password" name="Password"
						required></td>
				</tr>
				<tr>
					<td><label for="Address">Address : </label></td>
					<td><input type="text" id="Address" name="Address" required></td>
				</tr>
				<tr>
					<td><label for="PhoneNo">Phone Number : </label></td>
					<td><input type="number" id="PhoneNo" name="PhoneNo"
						min="100000000" max="9999999999" required></td>
				</tr>
				<tr>
					<td colspan="2"><button>Submit</button></td>
				</tr>
			</table>
		</form>
	</div>
	<form style="display: block; margin-left: 40%" action="/" method="get">
		<button type="submit">Login</button>
	</form>
</body>
</html>
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
<link rel="stylesheet" href="/css/navbar.css">
<title>Reservation Page</title>
</head>
<body>
	<header>
		<h1>BookMyShow.com</h1>
	</header>

	<ul>
		<li><a href="HomePage"> Home</a>
		<li><a href="ViewReservation"> View Reservation</a>
		<li style="float: right"><a href="Logout">Logout</a>
	</ul>

	<h1>Ticket Reservation</h1>
	<form action="Reservation" method="post">
		<table>
			<tr>
				<td><label for="UserID">User ID</label></td>
				<td><input type="text" name="UserID" value="${UserID}"></td>
			</tr>
			<tr>
				<td><label for="ShowID">Show ID</label></td>
				<td><input type="text" name="ShowID" value="${ShowID}"></td>
			</tr>
			<tr>
				<td><label for="NoOfSeats">No Of Seats</label></td>
				<td><input type="number" name="NoOfSeats" min="1" max="5"
					required></td>
			</tr>
			<tr>
				<td><label for="SeatNoFrom">SeatNoFrom</label></td>
				<td><input type="number" name="SeatNoFrom" min="1" max=""
					required></td>
			</tr>
			<tr>
				<td><label for="SeatNoTo">SeatNoTo</label></td>
				<td><input type="number" name="SeatNoTo" required></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">Save Reservation</button></td>
			</tr>
		</table>
	</form>
	<h2>${ReservationID}</h2>
</body>
</html>
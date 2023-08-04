<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
<title>View and Print Reservation</title>
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
	<h1>View Reservation</h1>
	<form action="ViewReservationListReload" method="GET">
		<table>
			<tr>
				<td><label for="Reservation">Select Theatre</label></td>
				<td><select name="SelectedReservation"
					onchange='if(this.value != 0) { this.form.submit(); }'>
						<option value="0">Select</option>
						<c:forEach var="Reservation" items="${ReservationList}">
							<option value="${Reservation.getReservationID()}">${Reservation.getReservationID()}</option>
						</c:forEach>
				</select></td>
			</tr>
		</table>
	</form>
	<form>
		<table>
			<tr>
				<td><label for="TheatreName">Theatre Name</label></td>
				<td><label for="TheatreName">:${TheatreName}</label></td>
			</tr>
			<tr>
				<td><label for="MovieName">Movie Name</label></td>
				<td><label for="MovieName">:${MovieName}</label></td>
			</tr>
			<tr>
				<td><label for="TimeSlot">Time Slot</label></td>
				<td><label for="TimeSlot">:${TimeSlot}</label></td>
			</tr>
			<tr>
				<td><label for="NoOfSeats">No Of Seats</label></td>
				<td><label for="NoOfSeats">:${NoOfSeats}</label></td>
			</tr>
			<tr>
				<td><label for="SeatNoFrom">Seat No From</label></td>
				<td><label for="SeatNoFrom">:${SeatNoFrom}</label></td>
			</tr>
			<tr>
				<td><label for="SeatNoTo">Seat No To</label></td>
				<td><label for="SeatNoTo">:${SeatNoTo}</label></td>
			</tr>
		</table>
	</form>
	<form action="PrintReservation" method="get">
		<button style="display: block; margin-left: 40%" type="submit">Print</button>
	</form>
	<form action="CreditCard" method="get">
		<button style="display: block; margin-left: 40%" type="submit">Payment</button>
	</form>
	<form action="Cancel" method="get">
		<button style="display: block; margin-left: 40%" type="submit">Cancel</button>
	</form>
</body>
</html>
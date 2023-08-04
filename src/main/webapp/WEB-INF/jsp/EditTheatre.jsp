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
<title>Edit Theatre</title>
</head>
<body>
	<header>
		<h1>welcome to dk show bookings</h1>
	</header>

	<ul>
		<li><a href="AddTheatre">AddTheatre</a></li>
		<li><a href="AddMovie">Movies</a></li>
		<li><a href="AddShow">Shows</a></li>
		<li style="float: right"><a href="Logout">Logout</a></li>
	</ul>


	<nav>
		<form action="AddTheatre" action="GET">
			<button type="submit">Add Theatre</button>
		</form>
		<form action="EditTheatre" method="GET">
			<button type="submit">Edit Theatre</button>
		</form>
		<form action="DeleteTheatre" method="GET">
			<button type="submit">Delete Theatre</button>
		</form>
	</nav>
	<h1>Edit Theatre</h1>
	<div>
		<form action="EditTheatreListReload" method="GET">
			<table>
				<tr>
					<td><label for="Theatre">Select Theatre</label></td>
					<td><select name="SelectedTheatre"
						onchange='if(this.value != 0) { this.form.submit(); }'>
							<option value="0">Select</option>
							<c:forEach var="Theatre" items="${TheatreList}">
								<option value="${Theatre.getTheatreID()}">${Theatre.getTheatreName()}</option>
							</c:forEach>
					</select></td>
				</tr>
			</table>
		</form>
		<form action="EditTheatre" method="POST">
			<table>
				<tr>
					<td><label for="TheatreName">Theatre Name</label></td>
					<td><input type="text" id="TheatreName" name="TheatreName"
						required value="${TheatreName}"></td>
				</tr>
				<tr>
					<td><label for="MetroLocation">Metro Location</label></td>
					<td><input type="text" id="MetroLocation" name="MetroLocation"
						required value="${MetroLocation}"></td>
				</tr>
				<tr>
					<td><label for="District">District</label></td>
					<td><input type="text" id="District" name="District" required
						value="${District}"></td>
				</tr>
				<tr>
					<td><label for="NumberOfShows">Number of Shows</label></td>
					<td><input type="number" id="NumberOfShows"
						name="NumberOfShows" required value="${NumberOfShows}"></td>
				</tr>
				<tr>
					<td><label for="SeatingCapacity">Seating Capacity</label></td>
					<td><input type="number" id="SeatingCapacity"
						name="SeatingCapacity" required value="${SeatingCapacity}"></td>
				</tr>
				<tr>
					<td><label for="ReservationCapacityRegular">Reservation
							Capacity Regular</label></td>
					<td><input type="number" id="ReservationCapacityRegular"
						name="ReservationCapacityRegular" required
						value="${ReservationCapacityRegular}"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">Edit</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

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
<title>Edit Movie</title>
</head>
<body>
	<header>
		<h1>BookMyShow.com</h1>
	</header>

	<ul>
		<li><a href="AddTheatre">AddTheatre</a></li>
		<li><a href="AddMovie">Movies</a></li>
		<li><a href="AddShow">Shows</a></li>
		<li><a href="EditMovie">Edit Movie</a></li>
		<li><a href="DeleteMovie">Delete Movie</a></li>
		<li style="float: right"><a href="Logout">Logout</a></li>
	</ul>


	<h1>Edit Movie</h1>
	<div>
		<form action="EditMovieListReload" method="GET">
			<table>
				<tr>
					<td><label for="Movie">Select Movie</label></td>
					<td><select name="SelectedMovie"
						onchange='if(this.value != 0) { this.form.submit(); }'>
							<option value="0">Select</option>
							<c:forEach var="Movie" items="${MovieList}">
								<option value="${Movie.getMovieID()}">${Movie.getMovieName()}</option>
							</c:forEach>
					</select></td>
				</tr>
			</table>
		</form>
		<form action="EditMovie" method="POST">
			<table>
				<tr>
					<td><label for="MovieName">Movie Name</label></td>
					<td><input type="text" id="MovieName" name="MovieName"
						required value="${MovieName}"></td>
				</tr>
				<tr>
					<td><label for="Language">Language</label></td>
					<td><input type="text" id="Language" name="Language" required
						value="${Language}"></td>
				</tr>
				<tr>
					<td><label for="Duration">Duration</label></td>
					<td><input type="Number" id="Duration" name="Duration"
						required value="${Duration}"></td>
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

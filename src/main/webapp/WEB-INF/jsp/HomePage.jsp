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
<title>Home</title>
<link rel="stylesheet" href="Homepage.css">
<style>
a:link, a:visited {
	background-color: #00ff00;
	color: white;
	padding: 14px 25px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
}

a:hover, a:active {
	background-color: red;
}
</style>
</head>
<body>
	<header>
		<h1></h1>
	</header>
	<div id="navContainer">
		<div id="float">
			<nav id="navContainer">
				<form action="Home" action="get">
					<button type="submit">Home</button>
				</form>
				<form action="UserRegistration" method="get">
					<button>Registration</button>
				</form>
				<form action="Login" method="get">
					<button>Login</button>
				</form>
				<form action="HomePage" method="get">
					<button>Ticket Booking</button>
				</form>
				<form action="Snacks" action="get">
					<button type="submit">Snacks</button>
				</form>
				<form action="Contact" method="get">
					<button type="submit">Contact</button>
				</form>
				<form action="Logout" method="post">
					<button>Logout</button>
				</form>
			</nav>
		</div>
	</div>
	<h2>Welcome user ${UserName}</h2>
	<div class="movie-container">
		<label>Pick a movie:</label> <select id="movie">
			<option value="120">Avengers: Endgame (&#x20B9 120)</option>
			<option value="96">Joker (&#x20B9 96)</option>
			<option value="120">Toy Story 4 (&#x20B9 120)</option>
			<option value="73">The Lion King (&#x20B9 73)</option>
		</select>
	</div>

	<ul class="showcase">
		<li>
			<div class="seat"></div> <small>N/A</small>
		</li>
		<li>
			<div class="seat selected"></div> <small>Selected</small>
		</li>
		<li>
			<div class="seat occupied"></div> <small>Occupied</small>
		</li>
	</ul>

	<div class="container">
		<div class="screen"></div>

		<div class="row">
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
		</div>
		<div class="row">
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat occupied"></div>
			<div class="seat occupied"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
		</div>
		<div class="row">
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat occupied"></div>
			<div class="seat occupied"></div>
		</div>
		<div class="row">
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
		</div>
		<div class="row">
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat occupied"></div>
			<div class="seat occupied"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
		</div>
		<div class="row">
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat"></div>
			<div class="seat occupied"></div>
			<div class="seat occupied"></div>
			<div class="seat occupied"></div>
			<div class="seat"></div>
		</div>
	</div>

	<p class="text">
		You have selected <span id="count">0</span> seats for a price of
		&#x20B9<span id="total">0</span>
	</p>
	<br>
	<form action="Payment" method="get">
		<button
			style="background-color: #00ff00; color: white; padding: 14px 25px; text-align: center; text-decoration: none; display: inline-block;">Purchase</button>
	</form>
	<script src="script.js"></script>
</body>
</html>
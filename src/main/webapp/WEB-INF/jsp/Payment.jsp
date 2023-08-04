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
<style>
body {
	background-image:
		url("https://t3.ftcdn.net/jpg/01/30/04/42/240_F_130044218_IB9NdTYAmponAQMSgyVIptxl3igjkRGt.jpg");
	background-repeat: no-repeat;
	background-size: 100% 100%;
	background-attachment: fixed;
	back
}
</style>
<title>Credit Card</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Make payment</h1>
	<form action="Payment" method="Post">
		<table>
			<tr>
				<td colspan=4>Amount to be Paid ${Amount}</td>
			</tr>
			<tr>
				<td colspan=1><label for="CreditCardNumber">Credit Card
						Number</label></td>
				<td colspan=3><input type="number" name="CreditCardNumber"></td>
			</tr>
			<tr>
				<td><label for="ValidFrom">Valid From</label></td>
				<td><input type="number" name="ValidFrom" min="00" max="99"
					required></td>
				<td><label for="ValidTo">Valid To</label></td>
				<td><input type="text" name="ValidTo" min="${ValidFrom}"></td>
			</tr>
			<tr>
				<td><label for="Pin">Pin</label></td>
				<td><input type="number" name="Pin" min="0" max="9999"></td>
			</tr>
			<tr>
				<td colspan=4>
					<button type="submit">Pay</button>
				</td>
			</tr>
		</table>
	</form>
	<h2 style="color: red">${ErrorMsg}</h2>
</body>
</html>
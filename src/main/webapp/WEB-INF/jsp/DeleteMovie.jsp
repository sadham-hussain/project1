<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/css/navbar.css">
<title>Delete Movie</title>
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


	<h1>Delete Movie</h1>
	<div>
		<form action="DeleteMovieListReload" method="GET">
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
		<form action="DeleteMovie" method="POST">
			<table>
				<tr>
					<td><label for="MovieName">Movie Name</label></td>
					<td><label for="MovieName">:${MovieName}</label></td>
				</tr>
				<tr>
					<td><label for="Language">Language</label></td>
					<td><label for="Language">:${Language}</label>
				</tr>
				<tr>
					<td><label for="Duration">Duration</label></td>
					<td><label for="Duration">:${Duration}</label></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">Delete</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

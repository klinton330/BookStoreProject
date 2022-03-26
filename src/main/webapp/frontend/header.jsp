<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<head>
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.header {
	overflow: hidden;
    padding: 20px 10px;
}

.header a {
	float: left;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

.header a.logo {
	font-size: 25px;
	font-weight: bold;
	color: black;
	
}

.header a:hover {
	background-color: #ddd;
	color: black;
	transition: width 2s;
	text-decoration: none;
}

.header a.active {
	background-color: dodgerblue;
	color: white;
	
}

.header-link a:hover
{
background-color: #ddd;
text-decoration: none;
}

.header-right {
	float: right;
	padding-top: 8px;
}

@media screen and (max-width: 500px) {
	.header a {
		float: none;
		display: block;
		text-align: left;
	}
	.header-normal {
		float: none;
	}
}

.header-link {
	overflow: hidden;
	background-color:#c8f0f7;
	text-align: center;
	padding: 10px;
	margin-right: 50px;
	margin-left: 50px;
	border-radius: 10px;
}

.header-link a {
	color: black;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
	font-weight: bold;
	
}


.main {
	margin-left: 160px; /* Same as the width of the sidenav */
	font-size: 28px; /* Increased text to enable scrolling */
	padding: 0px 10px;
}
</style>



</head>

<body>
	<div class="header">
		<a href="#default" class="logo">Pink-Man Bookstore</a>
		
		<div class="header-normal">
		
			<a class="active" href="#home">Home</a> <a href="#contact">Contact</a>
			<a href="#about">About</a>
		</div>

		<div class="header-right">
			<input type="search" name="keyword"> <input type="button"
				class="btn btn-info" value="Search">

		</div>
		<div style="float: right;">
			<a href="">Sign In</a> <a href="">Register</a> <a href="">View
				Cart</a>
		</div>
	</div>

	<div class="header-link">
		<a href="">Business</a> <a href="">Health</a> <a href="">Marketing</a>
		<a href="">Programming</a> <a href="">Technology</a> <a href="">Lifestyle</a>
		<a href="">History</a>
	</div>


</body>
</html>
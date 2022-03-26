<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
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
<title>Pink-Man Admin</title>
<style>
.quick-links
{
padding: 20px;
}
.quick-links:after{
    content: ""; 
    display: block; 
    margin: 0 auto; 
    width: 50%;
    padding-top: 20px; 
    border-bottom: 1px solid black; 
}

.quick-links:before{
    content: ""; /* This is necessary for the pseudo element to work. */ 
    display: block; /* This will put the pseudo element on its own line. */
    margin: 0 auto; /* This will center the border. */
    width: 50%; /* Change this to whatever width you want. */
    padding-top: 20px; /* This creates some space between the element and the border. */
    border-top: 1px solid black; /* This creates the border. Replace black with whatever color you want. */
}


.quick-links a
{
line-height: 25px;
font-size: 18px;
padding: 5px;
text-decoration: none;
color: black;
}

.quick-links a:hover {
	background-color: #ddd;
	text-decoration: none;
}

.center
{
text-align: center;
padding-top: 10px;
}
</style>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h2 style="text-align: center; padding-top: 10px;">Dashboard</h2>
	<div class="quick-links" style="text-align: center;">
		<h4>Quick Links:</h4>
		<div>
			<a href="">New Book</a> <a href="">New User</a> <a href="">New
				Catagory</a> <a href="">New Customer</a>
		</div>
	</div>
	
	<div class="center">
	<h2>Recent Sales:</h2>
	</div>
	
	<div class="center">
	<h2>Recent Reviews:</h2>
	</div>
	
	<div class="center">
	<h2>Statistics:</h2>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>
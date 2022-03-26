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
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
.container
{
height: 500px;
display: flex;
justify-content: center;
padding-top: 70px;
}
</style>
</head>
<body>
	<div>
		<%@ include file="header.jsp"%>
	</div>
	<div class="container">
		<div class="col-sm-6">
			<h1>Login User</h1>
			<form action="">
				<div class="form-outline">
					<label class="form-label" for="form12">Email</label> <input
						type="text" id="email" class="form-control" />
				</div>

				<div class="form-outline">
					<label class="form-label" for="form12">Password</label> <input
						type="password" id="password" class="form-control" />
				</div>
				<br> <input type="button" class="btn btn-success" value="Login">
			</form>
		</div>

	</div>
	<div>
		<%@ include file="footer.jsp"%>
	</div>

</body>
</html>


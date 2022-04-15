<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
<style type="text/css">
</style>
<meta charset="ISO-8859-1">
<title>List Users</title>
<style type="text/css">
.form {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	padding: 20px;
}
</style>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="form">

		<h2 style="color: green;">
			<c:if test="${user!=null}">
		Edit User
		</c:if>

		<c:if test="${user==null}">
		Create New User
	</c:if>
		</h2>
		<div align="center" style="color: red;">
			<h5>${message}</h5>
		</div>
		<c:if test="${user==null}">
		<form action="create_user" class="col-md-4"
			onsubmit="return validate() ">
			</c:if>
			
			<c:if test="${user!=null}">
			<form action="update_user" class="col-md-4"
			onsubmit="return validate() ">
			<input type="hidden" name="id" value="${user.userid}">
			</c:if>

			<div class="form-group">
				<label for="full_name">Full Name:</label> <input type="text"
					class="form-control" name="full_name" id="full_name"
					value="${user.fullName}"> <span id="name_remark"></span>
			</div>
			<div class="form-group">
				<label for="email">Email address:</label> <input type="email"
					class="form-control" name="email" id="email" autocomplete="off"
					value="${user.email}""> <span id="name_email"></span>
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" name="pwd" id="pwd" autocomplete="off"
					value="${user.password}""> <span id="name_password"></span>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="reset" class="btn btn-danger"
				onclick="javasript.history.go(-1)">Cancel</button>
		</form>
	</div>

	<%@ include file="footer.jsp"%>
</body>
<script type="text/javascript">
	function validate() {
		name_email
		name_password

		var fullName = document.getElementById("full_name");
		var email = document.getElementById("email");
		var password = document.getElementById("pwd");
		if (fullName.value.length == 0) {
			//	alert("Name Field should not empty");
			var f = document.getElementById("name_remark");
			f.innerText = "Name Field should not empty"
			fullName.focus();
			return false;
		}
		if (email.value.length == 0) {
			//alert("Email should not empty");
			var f = document.getElementById("name_emailc");
			f.innerText = "Email Field should not empty"
			email.focus();
			return false;
		}

		if (password.value.length == 0) {
			//alert("Password should not empty");
			var f = document.getElementById("name_password");
			f.innerText = "Password Field should not empty"
			password.focus();
			return false;

		}
		return true;
	}
</script>
</html>
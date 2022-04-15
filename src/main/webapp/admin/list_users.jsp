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
.pagnation1 {
	display: flex;
	justify-content: center;
}
</style>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div style="text-align: center; padding-top: 10px;">
		<h2>Users Management</h2>
		<a href="users_form.jsp">Create New Users</a>

		<c:if test="${user==null}">
			 <div align="center" style="color: green;">
				<h5>${message}</h5>
			</div>
			
		</c:if>
		<c:if test="${user!=null}">
			<div align="center" style="color: red;">
				<h5>${message}</h5>
			</div>
		</c:if>


	</div>
	<div></div>
	<div style="">

		<table class="table "
			style="width: 70%; margin-left: auto; margin-right: auto;">
			<thead class="table-light">
				<tr>
					<th>Index</th>
					<th>ID</th>
					<th>Email</th>
					<th>UserName</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${list_user}" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td>${user.userid}</td>
						<td>${user.email}</td>
						<td>${user.fullName}</td>
						<td><a href="edit_user?id=${user.userid}">Edit</a></td>
						<td><a href="javascript:confirmDelete(${user.userid})">Delete</a></td>
					</tr>

				</c:forEach>

			</tbody>

		</table>

		<div class="pagnation1">

			<ul class="pagination">
				<c:if test="${currentpage >1}">
					<li class="page-item"><a class="page-link"
						href="list_users?page=${currentpage - 1}">Previous</a></li>
				</c:if>
				<c:forEach begin="1" end="${noOfPages}" var="i">
					<c:choose>
						<c:when test="${currentpage eq i}">
							<li class="page-item"><a class="page-link" href="#">${i}</a></li>
						</c:when>
						<c:otherwise>
							<li class="page-item"><a class="page-link"
								href="list_users?page=${i}">${i}</a></li>

						</c:otherwise>
					</c:choose>
				</c:forEach>

				<c:if test="${currentpage lt noOfPages}">
					<li class="page-item"><a class="page-link"
						href="list_users?page=${currentpage + 1}">Next</a></li>
				</c:if>
			</ul>
		</div>

		<div style="padding-left: 30px">
			<form action="list_users" class=" form-inline">
				<div class="form-group">
					<label for="sel1">No of Records :</label> &nbsp; <select
						class="form-control" id="sel1" name="record">
						<option value="3">3</option>
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="20">15</option>
					</select>
				</div>
				&nbsp; &nbsp;
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
	<script type="text/javascript">
	  function confirmDelete(userId)
	  {
		 if(confirm("Do you really want to delete"));
		 {
			 window.location="delete_user?id="+userId;
		 }
	  }
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container">


	<div class="alert alert-info text-center">
		<h1>Products</h1>
	</div>
	<jsp:include page="menu.jsp" />

	<table class="table table-hover">

		<thead>
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>Description</th>
				<th>Op1</th>
				<th>Op2</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach var="prod" items="${prods}">
				<tr>
					<td>${prod.id }</td>
					<td>${prod.name }</td>
					<td>${prod.price }</td>
					<td>${prod.description}</td>
					<td><button class="btn btn-primary">Update</button>
					<td><button class="btn btn-danger">Delete</button>
				</tr>

			</c:forEach>


		</tbody>


	</table>


</body>
</html>
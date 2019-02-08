<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>food Name</th>
			<th>Price</th>
			<th>Description</th>
		</tr>
		<core:forEach var="foodItems" items="${restaurant.foodItems}">
			<tr>
				<td>${foodItems.foodName}</td>
				<td>${foodItems.price}</td>
				<td>${foodItems.description}</td>
			</tr>
		</core:forEach>
	</table>
	
</body>
</html>
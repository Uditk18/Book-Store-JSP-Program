<%@page import="com.cg.pojo.bookPojo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div align=center>
		<h1>Books List</h1>
	</div>
	<div align="right"><a href="viewCart.app">
	<h3>Cart: ${sessionScope.count.size()}</h3></a></div>
	<table border="1" align="center">
		
		<tr >
			<th>Book Id&nbsp;</th>
			<th>Book Name&nbsp;</th>
			<th>Book Price&nbsp;</th>
			<th>Book Description&nbsp;</th>

		</tr>
		
		<jstl:forEach var="books" items="${requestScope.books}">
			<tr>
				<td>${books.id}</td>
				<td>${books.bookName}</td>
				<td>${books.price}</td>
				<td>${books.description}</td>
				
				<td><a href="addToCart.app?itemId=${books.id}">Add to cart</a></td>
			</tr>
		</jstl:forEach>
	
	</table>
	<div align="right"><h3>Total: ${sessionScope.sum}</h3></div>
	
</body>
</html>
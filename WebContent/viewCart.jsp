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
<h2 align=center>Welcome to your cart</h2>
<br/>
<h4 align=center>Items in your cart</h4>

<jstl:if test="${sessionScope.count.size() > 0}"> 

<h2 align="right"><a href="viewCart.app">Cart: ${sessionScope.count.size()}</a></h2>

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
				
				<td><a href="deleteFromCart.app?itemId=${books.id}">Delete</a></td>	
			</tr>
		</jstl:forEach>
		

	</table>
</jstl:if>
	
	<jstl:if test="${sessionScope.count.size() == 0 }">
			<h1>Cart Is Empty!!!</h1>
	</jstl:if>
		 
<div align="right"><h3>Total: ${sessionScope.sum}</h3></div>

</body>
</html>
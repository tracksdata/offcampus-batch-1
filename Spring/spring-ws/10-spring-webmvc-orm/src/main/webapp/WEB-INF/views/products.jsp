<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


   <table border="1">
   	<tr>
   		<th>SNO</th>
   		<th>Product ID</th>
   		<th>Product name</th>
   		<th>Price</th>
   		<th>Description</th>
   	</tr>
   	
   	 <c:forEach items="${prods}" var="prod" varStatus="rowNo">
    
    	<tr>
    		<td>${rowNo.count}</td>
    		<td>${prod.id}</td>
    		<td>${prod.name}</td>
    		<td>${prod.price}</td>
    		<td>${prod.description}</td>
    	</tr>
    	
    </c:forEach>
   
   </table>


   



</body>
</html>
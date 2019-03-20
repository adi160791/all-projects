<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1 style="background-color:Blue;">Product List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>product Id</th><th>product Name</th><th>product Description</th><th>image</th></tr>  
<c:forEach var="product" items="${productlist}">
<c:url value="resources/images/${product.productId}.jpg" var="imageUrl"/>
<tr>  
   <td>${product.productId}</td>  
   <td><a href="productDetails/${product.productId}">${product.productName}</a></td> 
   <td>${product.productDesc}</td>
   <td><a href="productDetails/${product.productId}"><img src="${pageContext.request.contextPath}/${product.productImage}" height="50" width="50"></a></td>
   <security:authorize access="hasRole('ROLE_ADMIN')"> 
   <td><a href="admin/editProduct/${product.productId}"><button type="button" onclick="">EDIT </button> </a></td> 
   <td><a href="admin/deleteProduct/${product.productId}"><button type="button" onclick="">DELETE </button> </a></td> 
   </security:authorize>
  <security:authorize access="hasRole('ROLE_USER')">
    <td><a href="cart/addtocart/${product.productId}?requestedQuantity=1">Add To Cart</a></td> 
    </security:authorize>
   </tr>
   
   </c:forEach>
   
   </table>
   


</body>
</html>
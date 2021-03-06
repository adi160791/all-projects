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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
<h1 style="color:DodgerBlue;">Edit Category</h1>  
<c:url value="/admin/saveOrUpdateProduct" var="url"></c:url>
       <form:form method="POST" action='${url }' modelAttribute="product" role="form" enctype="multipart/form-data">    
        <table >    
          <form:hidden  path="productId" />
          
         <tr>    
          <td>productName :</td>    
          <td><form:input path="productName" required="true"/></td>  
         </tr>  
         <tr>    
          <td>productDesc :</td>    
          <td><form:input path="productDesc" required="true"/></td>  
         </tr>  
         <tr>    
          <td>price :</td>    
          <td><form:input path="price" required="true" /></td>  
         </tr>  
          <tr>    
          <td>quantity :</td>    
          <td><form:input path="quantity" required="true" /></td>  
         </tr>
            <tr>
           <td><form:label path="image">Upload image</form:label></td>
		   <td><form:input type="file" path="image"></form:input></td>
		 </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="update" /></td>    
         </tr>    
        </table>    
       </form:form>   
</body>
</html>
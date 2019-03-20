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
<title>Add Users</title>
<h1 style="background-color:Green;">Register New User </h1>
<form:form method="POST" action="/ekart/addUsers">    
        <table >    
        <tr>  
        <td></td> 
         <tr>    
          <td><strong>USER-ID :</strong></td>   
          <td><form:input path="userId" required="true" /></td>  
         </tr>   
         <tr>    
          <td><strong>FIRST NAME :</strong></td>   
          <td><form:input path="firstName" required="true" /></td>  
         </tr>    
         <tr>    
          <tr>  
          <tr>  
        <td></td>    
         <tr>    
          <td><strong>LAST NAME :</strong></td>   
          <td><form:input path="lastName"  required= "true" /></td>  
         </tr>      
         <tr>  
        <td></td>    
         <tr>    
          <td><strong>CONTACT NUMBER :</strong></td>   
          <td><form:input path="contact" required="true" /></td>  
         </tr> 
          <tr>    
          <td><strong>PASSWORD :</strong> </td>   
          <td><form:input path="password" required="true"/></td>  
         </tr> 
         <tr>    
          <td><strong>ADDRESS :</strong> </td>   
          <td><form:input path="userAddress" required="true" /></td>  
         </tr>
         
          <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>  
        </table>    
       </form:form> 
          
</head>
<body>

</body>
</html>
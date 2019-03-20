<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
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

<h1 style="background-color:Green;">Register New Shipping Address </h1>
<form:form method="post" action="/ekart/cart/createorder">
<table > 

         
         <tr>    
          <td><strong>Apartment Number :</strong></td>   
          <td><form:input path="apartmentnumber" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]) (?=.*[/\])"  /></td>  
          
         </tr>    
         
         <tr>    
          <td><strong>Street Name :</strong></td>   
          <td><form:input path="streetname" required="true"  /></td>  
         </tr> 
      
         <tr>    
          <td><strong>City :</strong></td>   
          <td><form:input path="city" required="true" /></td>  
         </tr>    
         
         <tr>    
          <td><strong>State :</strong> </td>   
          <td><form:input path="state" required="true" /></td>  
         </tr>  
         
         
         <tr>    
          <td><strong>Country:</strong></td>   
          <td><form:input path="country" required="true" /></td>  
         </tr>  
                   
         <tr>    
         <td><strong>Pin Code :</strong></td>   
         <td><form:input path="zipcode" required="true"/></td>  
         </tr> 
               
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>
       
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>

    <title>Add Book</title>
  </head>
  <body>
  <div>
    <h2>Add New Book</h2>
    
  <form action = "addBook" method="post">
  
  Select Library : 
  <select name = "libraryName">
  <c:forEach var = "libNames" items="${libNames}">
  	<option>${libNames}</option>
  </c:forEach>
  </select>
  
  <div>
    <label>Book Name :</label>
    <input type="text" name = "bookName">
  </div>
    
  <div>
    <label>Book Author :</label>
    <input type="text" name = "Author">
  </div>  
  
   <div>
    <label>Publisher Name :</label>
    <input type="text" name = "publisher">
  </div>
  
  <div>
  	<button type = "submit">ADD Book</button>
  </div>
  </form>
    
 </div>   
  </body>
</html>
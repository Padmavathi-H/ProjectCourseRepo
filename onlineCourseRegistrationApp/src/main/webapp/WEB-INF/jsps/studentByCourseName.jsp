<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student By Course Name</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script type="text/javascript" src="/js/backbtn.js"></script>

</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div  style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">
</div>
<br><br>

<h1 align="center" style="color:purple;font-family: serif"><b>Students List For ${courseName.cName }</b></h1>
<br><br>

<table class="table table-striped" style="color:purple">
  <thead>
    <tr>
      <th scope="col">Student ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Gender</th>
      <th scope="col">Address</th>
       <th scope="col">Mobile Number</th>
       <th scope="col">DOB</th>
       <th scope="col">Password</th>

    </tr>
  </thead>
  <tbody>
    
    <c:forEach var="students" items="${studentdata }">
    
    <tr>
      <th scope="row"><c:out value="${students.studid }"></c:out></th>
      <td><c:out value="${students.studname }"></c:out> </td>
      <td><c:out value="${students.studemail }"></c:out> </td>
   	  <td><c:out value="${students.gender }"></c:out> </td>
   	  <td><c:out value="${students.studaddress }"></c:out> </td>
   	  <td><c:out value="${students.studmobile }"></c:out> </td>
   	  <td><c:out value="${students.studDOB }"></c:out> </td>
   	  <td><c:out value="${students.studpass }"></c:out> </td>
   	  
   	 
    </tr>
    
    </c:forEach>
    
    
  </tbody>
</table>


</body>
</html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Courses Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script type="text/javascript" src="/js/backbtn.js"></script>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">
</div>
<br><br>
<h1 align="center" style="color:purple;font-family: serif" ><b>Courses for ${regData.regName }</b></h1>

<br><br>
<table class="table table-striped" style="color:purple">
  <thead>
    <tr>
      <th scope="col">Course ID</th>
      <th scope="col">Course Name</th>
      <th scope="col">Course Duration</th>
      <th scope="col">Course Fees</th>
      <th scope="col">Course Capacity</th>
       <th scope="col">Seats available</th>

    </tr>
  </thead>
  <tbody>
    
    <c:forEach var="course" items="${viewCourse }">
    
    <tr>
      <th scope="row"><c:out value="${course.cId }"></c:out></th>
      <td><c:out value="${course.cName }"></c:out> </td>
      <td><c:out value="${course.cDuration }"></c:out> </td>
   	  <td><c:out value="${course.cFees }"></c:out> </td>
   	  <td><c:out value="${course.cCapacity }"></c:out> </td>
   	  <td><c:out value="${course.cSeats }"></c:out> </td>
   	  <td> <a class="btn btn-primary" href="/editCourse/${course.cId }"><b>EDIT</b></a></td>
   	 
    </tr>
    
    </c:forEach>
    
    
  </tbody>
</table>

</body>
</html>
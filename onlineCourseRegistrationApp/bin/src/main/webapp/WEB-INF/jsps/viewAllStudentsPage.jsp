<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Students Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">


<h1 align="center">Students List</h1>
<hr>
</div>

<table class="table">
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
    
    <c:forEach var="students" items="${viewStudents }">
    
    <tr>
      <th scope="row"><c:out value="${students.stud_id }"></c:out></th>
      <td><c:out value="${students.stud_name }"></c:out> </td>
      <td><c:out value="${students.stud_email }"></c:out> </td>
   	  <td><c:out value="${students.gender }"></c:out> </td>
   	  <td><c:out value="${students.stud_address }"></c:out> </td>
   	  <td><c:out value="${students.stud_mobile }"></c:out> </td>
   	  <td><c:out value="${students.stud_DOB }"></c:out> </td>
   	  <td><c:out value="${students.stud_pass }"></c:out> </td>
   	  
   	 
    </tr>
    
    </c:forEach>
    
    
  </tbody>
</table>

<script>
function goBack() {
  window.history.back();
}
</script>

</body>
</html>







<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Course Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="/main/css/style.css">
</head>
<body>

<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<div style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">

<h1 align="center">New Course</h1>
<hr>
</div>

<div style="align:left;margin-left: 10px;margin-top:15px">

<f:form action="/insertCourse" method="post" modelAttribute="insCourse" >

Course Name : <f:input path="cName"/> <f:errors path="cName"/> <br><br>

Course Duration :  <f:input path="cDuration"/> <f:errors path="cDuration"/><br><br>

Course Fees : <f:input path="cFees"/> <f:errors path="cFees"/><br><br>

Course Capacity : <f:input path="cCapacity"/> <f:errors path="cCapacity"/><br><br>

Seats available: <f:input path="cSeats"/> <f:errors path="cSeats"/><br><br>

<input type="submit" value="InsertCourse" onclick=" return alert('Course Inserted Successfully')" />

</f:form>

</div>

<script>
function goBack() {
  window.history.back();
}
</script>
</body>
</html>
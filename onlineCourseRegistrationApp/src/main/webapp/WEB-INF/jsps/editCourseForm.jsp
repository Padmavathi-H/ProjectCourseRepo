<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Course Update Screen</h1>

<hr>
<h3 style="color: red">${flag }</h3>
<f:form action="/editCoursedDetails" method="post" modelAttribute="Course">

Course Id:<f:input path="cId" readonly="true"/> <br><br>

Course Name : <f:input path="cName" readonly="true"/> <br><br>

Course Duration :  <f:input path="cDuration" readonly="true"/> <br><br>

Course Fees : <f:input path="cFees"/> <f:errors path="cFees"/><br><br>

Course Capacity : <f:input path="cCapacity"/> <f:errors path="cCapacity"/><br><br>

Seats available: <f:input path="cSeats" readonly="true"/> <br><br>

<input type="submit" value="Update">

</f:form>




</body>
</html>
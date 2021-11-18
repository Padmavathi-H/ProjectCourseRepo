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

Course Id:<f:input path="c_Id" readonly="true"/> <br><br>

Course Name : <f:input path="c_Name" readonly="true"/> <br><br>

Course Duration :  <f:input path="c_Duration" readonly="true"/> <br><br>

Course Fees : <f:input path="c_Fees"/> <f:errors path="c_Fees"/><br><br>

Course Capacity : <f:input path="c_Capacity"/> <f:errors path="c_Capacity"/><br><br>

Seats available: <f:input path="c_Seats" readonly="true"/> <br><br>

<input type="submit" value="Update">

</f:form>




</body>
</html>
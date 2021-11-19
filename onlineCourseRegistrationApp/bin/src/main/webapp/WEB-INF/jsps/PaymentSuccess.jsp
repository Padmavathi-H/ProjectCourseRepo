<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Successful Page</title>
<style>
body
{
background-color:pink;
}

</style>

</head>
<body>
<br><br>
<form action="/courseStudentLink/${studentId}/${courseId}">
<h2 align="center">Payment Successfull for the id ${courseId}!<h2>
<input type="submit" value="Back To Myportal">
</form>

</body>
</html>

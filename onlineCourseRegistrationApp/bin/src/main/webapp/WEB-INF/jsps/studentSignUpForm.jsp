<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Student SignUp</h1>
<hr>



<f:form action="SignUp" method="post" modelAttribute="studentData">

Name:<f:input path="studname"/><f:errors path="studname"/><br><br>

Email:<f:input path="studemail"/><f:errors path="studemail"/><br><br>

Gender:<f:radiobuttons path="gender" items="${genderList }"/><f:errors path="gender"/><br><br>

Address:<f:input path="studaddress"/><f:errors path="studaddress"/><br><br>

Mobile:<f:input path="studmobile"/><f:errors path="studmobile"/><br><br>

Date:<f:input path="studDOB" type="date"/><f:errors path="studDOB"/><br><br>

Password:<f:input path="studpass" type="password"/><f:errors path="studpass"/><br><br>

Confirm Password:<f:input path="studcpass" type="password"/><f:errors path="studcpass"/><br><br>

<input type="submit" value="SignUp">

</f:form>

</body>
</html>
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

Name:<f:input path="stud_name"/><f:errors path="stud_name"/><br><br>

Email:<f:input path="stud_email"/><f:errors path="stud_email"/><br><br>

Gender:<f:radiobuttons path="gender" items="${genderList }"/><f:errors path="gender"/><br><br>

Address:<f:input path="stud_address"/><f:errors path="stud_address"/><br><br>

Mobile:<f:input path="stud_mobile"/><f:errors path="stud_mobile"/><br><br>

Date:<f:input path="stud_DOB" type="date"/><f:errors path="stud_DOB"/><br><br>

Password:<f:input path="stud_pass" type="password"/><f:errors path="stud_pass"/><br><br>

Confirm Password:<f:input path="stud_cpass" type="password"/><f:errors path="stud_cpass"/><br><br>

<input type="submit" value="SignUp">

</f:form>

</body>
</html>
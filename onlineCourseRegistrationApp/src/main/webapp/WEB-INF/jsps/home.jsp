<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/Css/loginstyle.css">
</head>
<body class="box">

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Online Course Registration</h1>
<hr>

<h3 style="color: red">${flag }</h3>

<f:form action="option" method="post" modelAttribute="LoginData">

UserName:<f:input path="username"/><f:errors path="username" class="er"/><br><br>

Password:<f:input path="password"/><f:errors path="password" class="er"/><br><br>

LoginAs:
   <f:select path="loginoption" items="${LoginOptions}"/>
   <br><br>
   
   <input type="submit" value="Login">
 
</f:form>
<br><br>

New Student:<a href="StudentLogin">SignUP</a>
</body>
</html>
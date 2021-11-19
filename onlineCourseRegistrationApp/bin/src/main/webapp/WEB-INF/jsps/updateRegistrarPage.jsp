<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Registrar Page</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h2 align="center">Registrar Details</h2>
<hr>
<div align="center">
<br>
<f:form action="/updateRegistrar" method="post" modelAttribute="updateRegistrarData">
<div >
<br>
<table>
<tr>
<td>Registrar Id : </td>
<td> <f:input path="regId" readonly="true" />
</td>
</tr>
<tr>
<td>Registrar Name : </td>
<td> <f:input path="regName" /> <f:errors path="regName"/>
</td>
</tr>
<tr>
<td>E-mail : </td>
<td><f:input path="regEmail" readonly="true"/> <f:errors path="regEmail"/></td>
</tr>
<tr>
<td>Date of Birth : </td>
<td><f:input path="regDob" type ="date" /> <f:errors path="regDob"/></td>
</tr>
<tr>
<tr><td>Gender : </td>
<td><f:radiobuttons path="regGender" items="${genderList }"/><f:errors path="regGender"/><br><br></td>
<tr>
</tr>
<tr>
<td>Phone number : </td>
<td><f:input path="regMobile" /> <f:errors path="regMobile"/></td>
</tr>
<tr>
<td>Year of Experience: </td>
<td><f:input path="regYOExp" /> <f:errors path="regYOExp"/></td>
</tr>

<td>New Password : </td>
<td><f:input path="regPass" /> <f:errors path="regPass"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update" /></td>
</tr>
</table>
</div>
</f:form>
</div>
</body>
</html>
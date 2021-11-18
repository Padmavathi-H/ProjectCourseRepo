<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registrar Page</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<div style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">


<h1 align="center">Registrar Details</h1>
<hr>
</div>
<div align="center">
<br>
<f:form action="insertRegistrar" method="post" modelAttribute="regisData">
<div >
<br>
<table>
<tr>
<td>Registrar Name : </td>
<td> <f:input path="regName" /> <f:errors path="regName"/>
</td>
</tr>
<tr>
<td>Date of Birth : </td>
<td><f:input path="regDob" type ="date" /> <f:errors path="regDob"/></td>
</tr>
<tr>
<td>E-mail : </td>
<td><f:input path="regEmail" /> <f:errors path="regEmail"/></td>
</tr>
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
<tr><td>Gender : </td>
<td><f:radiobuttons path="regGender" items="${genderList }"/><f:errors path="regGender"/><br><br></td>
<tr>
<td>New Password : </td>
<td><f:input path="regPass" /> <f:errors path="regPass"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Insert" /></td>
</tr>
</table>
</div>
</f:form>
</div>
<script>
function goBack() {
  window.history.back();
}
</script>
</body>
</html>
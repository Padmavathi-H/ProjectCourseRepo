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
<td> <f:input path="Reg_Name" /> <f:errors path="Reg_Name"/>
</td>
</tr>
<tr>
<td>Date of Birth : </td>
<td><f:input path="Reg_Dob" type ="date" /> <f:errors path="Reg_Dob"/></td>
</tr>
<tr>
<td>E-mail : </td>
<td><f:input path="Reg_email" /> <f:errors path="Reg_email"/></td>
</tr>
<tr>
</tr>
<tr>
<td>Phone number : </td>
<td><f:input path="Reg_mobile" /> <f:errors path="Reg_mobile"/></td>
</tr>
<tr>
<td>Year of Experience: </td>
<td><f:input path="Reg_YOExp" /> <f:errors path="Reg_YOExp"/></td>
</tr>
<tr><td>Gender : </td>
<td><f:radiobuttons path="Reg_gender" items="${genderList }"/><f:errors path="Reg_gender"/><br><br></td>
<tr>
<td>New Password : </td>
<td><f:input path="Reg_pass" /> <f:errors path="Reg_pass"/></td>
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
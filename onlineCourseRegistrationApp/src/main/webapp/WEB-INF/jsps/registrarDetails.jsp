<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script type="text/javascript" src="/js/backbtn.js"></script>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div  style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">
</div>
<br><br>
<h1 align="center" style="color:purple;font-family: serif"><b>DISPLAYING REGISTRAR BY EMAIL<b></b></h1>
<br><br>
<table  class="table table-striped" style="color:purple">
<thead>
<tr>
<th scope="col">ID</th>
<th scope="col">NAME</th>
<th scope="col">E-MAIL</th>
<th scope="col">DOB</th>
<th scope="col">GENDER</th>
<th scope="col">MOBILE NO</th>
<th scope="col">YEARS OF EXPERIENCE</th>
<th scope="col">PASSWORD</th>
</tr>
</thead>
<tbody>
<tr>
<td>${reg.regId }</td>
<td>${reg.regName }</td>
<td>${reg.regEmail }</td>
<td>${reg.regDob }</td>
<td>${reg.regGender }</td>
<td>${reg.regMobile }</td>
<td>${reg.regYOExp }</td>
<td>${reg.regPass }</td>
</tr>
</body>
</tbody>
</table>

</body>
</html>
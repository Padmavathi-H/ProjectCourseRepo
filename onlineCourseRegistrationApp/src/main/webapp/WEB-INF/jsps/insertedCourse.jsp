<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<img style="width: 50px;height: 50px;float: left;margin-left: 20px; margin-top: 20px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png"><br><br>


<h1>Course Inserted Successfully!</h1>

</body>

<script>
function goBack() {
  window.history.back();
}
</script>
</html>
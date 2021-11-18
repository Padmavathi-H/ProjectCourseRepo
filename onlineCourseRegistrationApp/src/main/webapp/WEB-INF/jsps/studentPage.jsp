<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    <a class="nav-link disabled" href="#"> <h1> Student Portal </h1> </a>
    </div>
    <ul class="nav navbar-nav" style="float: right;">
      <li class="active"><a href="/">Logout</a></li>
     </ul>
  </div>
</nav>

<hr>

<div>

<a href="studentViewCourses"><button type="button" class="btn btn-info" style="margin-left: 20px;">Courses</button></a>
<a href="myCourses"><button type="button" class="btn btn-info" style="margin-left: 20px;">My Courses</button></a>
<a href="updateStuProfile"><button type="button" class="btn btn-info" style="margin-left: 20px;">Update Profile</button></a>

</div>

</body>
</html>

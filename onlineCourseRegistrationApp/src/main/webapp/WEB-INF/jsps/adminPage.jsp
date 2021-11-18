<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    <a class="nav-link disabled" href="#"> <h1> Admin Portal </h1> </a>
    </div>
    <ul class="nav navbar-nav" style="float: right;">
      <li class="active"><a href="/logout">Logout</a></li>
     </ul>
  </div>
</nav>

<hr>

<div>

<a href="addNewRegistrar"><button type="button" class="btn btn-info" style="margin-left: 20px;">Add New Registrar</button></a>
<a href="viewRegistrar"><button type="button" class="btn btn-info" style="margin-left: 20px;">View Registrars</button></a>
<a href="viewRegistrarByName"><button type="button" class="btn btn-info" style="margin-left: 20px;">View Registrar By Username</button></a>
<a href="viewCourse"><button type="button" class="btn btn-info" style="margin-left: 20px;">View Courses</button></a>
<a href="viewStudent"><button type="button" class="btn btn-info" style="margin-left: 20px;">View Students</button></a>
<a href="viewStudentByCourse"><button type="button" class="btn btn-info" style="margin-left: 20px;">View Students By Course</button></a>

</div>

</body>
</html>


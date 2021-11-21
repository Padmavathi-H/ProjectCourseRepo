<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script type="text/javascript" src="/js/backbtn.js"></script>
<style>
.btn{
margin-left:10px;
}
</style>
</head>
<body> 

<div class="alert alert-success" role="alert">
 <h1> Hello, ${registratData.regName }! Welcome to Registrar Portal.</h1>
</div>


<div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
       <li class="nav-item">
          <button type="button" class="btn btn-secondary"> <a class="nav-link active" aria-current="page" href="/addNewCoursePage/${registratData.regId}"><h5>Add New Course</h5></a></button>
        </li>
         <li class="nav-item">
          <button type="button" class="btn btn-secondary"> <a class="nav-link active" aria-current="page" href="/viewCoursePage/${registratData.regId}"><h5>View Courses</h5></a></button>
        </li>
         <li class="nav-item">
          <button type="button" class="btn btn-secondary">  <a class="nav-link active" aria-current="page" href="/updateRegProfile/${registratData.regId}"><h5>Update Profile</h5></a></button>
        </li>
      </ul>
      <nav class="navbar navbar-default">
  <div class="container-fluid">
    <ul class="nav navbar-nav" style="float: right;">
    <button type="button" class="btn btn-secondary"><a href="/" class="badge badge-success"><h5>LOG OUT</h5></a></button>
     </ul>
  </div>
</nav>
    </div>
  </div>
</nav>

</div>

<footer class="page-footer font-small purple pt-4 fixed-bottom">
   <div class="footer-copyright text-center py-3"><h3>Guide...Grow...Glow </h3>
    </div>
</footer>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script type="text/javascript" src="/js/backbtn.js"></script>
<style>
html,body,
header,#intro{
height: 100%;
width: 100%;
color: #2B3856;
margin-left: auto;
margin-top: auto;
}


#intro{
background: url("/images/.png");
-webkit-background-size:cover;
background-size:cover;
}
.btn{
margin-left:10px;
}
</style>
</head>
<body> 
<header>

<div id="intro" class="view hm-white-light">
<div class="alert alert-success" role="alert">
 <h1> Hello, ${adminData.username }! Welcome to Admin Portal.</h1>
</div>


<div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <div class="input-group">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <button type="button" class="btn btn-secondary"> <a class="nav-link active" aria-current="page" href="addNewRegistrar"><h5>Add New Registrar</h5></a></button>
          
        </li>
        <li class="nav-item">
         <button type="button" class="btn btn-secondary"> <a class="nav-link active" aria-current="page" href="viewRegistrar"><h5>View Registrar</h5></a></button>
          
        </li>
        <li class="nav-item">
         <button type="button" class="btn btn-secondary  "> <a class="nav-link active" aria-current="page" href="viewCourse"><h5>View Course</h5></a></button>
         
        </li>
        <li class="nav-item">
         <button type="button" class="btn btn-secondary "><a class="nav-link active" aria-current="page" href="viewStudent"><h5>View Students</h5></a> </button>
          
        </li>
        <li class="nav-item">
         <button type="button" class="btn btn-secondary  "> <a class="nav-link active" aria-current="page" href="getregistrarbyemail"><h5>Search Registrar by E-mail</h5></a></button>
         
        </li>
        
        <button type="button" class="btn btn-secondary "><a class="nav-link active" aria-current="page" href="viewStudentByCourse"><h5>View Students By Course</h5></a></button>
      </ul>
      </div>
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
</header>

<footer class="page-footer font-small purple pt-4 fixed-bottom">
   <div class="footer-copyright text-center py-3"><h3>Have a nice Day!</h3>
    </div>
</footer>
</body>
</html>




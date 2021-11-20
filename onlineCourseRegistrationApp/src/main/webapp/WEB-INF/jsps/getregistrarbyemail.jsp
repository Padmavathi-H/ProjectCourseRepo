<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Colorlib Templates">
<meta name="author" content="Colorlib">
<meta name="keywords" content="Colorlib Templates">

<!-- Title Page-->
<title>Insert Registrar</title>

<!-- Icons font CSS-->
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/datepicker/daterangepicker.css" rel="stylesheet"
	media="all">

<!-- Main CSS-->
<link href="/Css/main.css" rel="stylesheet" media="all">
<script type="text/javascript" src="/js/backbtn.js"></script>
</head>

<body>
	<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
	<div style="flex-direction: row">
		<img
			style="width: 50px; height: 50px; float: left; margin-left: 10px; margin-top: 10px"
			onclick="goBack()" alt="backbutton"
			src="<%=request.getContextPath()%>/images/backbutton.png">
		<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
			<div class="wrapper wrapper--w680">
				<div class="card card-4">
					<div class="card-body">
						<h2 class="title">SEARCH REGISTRAR BY E-MAIL</h2>
						<form action="registrardisplay" method="post">
							<div class="row row-space">
								<div class="col-2">
									<div class="input-group">
										<label class="label">E-Mail</label>
										<input type="email" name="email" class="input--style-4" />
									</div>
								</div>
							</div>
							<div class="p-t-15">
								<button class="btn btn--radius-2 btn--blue" type="submit">DISPLAY</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

		
</body>


</html>

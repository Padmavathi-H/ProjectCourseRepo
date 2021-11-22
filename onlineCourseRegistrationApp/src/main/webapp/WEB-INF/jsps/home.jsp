<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">


    <title>Login Form</title>


    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">


    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">


    <link href="/Css/main.css" rel="stylesheet" media="all">
    <script type="text/javascript" src="/js/backbtn.js"></script>
</head>

<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<div style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
    <div>
</div>
<br>
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 align="center" class="title"><b>LOGIN FORM</b></h2>
                    <h3 style="color: red">${flag }</h3>
                    <f:form action="login" method="post" modelAttribute="LoginData">
                     <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Login As</label>
                                   <f:select path="loginoption" items="${LoginOptions}" class="input--style-4"/><f:errors path="loginoption"/>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Username</label>
                                    <f:input path="username" class="input--style-4" /> <f:errors path="username"/>
                                </div>
                            </div>
                        </div>

                         <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Password</label>
                                  <f:input path="password" type ="password" class="input--style-4"/> <f:errors path="password"/>
                                </div>
                            </div>
                        </div>
                        
                        <div class="p-t-15">
                            <button class="btn btn--radius-2 btn--blue" type="submit">LOGIN</button>
                        </div>
                        <br>
                         <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">New Student? <a  href="StudentLogin">SIGN UP</a></label>
           
                                </div>
                            </div>
                        </div>           
                        </f:form>
                </div>
            </div>
        </div>
    </div></div>

   

</body>

</html>

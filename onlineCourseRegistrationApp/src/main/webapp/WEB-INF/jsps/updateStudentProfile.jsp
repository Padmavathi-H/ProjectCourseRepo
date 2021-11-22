<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Update Student Page</title>
<script type="text/javascript" src="/js/backbtn.js"></script>
    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="/Css/main.css" rel="stylesheet" media="all">
    <script type="text/javascript" src="/js/backbtn.js"></script>
</head>

<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>


<div style="flex-direction: row">
<img style="width: 50px;height: 50px;float: left;margin-left: 10px; margin-top: 10px" onclick="goBack()" alt="backbutton" src="<%=request.getContextPath()%>/images/backbutton.png">
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title" align="center">UPDATE STUDENT FORM</h2>
                    <f:form action="/updateStudent" method="post" modelAttribute="updateStudentData">
                    <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Student Id</label>
                                    <f:input path="studid" readonly="true" class="input--style-4" /> 
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Name</label>
                                    <f:input path="studname"    class="input--style-4" /> <f:errors path="studname"/>
                                </div>
                            </div>
                        </div>
                         <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">E-Mail</label>
                                    <f:input path="studemail" readonly="true"  class="input--style-4" /> <f:errors path="studemail"/>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Date of Birth</label>
                                    <f:input path="studDOB" type ="date" class="input--style-4" /> <f:errors path="studDOB"/>
                                </div>
                            </div>
                        </div>
                         <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Gender</label>
                                   <f:select path="gender" items="${genderList }" class="input--style-4"/><f:errors path="gender"/>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Phone number</label>
                                    <f:input path="studmobile" class="input--style-4"/> <f:errors path="studmobile"/>
                                </div>
                            </div>
                        </div>
                         <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address</label>
                                    <f:input path="studaddress" class="input--style-4"/> <f:errors path="studaddress"/>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Password</label>
                                    <f:input path="studpass" type="password" class="input--style-4"/> <f:errors path="studpass"/>
                                </div>
                            </div>
                        </div>
                         <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Confirm Password</label>
                                    <f:input path="studcpass" type="password" class="input--style-4"/> <f:errors path="studcpass"/>
                                </div>
                            </div>
                        </div>
                       
                        <div class="p-t-15">
                        
                            <button class="btn btn--radius-2 btn--blue" type="submit">UPDATE</button>
                        </div>
                    </f:form>
                </div>
            </div>
        </div>
    </div></div>
</body>

</html>
<!-- end document-->
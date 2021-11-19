<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>
<style>
body{
background-color: wheat
}

*{
box-sizing: border-box;
}

.container{

padding: 20px;
background-color: wheat;
width:100%
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
button[type=submit]
{
font-size: 40

}

hr{
border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
.paybtn{
 background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 20px 0;
  border: none;
  cursor: pointer;
  width: 25%;
  opacity: 0.9;
}


</style>
</head>
<body>
<hr>

<form action="/payment/${studentId}/${courseId}" method="post">
<h2 align="center">PAYMENT DETAILS</h2>
<hr>
<h1>Payment for courseId: ${courseId}</h1>
<div align="center" class="container">
<table>
<tr><td>Card Holder Name:</td></tr>
<tr><td><input type="text" name="name" placeholder="Name" required></td></tr>
<tr></tr>
<tr><td>Card Number:</td></tr>
<tr><td><input type="text" name="number" placeholder="1234 1234 1234 1234" required min="12" max="12"></td></tr>
<tr></tr>
<tr><td>Expiry Date:</td></tr>
<tr><td><input type="text" name="month" placeholder="MM"required maxlength="2"></td>
<td><input type="text" name="year" placeholder="YY"required maxlength="2"></td></tr>
<tr></tr>
<tr><td>CVV:</td></tr>
<tr><td><input type="password" name="cvv" placeholder="CVV"required maxlength="3"></td></tr>

</table>
<br>
<button type ="submit" class="paybtn" >PAY</button>

</div>
</form>

</body>
</html>





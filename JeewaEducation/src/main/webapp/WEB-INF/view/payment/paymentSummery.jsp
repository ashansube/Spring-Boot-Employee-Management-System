<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Summery</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../static/payment/summery/style.css">

</head>
<body>
<div class="background"><br><br>
	<div class="payment_summery">
		<h1>Payment Summery</h1>
		<h4>You have successfully submitted your payment.</h4>
		<div class="inner_box">
		<form method="POST" action="#">
			<h1>Payment Details</h1>
			<label>Amount (Rs.)         :</label>
			<input type="text" name="payment"  value="12000000"><br>
			<label>Bank                 :</label>
			<input type="text" name="bank"><br>
			<label>Branch               :</label>
			<input type="text" name="branch"><br>
			</form>
		</div>
	</div>
	</div>
</body>
</html>
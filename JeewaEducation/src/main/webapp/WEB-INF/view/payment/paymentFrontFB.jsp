<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jeewa Education</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
	<link rel="stylesheet" type="text/css" href="../static/payment/forms/css/opensans-font.css">
	<link rel="stylesheet" type="text/css" href="../static/payment/forms/css/roboto-font.css">
	<link rel="stylesheet" type="text/css" href="../static/payment/forms/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">
	<!-- datepicker -->
	<link rel="stylesheet" type="text/css" href="../static/payment/forms/css/jquery-ui.min.css">
	<!-- Main Style Css -->
    <link rel="stylesheet" type="text/css" href="../static/payment/forms/css/style.css">
	<!-- table and file uploader -->
	<link rel="stylesheet" type="text/css" href="../static/payment/forms/css/table.css"/>
</head>
<body>
	<div class="page-content" style="background-image: url('../static/payment/forms/images/background2.jpg')">
		<div class="wizard-v4-content">
			<div class="wizard-form">
				<div class="wizard-header">
					<h3 class="heading">Payment Form For Foundation Batch Students</h3>	
				</div>
		        <form class="form-paymentFB" action="#" method="post">
		        	<div id="form-total">
		        		<!-- SECTION 1 -->
			            <h2>
			            	<span class="step-icon"><i class="zmdi zmdi-account"></i></span>
			            	<span class="step-text">Student Information</span>
			            </h2>
			            <section>
			                <div class="inner">
			                	<h3>Student Information</h3>
								<div class="form-row">
									<div class="form-holder form-holder-1">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="name" name="name" required>
											<span class="label">Full Name of the Student</span>
					  						<span class="border"></span>
										</label>
									</div>
								</div>
								<div class="form-row">
									<div class="form-holder form-holder-1">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="rnumber" name="rnumber" required>
											<span class="label">Registration Number</span>
					  						<span class="border"></span>
										</label>
									</div>
								</div>
							</div>
			            </section>
						<!-- SECTION 2 -->
			            <h2>
			            	<span class="step-icon"><i class="zmdi zmdi-lock"></i></span>
			            	<span class="step-text">Fee Calculation</span>
			            </h2>
			            <section>
			                <div class="inner">
			                	<h3>Fee Calculation (Rs.)</h3>
								<table>
									<tr>
										<th>Company Fee</th>
										<th>Course Fee</th>
									</tr>
									<tr>
										<td>600000</td>
										<td>150000</td>
									</tr>
								</table><br><br>
								<label>Total : 210000</label>
							</div>
			            </section>
			            <!-- SECTION 3 -->
			            <h2>
			            	<span class="step-icon"><i class="zmdi zmdi-receipt"></i></span>
			            	<span class="step-text">Paymemnt Details</span>
			            </h2>
			            <section>
			                <div class="inner">
			                	<h3>Payment Details </h3>
								<div class="form-row">
									<div class="form-holder form-holder-1">
										<label class="form-row-inner">
											<input type="text" name="dAmount" id="dAmount" class="form-control" required>
											<span class="label">Deposited Amount (Rs.)</span>
											<span class="border"></span>
										</label>
									</div>
									
								</div>
								<div class="form-row">
									<div class="form-holder form-holder-1">
										<select name="bank" id="bank">
											<option value="bank" disabled selected>Bank</option>
											<option value="boc">BOC</option>
											<option value="peoples">Peoples' Bank</option>
											<option value="nsb">NSB</option>
											<option value="cb">Commercial Bank</option>
											
										</select>
									</div>
								</div>
								<div class="form-row">
									<div class="form-holder form-holder-1">
										<label class="form-row-inner">
											<input type="text" name="branch" id="branch" class="form-control" required>
											<span class="label">Branch</span>
											<span class="border"></span>
										</label>
									</div>
								</div>
								<div class="form-row">
									<div class="form-holder form-holder-1">
									<label class="form-row-inner">
										<span class="dateform">Cash Deposited Date :</span>
										<input type="date" id="depDate" name="depDate">
										</label>
									</div>
								</div>
								
							</div>
			            </section>
			            <!-- SECTION 4 -->
						
			            <h2>
			            	<span class="step-icon"><i class="zmdi zmdi-money"></i></span>
			            	<span class="step-text">Payment Slip</span>
			            </h2>
						<section>
							<div class="inner">
			                	<h3>Payment Slip</h3>
							</div><br>
							<div class="form-row">
								<div class="form-holder">
									<label class="form-row-inner">
										<span class="label">Upload The Payment Slip (Only JPG, jPEG and PNG files are allowed) </span><br>
										<span class="input-group-btn">
											<span class="btn btn-default btn-file">
												<input type="file" id="imgInp1">
											</span>
										</span><br>
										<img id='img-upload1' width="70%" height="140px" margin-top="20px"/>
									</label>
								</div>
							</div><br><br>
							<div class="inner">
								<label>By submitting this payment application, I here by confirm that I agree to the rules and regulation by-laws of the Jeewa Highter Education.</label><br>
							</div>
						</section>
		        	</div>			
		        </form>
			</div>
		</div>
	</div>
	<script src="../static/payment/forms/js/jquery-3.3.1.min.js"></script>
	<script src="../static/payment/forms/js/jquery.steps.js"></script>
	<script src="../static/payment/forms/js/jquery-ui.min.js"></script>
	<script src="../static/payment/forms/js/main.js"></script>
	<script src="../static/payment/forms/js/script.js"></script>
</body>
</html>
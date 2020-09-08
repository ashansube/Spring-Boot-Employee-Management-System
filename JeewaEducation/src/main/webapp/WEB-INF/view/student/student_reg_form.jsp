<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Wizard-v4</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
	<link rel="stylesheet" type="text/css" href="../static/student_reg_form/css/opensans-font.css">
	<link rel="stylesheet" type="text/css" href="../static/student_reg_form/css/roboto-font.css">
	<link rel="stylesheet" type="text/css"
		href="../static/student_reg_form/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">
	<!-- datepicker -->
	<link rel="stylesheet" type="text/css" href="../static/student_reg_form/css/jquery-ui.min.css">
	<!-- Main Style Css -->
	<link rel="stylesheet" href="../static/student_reg_form/css/style.css" />
</head>

<body>
	<div class="page-content" style="background-image: url('../static/student_reg_form/images/uni.jpg')">
		<div class="wizard-v4-content">
			<div class="wizard-form">
				<div class="wizard-header">
					<h3 class="heading">Student Registration Form</h3>
					<p>Fill all form field to go next step</p>
				</div>
				<form class="form-register" action="submitdetails" method="post">
					<div id="form-total">
						<!-- SECTION 1 -->
						<h2>
							<span class="step-icon"><i class="zmdi zmdi-account"></i></span>
							<span class="step-text">Personal Details</span>
						</h2>
						<section>
							<div class="inner">
								<h3>Personal Details:</h3>
								<div class="form-row">
									<div class="form-holder form-holder-1">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name" name="namewithinitials"
												required>
											<span class="label">Name With Initials</span>
											<span class="border"></span>
										</label>
									</div>
								</div>
								<div>
									<div class="form-row">
										<div class="form-holder form-holder-1">
											<label class="form-row-inner">
												<input type="text" class="form-control" id="last-name" name="last-name"
													required>
												<span class="label">Full Name</span>
												<span class="border"></span>
											</label>
										</div>
									</div>
								</div>
								<div class="form-row">
									<div class="form-holder form-holder-1">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="address" name="address"
												required>
											<span class="label">Home Address</span>
											<span class="border"></span>
										</label>
									</div>
								</div>

								<div class="form-row">
									<div class="form-holder form-holder-2">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="code" name="nic" required>
											<span class="label">NIC</span>
											<span class="border"></span>
										</label>
									</div>
								</div>

								<div class="form-row">
									<div class="form-holder form-holder-2">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="phone" name="degreeprogram" required>
											<span class="label">Degree Program</span>
											<span class="border"></span>
										</label>
									</div>
								</div>

								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name" name="first-name"
												required>
											<span class="label">Tel Home</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="last-name" name="last-name"
												required>
											<span class="label">Tel Mobile</span>
											<span class="border"></span>
										</label>
									</div>
								</div>

							</div>
						</section>
						<!-- SECTION 2 -->
						<h2>
							<span class="step-icon"><i class="zmdi zmdi-lock"></i></span>
							<span class="step-text">Parent Details</span>
						</h2>
						<section>
							<div class="inner">
								<!----
								<div class="form-row">
									<div id="radio">
										<input type="radio" name="gender" value="male" checked class="radio-1"> I
										already have an account.
										<input type="radio" name="gender" value="female"> I'm newbie
									</div>
								</div> -->

								<div class="form-row">
									<div class="form-holder form-holder-2">
										<label class="form-row-inner">
											<input type="text" name="your_email_1" id="your_email_1"
												class="form-control" required>
											<span class="label">Father Name</span>
											<span class="border"></span>
										</label>
									</div>
								</div>
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="password_1" id="password_1"
												class="form-control" required>
											<span class="label">Father NIC</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>
								</div>
								<br>
								<br>
								<br>

								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="password_1" id="password_1"
												class="form-control" required>
											<span class="label">Mother Name</span>
											<span class="border"></span>
										</label>
									</div>

								</div>



								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="password_1" id="password_1"
												class="form-control" required>
											<span class="label">Mother NIC</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>
								</div>
							</div>
						</section>
						
						
						

					</div>
					
					
					<div class="form-row">
						<div class="form-actions flootRight">
							<input type="submit" value="submit" class="btn btn-primary btn-sm">
						</div>
					
					</div>
					
					
				</form>
			</div>
		</div>
	</div>
	<script src="../static/student_reg_form/js/jquery-3.3.1.min.js"></script>
	<script src="../static/student_reg_form/js/jquery.steps.js"></script>
	<script src="../static/student_reg_form/js/jquery-ui.min.js"></script>
	<script src="../static/student_reg_form/js/main.js"></script>
</body>

</html>
</html>
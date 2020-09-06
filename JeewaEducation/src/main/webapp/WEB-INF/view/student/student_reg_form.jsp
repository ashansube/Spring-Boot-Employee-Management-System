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
				<form class="form-register" action="#" method="post">
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
											<input type="text" class="form-control" id="first-name" name="first-name"
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
											<input type="text" class="form-control" id="code" name="code" required>
											<span class="label">NIC</span>
											<span class="border"></span>
										</label>
									</div>
								</div>

								<div class="form-row">
									<div class="form-holder form-holder-2">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="phone" name="phone" required>
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
						<!-- SECTION 3 -->
						<h2>
							<span class="step-icon"><i class="zmdi zmdi-receipt"></i></span>
							<span class="step-text">Education Qualification</span>
						</h2>
						<section>
							<div class="inner">
								<h3>O/L Results & Subjects</h3>

								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">O/L Year</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="last-name-1" name="last-name-1"
												required>
											<span class="label">O/L Index No</span>
											<span class="border"></span>
										</label>
									</div>
								</div>







								<div class="form-row">

									<!--subject1-->
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 1</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 1</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject2-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 2</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 2</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject3-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 3</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 3</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject4-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 4</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 4</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject5-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 5</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 5</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject6-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 6</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 6</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject7-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 7</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 7</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject8-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 8</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 8</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<!--subject9-->
								<div class="form-row">
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="text" class="form-control" id="first-name-1"
												name="first-name-1" required>
											<span class="label">Enter Subject 9</span>
											<span class="border"></span>
										</label>
									</div>
									<div class="form-holder form-holder-2">
										<select name="Grade" id="position">
											<option value="Grade" disabled selected>Select Grade For Subject 1</option>
											<option value="Manager">A</option>
											<option value="Employee">B</option>
											<option value="Director">C</option>
											<option value="Employee">S</option>
											<option value="Director">F</option>
										</select>
									</div>
									<!--empty space
									<div class="form-holder">
										<label class="form-row-inner">
											<input type="password" name="comfirm_password_1" id="comfirm_password_1"
												class="form-control" required>
											<span class="label">Father Occupation</span>
											<span class="border"></span>
										</label>
									</div>-->
								</div>
								<br><br><br>




								<div class="inner">
									<h3>A/L Results & Subjects</h3>

									<div class="form-row">
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="text" class="form-control" id="first-name-1"
													name="first-name-1" required>
												<span class="label">A/L Year</span>
												<span class="border"></span>
											</label>
										</div>
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="text" class="form-control" id="last-name-1"
													name="last-name-1" required>
												<span class="label">A/L Index No</span>
												<span class="border"></span>
											</label>
										</div>
									</div>



									<div class="form-row">

										<!--subject1-->
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="text" class="form-control" id="first-name-1"
													name="first-name-1" required>
												<span class="label">Enter Subject 1</span>
												<span class="border"></span>
											</label>
										</div>
										<div class="form-holder form-holder-2">
											<select name="Grade" id="position">
												<option value="Grade" disabled selected>Select Grade For Subject 1
												</option>
												<option value="Manager">A</option>
												<option value="Employee">B</option>
												<option value="Director">C</option>
												<option value="Employee">S</option>
												<option value="Director">F</option>
											</select>
										</div>
										<!--empty space
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="password" name="comfirm_password_1" id="comfirm_password_1"
													class="form-control" required>
												<span class="label">Father Occupation</span>
												<span class="border"></span>
											</label>
										</div>-->
									</div>
									<!--subject2-->
									<div class="form-row">
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="text" class="form-control" id="first-name-1"
													name="first-name-1" required>
												<span class="label">Enter Subject 2</span>
												<span class="border"></span>
											</label>
										</div>
										<div class="form-holder form-holder-2">
											<select name="Grade" id="position">
												<option value="Grade" disabled selected>Select Grade For Subject 2
												</option>
												<option value="Manager">A</option>
												<option value="Employee">B</option>
												<option value="Director">C</option>
												<option value="Employee">S</option>
												<option value="Director">F</option>
											</select>
										</div>
										<!--empty space
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="password" name="comfirm_password_1" id="comfirm_password_1"
													class="form-control" required>
												<span class="label">Father Occupation</span>
												<span class="border"></span>
											</label>
										</div>-->
									</div>
									<!--subject3-->
									<div class="form-row">
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="text" class="form-control" id="first-name-1"
													name="first-name-1" required>
												<span class="label">Enter Subject 3</span>
												<span class="border"></span>
											</label>
										</div>
										<div class="form-holder form-holder-2">
											<select name="Grade" id="position">
												<option value="Grade" disabled selected>Select Grade For Subject 3
												</option>
												<option value="Manager">A</option>
												<option value="Employee">B</option>
												<option value="Director">C</option>
												<option value="Employee">S</option>
												<option value="Director">F</option>
											</select>
										</div>
										<!--empty space
										<div class="form-holder">
											<label class="form-row-inner">
												<input type="password" name="comfirm_password_1" id="comfirm_password_1"
													class="form-control" required>
												<span class="label">Father Occupation</span>
												<span class="border"></span>
											</label>
										</div>-->
									</div>











						</section>

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
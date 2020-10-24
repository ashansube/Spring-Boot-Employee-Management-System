<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
	<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
	<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	    
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Employee Admin - Admin Profile</title>

  <!-- Custom fonts for this template -->
  <link href="../static/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../static/admin/css/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="../static/admin/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Employee Admin</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item">
        <a class="nav-link" href="/admin/employee-dashboard">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        Employees
      </div>


      <!-- Nav Item -Employees List -->
      <li class="nav-item">
        <a class="nav-link" href="/admin/employee-datatable">
          <i class="fas fa-list"></i>
          <span>Employee List</span></a>
      </li>

      <!-- Nav Item -Add Employees -->
      <li class="nav-item">
        <a class="nav-link" href="/admin/employee-addEmp">
          <i class="fas fa fa-plus"></i>
          <span>Add Employee</span></a>
      </li>


      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

                  <!-- Heading -->
                  <div class="sidebar-heading">
                    Departments
                  </div>
            
            
                  <!-- Nav Item -Department List -->
                  <li class="nav-item">
                    <a class="nav-link" href="/admin/employee-department-table">
                      <i class="fas fa-list"></i>
                      <span>Departments List</span></a>
                  </li>
            
                  <!-- Nav Item -Add Department -->
                  <li class="nav-item">
                    <a class="nav-link" href="/admin/employee-department-add">
                      <i class="fas fa fa-plus"></i>
                      <span>Add Department</span></a>
                  </li>
            
            
                  <!-- Divider -->
                  <hr class="sidebar-divider d-none d-md-block">

                  <!-- Heading -->
                  <div class="sidebar-heading">
                    Branches
                  </div>
            
            
                  <!-- Nav Item -Branches List -->
                  <li class="nav-item">
                    <a class="nav-link" href="/admin/employee-branch-table">
                      <i class="fas fa-list"></i>
                      <span>Branches List</span></a>
                  </li>
            
                  <!-- Nav Item -Add Branch -->
                  <li class="nav-item">
                    <a class="nav-link" href="/admin/employee-branch-add">
                      <i class="fas fa fa-plus"></i>
                      <span>Add Branch</span></a>
                  </li>
            
            
                  <!-- Divider -->
                  <hr class="sidebar-divider d-none d-md-block">




      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <form class="form-inline">
            <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
              <i class="fa fa-bars"></i>
            </button>
          </form>

          <!-- Topbar Search -->
          <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
          </form>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            <li class="nav-item dropdown no-arrow d-sm-none">
              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                <form class="form-inline mr-auto w-100 navbar-search">
                  <div class="input-group">
                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                      <button class="btn btn-primary" type="button">
                        <i class="fas fa-search fa-sm"></i>
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </li>

            <!-- Nav Item - Alerts -->
            <li class="nav-item dropdown no-arrow mx-1">
              <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class='fas fa-download fa-fw'></i>
              </a>
              
              <!-- Dropdown - Alerts -->
              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="alertsDropdown">
                <h6 class="dropdown-header">
                  Get Reports
                </h6>
                <a class="dropdown-item d-flex align-items-center" href="/admin/employee-datatable/export/pdf">
                  <div class="mr-3">
                    <div class="icon-circle bg-primary">
                      <i class="fas fa-file-alt text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">PDF Format</div>
                    <span class="font-weight-bold">A new month Employee report(PDF) is ready to download!</span>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="/admin/employee-datatable/export/html">
                  <div class="mr-3">
                    <div class="icon-circle bg-success">
                      <i class='fas fa-file-code text-white' style='font-size:14px' ></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">HTML Format</div>
                    A new month Employee report(HTML) is ready to download!
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-warning">
                      <i class="fas fa-exclamation-triangle text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">December 2, 2019</div>
                    Spending Alert: We've noticed unusually high spending for your account.
                  </div>
                </a>
                <a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
              </div>
            </li>

            <!-- Nav Item - Messages -->
            <li class="nav-item dropdown no-arrow mx-1">
              <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-envelope fa-fw"></i>
                <!-- Counter - Messages -->
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="messagesDropdown">
                <h6 class="dropdown-header">
                  Message Center
                </h6>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/fn_BT9fwg_E/60x60" alt="">
                    <div class="status-indicator bg-success"></div>
                  </div>
                  <div class="font-weight-bold">
                    <div class="text-truncate">Hi there! I am wondering if you can help me with a problem I've been having.</div>
                    <div class="small text-gray-500">Emily Fowler � 58m</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/AU4VPcFN4LE/60x60" alt="">
                    <div class="status-indicator"></div>
                  </div>
                  <div>
                    <div class="text-truncate">I have the photos that you ordered last month, how would you like them sent to you?</div>
                    <div class="small text-gray-500">Jae Chun � 1d</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/CS2uCrpNzJY/60x60" alt="">
                    <div class="status-indicator bg-warning"></div>
                  </div>
                  <div>
                    <div class="text-truncate">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>
                    <div class="small text-gray-500">Morgan Alvarez � 2d</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="">
                    <div class="status-indicator bg-success"></div>
                  </div>
                  <div>
                    <div class="text-truncate">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>
                    <div class="small text-gray-500">Chicken the Dog � 2w</div>
                  </div>
                </a>
                <a class="dropdown-item text-center small text-gray-500" href="#">Read More Messages</a>
              </div>
            </li>

            <div class="topbar-divider d-none d-sm-block"></div>

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">
                    <security:authorize access="isAuthenticated()">
					    <security:authentication property="name" />
					</security:authorize>                
                </span>
                <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  Profile
                </a>
                <form action="logout" method="post">
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="/logout">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
                </form>                
              </div>
            </li>

          </ul>

        </nav>
        <!-- End of Topbar -->

                    <!-- Main page content-->
                    <div class="container mt-4">
                  <!-- Page Heading -->
                        <h1 class="h3 mb-2 text-gray-800">Update Profile</h1>

                        <hr class="mt-0 mb-4" />

                        <div class="profile-form-div">
                            <div class="profile-form-head-tag">
                                <!-- Account details card-->
                                <div class="card mb-4">
                                    <div class="card-header">Account Details</div>
                                    <div class="card-body">
                                        <form class="was-validated">
                                            <!-- Form Group (username)-->
                                            <div class="form-row">
                                            <div class="form-group col-md-12">
                                                <label class="small mb-1" for="inputUsername">Username</label>
                                                <input class="form-control" id="employee_admin_username" type="text" placeholder="Enter your username" readonly="readonly" required/>
                                                <div class="invalid-tooltip">
                                                  Please enter your Username.
                                                </div>
                                                <div class="valid-tooltip">
                                                  Looks good!
                                                </div>
                                              </div>
                                            </div>
                                            <!-- Form Row-->
                                            <div class="form-row">
                                                <!-- Form Group (first name)-->
                                                <div class="form-group col-md-6 mt-3">
                                                    <label class="small mb-1" for="inputFirstName">First name</label>
                                                    <input class="form-control" id="employee_admin_first_name" type="text" placeholder="Enter your first name" readonly="readonly" required/>
                                                    <div class="invalid-tooltip">
                                                      Please enter your First-name.
                                                    </div>
                                                    <div class="valid-tooltip">
                                                      Looks good!
                                                    </div>
                                                  </div>
                                                <!-- Form Group (last name)-->
                                                <div class="form-group col-md-6 mt-3">
                                                    <label class="small mb-1" for="inputLastName">Last name</label>
                                                    <input class="form-control" id="employee_admin_last_name" type="text" placeholder="Enter your last name" readonly="readonly" required/>
                                                    <div class="invalid-tooltip">
                                                      Please enter your Last-name.
                                                    </div>
                                                    <div class="valid-tooltip">
                                                      Looks good!
                                                    </div>  
                                                  </div>
                                            </div>
                                            <!-- Form Row        -->
                                            <div class="form-row">
                                                <!-- Form Group (organization name)-->
                                                <div class="form-group col-md-6 mt-3">
                                                    <label class="small mb-1" for="inputOrgName">Email</label>
                                                    <div class="input-group">
                                                      <div class="input-group-prepend">
                                                        <span class="input-group-text" id="inlineFormCustomSelect">@</span>
                                                      </div>
                                                      <input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" class="form-control" id="employee_admin_email" placeholder="Email" aria-describedby="validationTooltipUsernamePrepend" readonly="readonly" required>
                                                      <div class="invalid-tooltip">
                                                        Please Select Valid email.
                                                      </div>
                                                      <div class="valid-tooltip">
                                                        Looks good!
                                                      </div>
                                                    </div>
                                                  </div>
                                                <!-- Form Group (location)-->
                                                <div class="form-group col-md-6 mt-3">
                                                    <label class="small mb-1" for="inputLocation">Gender</label>
                                                    <select class="custom-select" id="employee_admin_gender" disabled="disabled" required>
                                                      <option value="">Choose...</option>
                                                      <option value ="1">Male</option>
                                                      <option value="2">Female</option>
                                                      <option value="3">Other</option>
                                                    </select>
                                                      <div class="invalid-tooltip">
                                                        Please Select Gender.
                                                      </div>
                                                      <div class="valid-tooltip">
                                                        Looks good!
                                                      </div>
                                                  </div>
                                            </div>

                                            <!-- Form Row-->
                                            <div class="form-row">
                                                <!-- Form Group (phone number)-->
                                                <div class="form-group col-md-6 mt-3 mb-4">
                                                    <label class="small mb-1" for="inputPhone">Phone number</label>
                                                    <input class="form-control" id="employee_admin_phoneNo" type="tel" placeholder="Enter your phone number" readonly="readonly" required/>
                                                    <div class="invalid-tooltip">
                                                      Please enter your Mobile Number.
                                                    </div>
                                                    <div class="valid-tooltip">
                                                      Looks good!
                                                    </div>
                                                  </div>
                                                <!-- Form Group (birthday)-->
                                                <div class="form-group col-md-6 mt-3 mb-4">
                                                    <label class="small mb-1" for="inputBirthday">Birthday</label>
                                                    <input class="form-control" id="employee_admin_birthday" type="date" name="birthday" placeholder="Enter your birthday" readonly="readonly" required/>
                                                    <div class="invalid-tooltip">
                                                      Please enter your Birthday.
                                                    </div>
                                                    <div class="valid-tooltip">
                                                      Looks good!
                                                    </div>
                                                  </div>
                                            </div>


                                            <div class="form-row">
                                              <!-- Form Group (phone number)-->
                                              <div class="form-group col-md-6 mt-3 mb-4">
                                                  <label class="small mb-1" for="inputPhone">NIC</label>
                                                  <input class="form-control" id="employee_admin_nic" type="text" placeholder="Enter your nic no" readonly="readonly" required/>
                                                  <div class="invalid-tooltip">
                                                    Please enter your NIC.
                                                  </div>
                                                  <div class="valid-tooltip">
                                                    Looks good!
                                                  </div>
                                                </div>

                                                <div class="form-group col-md-6 mt-3 mb-4">
                                                  <label class="small mb-1" for="inputPhone">Address</label>
                                                  <input class="form-control" id="employee_admin_address" type="text" placeholder="Enter your address" readonly="readonly" required/>
                                                  <div class="invalid-tooltip">
                                                    Please enter your Address.
                                                  </div>
                                                  <div class="valid-tooltip">
                                                    Looks good!
                                                  </div>
                                                </div>

                                  
                                              </div>
                                              <div>
                                                <div class="form-row">
                                                  <div class="col-md-6 mb-3 mt-4">
                                                    <label class="small mb-1">Current Password</label>
                                                    <input type="password" class="form-control" id="employee_admin_current_password" placeholder="Current Password" readonly="readonly" required>
                                                    <div class="invalid-tooltip">
                                                      Please Enter Current Password.
                                                    </div>
                                                    <div class="valid-tooltip">
                                                      Looks good!
                                                    </div>
                                                  </div>
                                  
                                                  <div class="col-md-3 mb-3 mt-4">
                                                    <label class="small mb-1">New Password</label>
                                                    <input type="password" class="form-control" id="employee_admin_new_password" placeholder="New Password" readonly="readonly" required>
                                                    <div class="invalid-tooltip">
                                                      Please Enter New Passsword.
                                                    </div>
                                                    <div class="valid-tooltip">
                                                      Looks good!
                                                    </div>
                                                  </div>
                                  
                                                  <div class="col-md-3 mb-3 mt-4">
                                                    <label class="small mb-1">Confirm New Password</label>
                                                    <input type="password" class="form-control" id="employee_admin_confirm_new_password" placeholder="Confirm New Password" readonly="readonly"  required>
                                                    <div class="invalid-tooltip">
                                                      Please Confirm New Password.
                                                    </div>
                                                    <div class="valid-tooltip">
                                                      Looks good!
                                                    </div>
                                                  </div>
                                                  </div>





                                              </div>
                                          
                                            <!-- Save changes button-->

                                            <button class="btn btn-primary mt-4" type="submit" id="normal_employee_view_btn_text" onclick="editEmployeeAdminProfile()">Update</button>
                                            <button class="btn btn-secondary mt-4" type="submit" id="normal_employee_cancel_edit" hidden>Cancel</button>

                                          
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
                
                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Your Website 2020</span>
                    </div>
                    </div>
                </footer>
                <!-- End of Footer -->
                
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js" crossorigin="anonymous"></script>

        <script src="../static/admin/js/employees_view.js"></script>

        <script src="../static/admin/js/admin_profile_image_btn.js"></script>
    </body>
</html>
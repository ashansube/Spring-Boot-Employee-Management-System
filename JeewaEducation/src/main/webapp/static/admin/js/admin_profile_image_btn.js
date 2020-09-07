function uploadEmployeeProfileImage() {
      document.getElementById("employeeProfileImageUpload").click();
}

function updateProfileDetailsEmployee() {

      document.getElementById('normal_emp_profile_fname').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_lname').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_email').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_gender').removeAttribute('disabled');
      document.getElementById('normal_emp_profile_address').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_nic').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_mobileNo').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_birthDate').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_current_password').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_new_password').removeAttribute('readonly');
      document.getElementById('normal_emp_profile_confirm_new_password').removeAttribute('readonly');

      document.getElementById('employee_updateProfileData_btn_text').innerText = "Save";
  
      document.getElementById('employee_profile_cancel_edit').removeAttribute('hidden');
}

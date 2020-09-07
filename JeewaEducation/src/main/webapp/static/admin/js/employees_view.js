
function editEmployee() {
    document.getElementById('normal_emp_fname').removeAttribute('readonly');
    document.getElementById('normal_emp_lname').removeAttribute('readonly');
    document.getElementById('normal_emp_email').removeAttribute('readonly');
    document.getElementById('normal_emp_mobileNo').removeAttribute('readonly');
    document.getElementById('normal_emp_address').removeAttribute('readonly');
    document.getElementById('normal_emp_nic').removeAttribute('readonly');
    document.getElementById('normal_emp_gender').removeAttribute('disabled');
    document.getElementById('normal_emp_birthDate').removeAttribute('readonly');
    document.getElementById('normal_emp_designation').removeAttribute('disabled');
    document.getElementById('normal_emp_joinedDate').removeAttribute('readonly');
    document.getElementById('normal_emp_branch').removeAttribute('disabled');
    document.getElementById('normal_emp_department').removeAttribute('disabled');
    document.getElementById('normal_emp_current_password').removeAttribute('readonly');
    document.getElementById('normal_emp_new_password').removeAttribute('readonly');
    document.getElementById('normal_emp_confirm_new_password').removeAttribute('readonly');
 
    document.getElementById('employee_view_btn_text').innerText = "Save";

    document.getElementById('employee_update_text').innerText = "Update Employee";

    document.getElementById('employee_cancel_edit').removeAttribute('hidden');

}

function editBranch() {
    document.getElementById('employee_branch_name').removeAttribute('readonly');
    document.getElementById('employee_branch_phoneNo').removeAttribute('readonly');
    document.getElementById('employee_branch_email').removeAttribute('readonly');
    document.getElementById('employee_branch_location').removeAttribute('disabled');
    document.getElementById('employee_branch_address').removeAttribute('readonly');
    document.getElementById('employee_branch_postCode').removeAttribute('readonly');
    document.getElementById('employee_branch_faxNo').removeAttribute('readonly');

 
    document.getElementById('branch_view_btn_text').innerText = "Save";

    document.getElementById('branch_update_text').innerText = "Update Branch";

    document.getElementById('branch_cancel_edit').removeAttribute('hidden');

}

function editDepartment() {
    document.getElementById('department_name').removeAttribute('disabled');
    document.getElementById('department_phoneNo').removeAttribute('readonly');
    document.getElementById('department_email').removeAttribute('readonly');
    document.getElementById('department_address').removeAttribute('readonly');
    document.getElementById('department_ententionNo').removeAttribute('readonly');
    document.getElementById('department_branch').removeAttribute('disabled');
 
    document.getElementById('department_view_btn_text').innerText = "Save";

    document.getElementById('department_update_text').innerText = "Update Department";

    document.getElementById('department_cancel_edit').removeAttribute('hidden');

}

function editEmployeeAdminProfile() {
    document.getElementById('employee_admin_username').removeAttribute('readonly');
    document.getElementById('employee_admin_first_name').removeAttribute('readonly');
    document.getElementById('employee_admin_last_name').removeAttribute('readonly');
    document.getElementById('employee_admin_email').removeAttribute('readonly');
    document.getElementById('employee_admin_gender').removeAttribute('disabled');
    document.getElementById('employee_admin_phoneNo').removeAttribute('readonly');
    document.getElementById('employee_admin_birthday').removeAttribute('readonly');
    document.getElementById('employee_admin_nic').removeAttribute('readonly');
    document.getElementById('employee_admin_address').removeAttribute('readonly');
    document.getElementById('employee_admin_current_password').removeAttribute('readonly');
    document.getElementById('employee_admin_new_password').removeAttribute('readonly');
    document.getElementById('employee_admin_confirm_new_password').removeAttribute('readonly');
 
    document.getElementById('normal_employee_view_btn_text').innerText = "Save";

    document.getElementById('normal_employee_cancel_edit').removeAttribute('hidden');

}

function viewPendingStudentUpdate_btn() {
    document.getElementById('pending_Stu_name_initials').removeAttribute('readonly');
    document.getElementById('pending_stu_fullName').removeAttribute('readonly');
    document.getElementById('pending_stu_email').removeAttribute('readonly');
    document.getElementById('pending_stu_address').removeAttribute('readonly');
    document.getElementById('pending_stu_school').removeAttribute('readonly');
    document.getElementById('pending_stu_tel_home').removeAttribute('readonly');
    document.getElementById('pending_stu_tel_mobile').removeAttribute('readonly');
    document.getElementById('pending_stu_nic').removeAttribute('readonly');

    document.getElementById('pending_stu_view_btn_text').innerText = "Save";

    document.getElementById('pending_stu_update_text').innerText = "Update Employee";

    document.getElementById('pending_stu_cancel_edit').removeAttribute('hidden');

}

function editBranch() {
    document.getElementById('validationTooltip05').removeAttribute('readonly');
    document.getElementById('validationTooltip04').removeAttribute('readonly');
    document.getElementById('validationTooltip03-charu').removeAttribute('readonly');
    document.getElementById('validationTooltip01-charu').removeAttribute('readonly');
    document.getElementById('validationTooltip02-charu').removeAttribute('readonly');
    document.getElementById('validationTooltipUsername-charu').removeAttribute('readonly');
    document.getElementById('inlineFormCustomSelect-charu').removeAttribute('disabled');

    document.getElementById('branch_view_btn_text').innerText = "Save";

    document.getElementById('branch_update_text').innerText = "Update Branch";

    document.getElementById('branch_cancel_edit').removeAttribute('hidden');

}

function editDepartment() {
    document.getElementById('validationTooltip05').removeAttribute('readonly');
    document.getElementById('validationTooltip04').removeAttribute('readonly');
    document.getElementById('validationTooltip03').removeAttribute('readonly');
    document.getElementById('validationTooltip01').removeAttribute('readonly');
    document.getElementById('validationTooltip02').removeAttribute('readonly');
    document.getElementById('validationTooltipUsername-charu').removeAttribute('readonly');
    document.getElementById('inlineFormCustomSelect').removeAttribute('disabled');

    document.getElementById('department_view_btn_text').innerText = "Save";

    document.getElementById('department_update_text').innerText = "Update Department";

    document.getElementById('department_cancel_edit').removeAttribute('hidden');

}
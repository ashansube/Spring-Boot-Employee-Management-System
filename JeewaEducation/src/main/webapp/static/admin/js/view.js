function editText() {
    document.getElementById('firstname').removeAttribute('readonly');
    document.getElementById('lastname').removeAttribute('readonly');
    document.getElementById('visaemail').removeAttribute('readonly');
    document.getElementById('gender').removeAttribute('disabled');
    document.getElementById('dateofbirth').removeAttribute('readonly');
    document.getElementById('city').removeAttribute('readonly');
    document.getElementById('state').removeAttribute('readonly');
    document.getElementById('zip').removeAttribute('readonly');
    document.getElementById('marrage').removeAttribute('disabled');
    document.getElementById('currentResidence').removeAttribute('readonly');

    document.getElementById('updateText').innerText = "Save";
    document.getElementById('cancel').removeAttribute('hidden');
}
function openForm() {
    document.getElementById("formPopUp").style.display = "block";
    
  }
  
  function closeForm() {
    document.getElementById("formPopUp").style.display = "none";
  }

  function submitForm(){
    document.formLogin.submit();
  }
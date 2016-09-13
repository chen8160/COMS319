function validate(){
	var myForm = document.getElementById("firstName");
	var text = document.getElementById("para1");
	var fn = myForm.value;
	text.innerHTML = fn;
	
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var gender = document.getElementById("gender").value;
	var state = document.getElementById("state").value;
	
	var p1 = document.getElementById("para1");
	var p2 = document.getElementById("para2");
	var p3 = document.getElementById("para3");
	var p4 = document.getElementById("para4");
	
	if(firstName.length != 0 && isAlphaNumeric(firstName)){
		p1.innerHTML = "right"
	} else{
		p1.innerHTML = "false"
	}
	
	if(lastName.length != 0 && isAlphaNumeric(lastName)){
		p2.innerHTML = "right"
	} else{
		p2.innerHTML = "false"
	}
}

function isAlphaNumeric(str) {
  var code, i, len;

  for (i = 0, len = str.length; i < len; i++) {
    code = str.charCodeAt(i);
    if (!(code > 47 && code < 58) && // numeric (0-9)
        !(code > 64 && code < 91) && // upper alpha (A-Z)
        !(code > 96 && code < 123)) { // lower alpha (a-z)
      return false;
    }
  }
  return true;
};
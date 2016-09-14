function validate(){
//	var myForm = document.getElementById("firstName");
//	var text = document.getElementById("para1");
//	var fn = myForm.value;
//	text.innerHTML = fn;
	
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var gender = document.getElementById("gender").value;
	var state = document.getElementById("state").value;
	
	var img1 = document.getElementById("img1");
	var img2 = document.getElementById("img2");
	var img3 = document.getElementById("img3");
	var img4 = document.getElementById("img4");
	
	var proceed1 = false, proceed2 = false;
	
	if(firstName.length != 0 && isAlphaNumeric(firstName)){
		img1.src = './correct.png';
		proceed1 = true;
		
	} else{
		img1.src = './wrong.png';
		proceed1 = false;
	}
	
	if(lastName.length != 0 && isAlphaNumeric(lastName)){
		img2.src = './correct.png';
		proceed2 = true;
	} else{
		img2.src = './wrong.png';
		proceed2 = false;
	}
	
	img3.src = './correct.png';
	img4.src = './correct.png';
	
	document.cookie = "state" + "=" + state + ";";
	console.log("cookie: " + document.cookie);
	if(proceed1 && proceed2){
		window.open("./validation2.html", "_self");
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
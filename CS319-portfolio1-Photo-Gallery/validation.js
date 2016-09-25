function validate(){

	var name = document.getElementById("name").value;
	var isValidName = false;

	if(name.length != 0 && isAlphaNumeric(name)){
		isValidName = true;
	}
}

function isAlphaNumeric(str){
	var code, i, len;

	for(i = 0, len = str.length; i < len; i++){
		code = str.charCodeAt(i);
		if (!(code > 47 && code < 58) &&  // numeric (0-9)
        	!(code > 64 && code < 91) &&  // upper alpha (A-Z)
        	!(code > 96 && code < 123)){ // lower alpha (a-z)
     		 return false;
    	}
	}
	return true;
}
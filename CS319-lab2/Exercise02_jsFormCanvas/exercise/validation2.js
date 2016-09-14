function validate(){
	var email = document.getElementById("email").value;
	var phone = document.getElementById("phone").value;
	var address = document.getElementById("address").value;
	
	var regEmail = /^[a-z0-9]{3}@[a-z0-9]{3}\.[a-z0-9]{3}$/i;
    var regPhone = /^([0-9]{3}-[0-9]{3}-[0-9]{4}|[0-9]{10})$/;
	var regAddress = /^[a-zA-Z0-9]+,\s*[A-Z]{2}$/
    console.log(regEmail.test(email));
    console.log(regPhone.test(phone));
    console.log(regAddress.test(address));
    
    var img1 = document.getElementById("img1");
	var img2 = document.getElementById("img2");
	var img3 = document.getElementById("img3");
    
    var proceed = regEmail.test(email) && regPhone.test(phone) &&regAddress.test(address);
    
    if(regEmail.test(email)){
        img1.src = './correct.png';
    } else{
        img1.src = './wrong.png';
    }
    
    if(regPhone.test(phone)){
		img2.src = './correct.png';
	} else{
		img2.src = './wrong.png';
	}
    
    if(regAddress.test(address)){
        img3.src = './correct.png';
    } else{
        img3.src = './wrong.png';
    }
    
    if(proceed){
        if(typeof(Storage) !== "undefined"){
            localStorage.setItem("address", address);
            document.cookie = "state=; expires=Thu, 01 Jan 1970 00:00:00 UTC";
            window.open("showMap.html", "_self");
        } else{
            console.log("Browser doesn't support Storate");
        }
    }
    
}
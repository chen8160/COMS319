function loadPics() {

    for (var i = 0; i < length; i++) {

        var s = jArray[i];

        var order = i % 4;

        if (order == 0) {
            document.getElementById("col-1").innerHTML += s;
        } else if (order == 1) {
            document.getElementById("col-2").innerHTML += s;
        } else if (order == 2) {
            document.getElementById("col-3").innerHTML += s;
        } else if (order == 3) {
            document.getElementById("col-4").innerHTML += s;
        }
    }

}

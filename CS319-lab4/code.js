$(document).ready(function () {
    $('#btn1').click(effect);
    $('#btn2').mouseover(effect);
    $('#btn3').mouseleave(effect);
    $('#btn4').mousedown(effect);
    $('#btn5').mousemove(effect);
});


function effect() {
    $('#1').hide();
    $('#2').fadeOut();
    $('#3').show("fast");
    $('#4').toggle("slow");
    $('#5').fadeToggle("slow");
}
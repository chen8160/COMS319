<?php
    $username = $_SESSION['username'];
    $file = json_decode(file_get_contents("messages.txt"));
    $table = "<table id=\"msgs\" border=2><tr><td>From</td><td>Message</td></tr>";
    if($file != null) {
        foreach($file as $message){ 
            if($message->to == $username){
                $table .= "<tr><td>" . $message->from . "</td><td>" . $message->msg . "</td></tr>";
            }
        }
    }
    $table .= "</table>";
    echo $table;
?>

<?php
    session_start();

    $username = $_REQUEST['name'];
    $password = $_REQUEST['pass'];

    if($username == ""){
        echo "empty username";
        exit();
    } else if($password == ""){
        echo "empty password";
        exit();
    }

    $file = json_decode(file_get_contents("users.txt"));

    if($file != null){
        foreach($file as $index => $user) {
            
            if($user->username == $username && $user->password == $password){
                $_SESSION["username"] = $username;
                echo "success";
                exit();
            }
        }
    }

    echo "username or password is wrong";
?>
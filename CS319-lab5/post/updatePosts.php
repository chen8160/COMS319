<?php
    session_start();
//    echo "2016";
    $title = $_REQUEST['title'];
    $content = $_REQUEST['content'];
    $isNew = $_REQUEST['isNew'];
    $userName = $_SESSION['username'];

    $newPost = Array();

    if($isNew){
        $newPost['title'] = $title;
        $newPost['content'] = $content;
        $newPost['username'] = $userName;
        $newPost['timeCreated'] = date("Y-m-d h:i:sa");
    } else{
        //TODO
    }

    $file = json_decode(file_get_contents("posts.txt"));

    $file[] = $newPost;
    file_put_contents("posts.txt", json_encode($file));

    echo $newPost['timeCreated'];
    
?>
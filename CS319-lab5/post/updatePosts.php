<?php
    session_start();
//    echo "2016";
    $title = $_REQUEST['title'];
    $content = $_REQUEST['content'];
    $isNew = $_REQUEST['isNew'];
    $userName = $_SESSION['username'];

    $newPost = Array();
    $file = json_decode(file_get_contents("posts.txt"));

    if($isNew == "true"){
        $newPost['title'] = $title;
        $newPost['content'] = $content;
        $newPost['username'] = $userName;
        $newPost['timeCreated'] = date("Y-m-d h:i:sa");
        $file[] = $newPost;
        echo $newPost['timeCreated'];
    } else{
        //TODO
        $index = (int) $_REQUEST['index'];
        $file[$index]->title = $title;
        $file[$index]->content = $content;
    }


    file_put_contents("posts.txt", json_encode($file));

//echo $_REQUEST['isNew'];

    
?>

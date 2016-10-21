<?php
    session_start();
?>

    <html>

    <head>
        <title>View Posts</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    </head>

    <body>
        <p align="right"><a href="logout.php">Lougout</a></p>
        <h1>Posts</h1>
        <?php
        
            $file = json_decode(file_get_contents("posts.txt"));
            $table = "<table id=\"posts\" border=2><tr><td>Title</td><td>Content</td><td>Time Created</td><td>Edit</td></tr>";
            if($file != null){
                foreach($file as $userName => $post){
                    $table .= "<tr><td>" . $post->title . "</td><td>" . $post->content . "</td><td>" . $post->timeCreated . "</td>";
                    
                    if($_SESSION['username'] == $post->username){
                        $table .= "<td><input type=\"button\" onClick='edit(this)' value=\"Edit\" /></td></tr>";
                    } else{
                        $table .= "</tr>";
                    }
                }
            }
            $table .= "</table>";
            echo $table;
            ?>
            <div hidden="true" id="makePost">
                <label for="title">Title:</label>
                <br>
                <input id="title" type="text" name="title" />
                <br>
                <label for="content">Content:</label>
                <br>
                <textarea id="content" rows="10" cols="100"></textarea>
            </div>
            <input type="button" id="post" name="post" value="Post" />
            <input type="button" hidden="true" id="update" onClick='editPost()' value="Submit" />
            <h1>Messages</h1>
            <?php
                require 'inbox.php';
            ?>
                <div id="sendMSG">
                    <label for="to">To:</label>
                    <br>
                    <input id="to" type="text" name="to" />
                    <br>
                    <label for="msg">Message:</label>
                    <br>
                    <textarea id="msg" rows="10" cols="100"></textarea>
                </div>
                <input type="button" id="send" name="send" value="Send Message" />

                <script>
                    $("#post").click(function () {

                        if ($("#makePost").is(':hidden')) {
                            $("#post").val("Submit");
                        } else {
                            $("#post").val("Post");
                            $.post("updatePosts.php", {
                                title: $("#title").val(),
                                content: $("#content").val(),
                                isNew: true
                            }, function (data, status) {
                                if (data != "") {
                                    var newEntry = "<tr><td>" + $("#title").val() + "</td><td>" + $("#content").val() + "</td><td>" + data + "</td><td><input type=\"button\" onClick='edit(this)' value=\"Edit\" /></td></tr>";
                                    $("#posts").append(newEntry);
                                    $("#title").val("");
                                    $("#content").val("");
                                    console.log(status);
                                }
                            });
                        }

                        $("#makePost").toggle();

                    });

                    function edit(that) {
                        var rowI = $(that).parent().parent().index('tr');
                        var Index = rowI - 1;
                        $("#post").hide();
                        $("#makePost").show();
                        $("#update").show();

                        editPost = function () {
                            console.log(Index);
                            $.post("updatePosts.php", {
                                title: $("#title").val(),
                                content: $("#content").val(),
                                isNew: false,
                                index: Index
                            }, function (data, status) {
                                $($($(that).parent().parent()).children()[0]).html($("#title").val());
                                $($($(that).parent().parent()).children()[1]).html($("#content").val());
                                $("#title").val("");
                                $("#content").val("");
                            });
                            $("#post").show();
                            $("#makePost").hide();
                            $("#update").hide();
                        }
                    }

                    $("#send").click(function () {
                        $.post("sendmessage.php", {
                            to: $("#to").val(),
                            msg: $("#msg").val()
                        }, function (data, status) {
                            console.log(data);
                            $("#to").val("");
                            $("#msg").val("");
                        });
                    });
                </script>

    </body>

    </html>
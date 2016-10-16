<?php
    session_start();
?>

    <html>

    <head>
        <title>View Posts</title>
    </head>

    <body>
        <p align="right"><a href="logout.php">Lougout</a></p>
        <h1>Posts</h1>
        <?php
        
            $file = json_decode(file_get_contents("posts.txt"));
            $table = "<table id=\"posts\">";
            if($file != null){
                foreach($file as $userName => $post){
                    $table .= "<tr><td>" . $post->title . "</td><td>" . $post->desc . "</td><td>" . $post->timeCreated . "</td></tr>";
                }
            }
            $table .= "</table>";
            echo $table;
        ?>

            <input type="button" id="post" name="post" value="Post" />
            <h1>Messages</h1>
            <?php 
                //TODO
            ?>
                <input type="button" id="msg" name="msg" value="Send Message" />

                <script>
                </script>

    </body>

    </html>
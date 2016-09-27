<!DOCTYPE HTML>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="author" content="Yuxiang Chen, Chenfeng Liu">
    <meta name=keywords content="Photo gallery">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Portfolio 1</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="./modal.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <!-- Optional theme -->
    <script src="./loadPics.js"></script>
    <script src="./lightBox.js"></script>
    <style>
        body {
            background-color: black;
        }
        
        .navbar {
            margin-bottom: 0;
            border: 0;
        }

    </style>
</head>

<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Xiaomeng Wang</a>
            </div>
            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.html">Home</a></li>
                    <li class="active"><a href="#">Photo</a></li>
                    <li><a href="About.html">About</a></li>
                    <li><a href="Contact.html">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container-fluid" style="margin: auto">
        <div class="col-xs-6" style="padding: 0; margin-top: 5vh">
            <div class="col-xs-12 col-md-6" style="padding: 0 8px 0 8px" id="col-1">
            </div>
            <div class="col-xs-12 col-md-6" style="padding: 0 8px 0 8px" id="col-2">
            </div>
        </div>
        <div class="col-xs-6" style="padding: 0; margin-top: 5vh">
            <div class="col-xs-12 col-md-6" style="padding: 0 8px 0 8px" id="col-3">
            </div>
            <div class="col-xs-12 col-md-6" style="padding: 0 8px 0 8px" id="col-4">
            </div>
        </div>
    </div>

    <?php
// Read directory, spit out links
    $entries = array();
    $box = array();
    $index = 1;
if ($handle = opendir('./pics')) {
    while (false !== ($entry = readdir($handle))) {
        if ($entry != "." && $entry != ".." && $entry != "about.jpg") {
            $string = '<img src="pics/'.$entry.'" class="img-responsive img-thumbnail" style="margin-bottom: 25px" onclick="openModal();currentSlide('.$index++.')" class="hover-shadow cursor">';
            array_push($entries, $string);
            $boxString = '<div class="mySlides"><img src="pics/'.$entry.'" style="width:100%"></div>';
            array_push($box, $boxString);
        }
    }
    $count = count($entries);
    closedir($handle);
}
?>

        <div id="myModal" class="modal">
            <span class="close cursor" onclick="closeModal()">&times;</span>
            <div class="modal-content">

                <!--
                <div class="mySlides">
                    <img src="img_nature_wide.jpg" style="width:100%">
                </div>

                <div class="mySlides">
                    <img src="img_fjords_wide.jpg" style="width:100%">
                </div>

                <div class="mySlides">
                    <img src="img_mountains_wide.jpg" style="width:100%">
                </div>

                <div class="mySlides">
                    <img src="img_lights_wide.jpg" style="width:100%">
                </div>
-->
                <?php 
                    for($i = 0; $i < $count; $i++){
                        echo $box[$i];
                    }
                ?>

                    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
                    <a class="next" onclick="plusSlides(1)">&#10095;</a>

            </div>
        </div>

        <script>
            var jArray = <?php echo json_encode($entries ); ?>;
            var length = <?php echo json_encode($count); ?>;
            loadPics();

        </script>

</body>

</html>

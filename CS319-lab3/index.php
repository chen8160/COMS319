<html>

<body>
    <?php
// Read directory, spit out links
if ($handle = opendir('./Exercise03_Javascript/02_Examples')) {
    while (false !== ($entry = readdir($handle))) {
        if ($entry != "." && $entry != "..") {
            echo '<a href="Exercise03_Javascript/02_Examples/'.$entry.'">Link to file '.$entry.'</a><br>';
        }
    }
    closedir($handle);
}
?>

</body>

</html>

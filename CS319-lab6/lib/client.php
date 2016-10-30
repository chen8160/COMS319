<?php
    session_start();
?>
    <html>

    <head>
        <title>Library</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script type="text/javascript">
            admin = "<?php echo $_SESSION['librarian']; ?>";

        </script>
        <script src="booksLibrary.js"></script>
    </head>

    <body>
        <p><a href="logout.php">
        <?php
            echo "<p align='right'>" . $_SESSION['username'] . "</p>";
        ?>
            </a></p>
        <div id="lib">Library Table</div>
        <div id="description"></div>
        <input hidden="true" id="borrow" type="button" value="Borrow" />
        <input hidden="true" id="return" type="button" value="Return" />
        <div hidden="true" id="form">
            <label for="bookName">Book Name</label>
            <input id="bookName" type="text" name="bookName" />
            <label for="bookID">Book ID</label>
            <input id="bookID" type="text" name="bookID" />
            <input id="add" type="button" value="Add" />
        </div>
    </body>

    </html>

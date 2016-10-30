<?php
    session_start();
    
    $DB_username = "dbu319t64";
    $DB_password = "?HagemU2";
    $DB_dbServer = "mysql.cs.iastate.edu"; 
    $DB_dbName   = "db319t64";

    $conn = new mysqli($DB_dbServer, $DB_username, $DB_password, $DB_dbName);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
        echo "failed";
        exit();
    }

    if($_REQUEST['op'] == "shelfs"){
        query_shelfs($conn);
    }



    function query_shelfs($conn){
        $shelfs = array();
        $i = 0;
        while($i < 4){
            $books = array();
             $sql = "SELECT books.* FROM shelves INNER JOIN books ON books.BookId=shelves.BookId WHERE shelfId='$i'";
             $result = $conn->query($sql);
             while($row = $result->fetch_assoc()) {
                 $books[] = array("bookName"=>$row["BookTitle"], "bookID"=>$row["BookId"], "author"=>$row["Author"], "presence"=>$row["Availability"]);
             }
             $shelfs[] = $books;
            $i++;
        }
        echo json_encode($shelfs);
        
    }

class Library {
    private $shelfs;
    
    function __contruct($shelfs){
        $this->shelfs = $shelfs;
    }
}

class Book {
    private bookID;
    private bookName;
    private author;
    private presence;
    
    function __construct($id, $name, $author, $presence){
        $this->bookID = $id;
        $this->bookName = $name;
        $this->author = $author;
        $this->presence = $presence;
    }
}

class Student {
    private $name;
    private $admin;
    
    function __construct($name, $admin){
        $this->name = $name;
        $this->admin = $admin;
    }
}

class Shelf {
    private id;
    private name;
    private books;
    
    function __contruct($name, $id, $books){
        $this->name = $name;
        $this->id = $id;
        $this->books = $books;
    }
}


?>

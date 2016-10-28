<?php

    $DB_username = "dbu319t64";
    $DB_password = "?HagemU2";
    $DB_dbServer = "mysql.cs.iastate.edu"; 
    $DB_dbName   = "db319t64";

    $username = $_REQUEST['postname'];
    $password = $_REQUEST['postpassword'];
    $email = $_REQUEST['postemail'];
    $phone = $_REQUEST['postphone'];
    $librarian = $_REQUEST['postcheck'];
    $firstName = $_REQUEST['postfirstname'];
    $lastName = $_REQUEST['postlastname'];

$conn = new mysqli($DB_dbServer, $DB_username, $DB_password, $DB_dbName);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
    echo "failed";
    exit();
}

$sql = "INSERT INTO users VALUES ($username, $password, $email, $phone, $librarian, $firstName, $lastName)";

$conn->query($sql);

$conn->close();
echo "success";
?>

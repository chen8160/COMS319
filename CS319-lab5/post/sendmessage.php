<?php
    session_start();

    $path = 'phpseclib';
	set_include_path(get_include_path() . PATH_SEPARATOR . $path);
	include_once('Crypt/RSA.php');



//Function for encrypting with RSA
function rsa_encrypt($string, $public_key)
{
    //Create an instance of the RSA cypher and load the key into it
    $cipher = new Crypt_RSA();
    $cipher->loadKey($public_key);
    //Set the encryption mode
    $cipher->setEncryptionMode(CRYPT_RSA_ENCRYPTION_PKCS1);
    //Return the encrypted version
    return $cipher->encrypt($string);
}

$to = $_REQUEST['to'];
$msg = $_REQUEST['msg'];

$users = json_decode(file_get_contents("users.txt"));
$file = json_decode(file_get_contents("messages.txt"));
//echo $file;
foreach($users as $user){
    if($user->username == $to){
        
        $publicKey = $user->publicKey;
        $enc_msg = rsa_encrypt($msg, $publicKey);
        $new_msg = array("from"=>$_SESSION['username'], "to"=>$to, "msg"=>$enc_msg);
        $file[] = $new_msg;
        echo json_encode($enc_msg, JSON_UNESCAPED_SLASHES | JSON_HEX_APOS | JSON_HEX_AMP);
        file_put_contents("messages.txt", json_encode($file));
    
        exit();
    }
}


?>
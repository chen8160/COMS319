<?php
    $path = 'phpseclib';
	set_include_path(get_include_path() . PATH_SEPARATOR . $path);
	include_once('Crypt/RSA.php');
    
    $username = $_SESSION['username'];
    $privateKey = "";
    $users = json_decode(file_get_contents("users.txt"));
    foreach($users as $user){
        if($user->username == $username){
            $privateKey = $user->privateKey;
        }
    }

function rsa_decrypt($string, $private_key)
{
    //Create an instance of the RSA cypher and load the key into it
    $cipher = new Crypt_RSA();
    $cipher->loadKey($private_key);
    //Set the encryption mode
    $cipher->setEncryptionMode(CRYPT_RSA_ENCRYPTION_PKCS1);
    //Return the decrypted version
    return $cipher->decrypt($string);
}

    $username = $_SESSION['username'];
    $file = json_decode(file_get_contents("messages.txt"));
    $table = "<table id=\"msgs\" border=2><tr><td>From</td><td>Message</td></tr>";
    if($file != null) {
        foreach($file as $message){ 
            if($message->to == $username){
                $table .= "<tr><td>" . $message->from . "</td><td>" . rsa_decrypt((String) urldecode($message->msg), $privateKey) . "</td></tr>";
            }
        }
    }
    $table .= "</table>";
    echo $table;
?>
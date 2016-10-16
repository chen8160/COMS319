<?php
    $path = 'phpseclib';
	set_include_path(get_include_path() . PATH_SEPARATOR . $path);
	include_once('phpseclib/Crypt/RSA.php');


    $username = $_REQUEST['name'];
    $password = $_REQUEST['pass'];

    if($username == ""){
        echo "empty username";
        exit();
    } else if($password == ""){
        echo "empty password";
        exit();
    }

    $newUser = Array();

    $rsa = new Crypt_RSA();
	$rsa->setPrivateKeyFormat(CRYPT_RSA_PRIVATE_FORMAT_PKCS1);
	$rsa->setPublicKeyFormat(CRYPT_RSA_PUBLIC_FORMAT_PKCS1);
	extract($rsa->createKey(1024));

    $newUser['username'] = $username;
    $newUser['password'] = $password;
    $newUser['privateKey'] = $privatekey;
    $newUser['publicKey'] = $publickey;
    
    $file = json_decode(file_get_contents("users.txt"));

    if($file != null){    

        foreach($file as $index => $user) {
            
            if($user->username == $username){
                echo "user exst";
                exit();
            }
        }
    }
        
        $file[] = $newUser;
        file_put_contents("users.txt", json_encode($file));
        

    echo "success";
    
?>
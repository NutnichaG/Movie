<?php
    $con = mysqli_connect("localhost", "id13845210_userdata", "Someone123456789/", "id13845210_user");
    
    $name = $_POST["name"];
    $email = $_POST["email"];
    $password = $_POST["password"];

    $statement = mysqli_prepare($con, "INSERT INTO user (name, email, password) VALUES (?, ?, ?)");
    mysqli_stmt_bind_param($statement, "sss", $name, $email, $password);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>
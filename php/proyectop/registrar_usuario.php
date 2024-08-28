<?php
$servername = "localhost";
$username = "tuUsuario";
$password = "tuContraseña";
$dbname = "miBaseDeDatos";

// Crear conexión
$conn = new mysqli($servername, $username, $password, $dbname);

// Verificar conexión
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Recoger datos del formulario
$first_name = $_POST['first_name'];
$last_name = $_POST['last_name'];
$email = $_POST['email'];
$phone_number = $_POST['phone_number'];

// Sentencia SQL para insertar datos
$sql = "INSERT INTO usuarios (first_name, last_name, email, phone_number)
VALUES ('$first_name', '$last_name', '$email', '$phone_number')";

if ($conn->query($sql) === TRUE) {
    echo "Nuevo registro creado exitosamente";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>

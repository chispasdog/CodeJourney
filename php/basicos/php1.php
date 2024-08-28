
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    print "hola a todos <br>"; //inprime mas salto de linea 


    /*
    otro ejemplo de comentario 
    */
    $nombre = "Juan";
    $edad = 3;

    print $nombre;
    print "la edad es = " . $edad . "<br>";//se concatena con un .  no un +
    print "la edad es = " . $edad . " y el nombre= " . $nombre;

    print "<br>";
    echo $nombre,$edad;
    echo "<br>hola alumnos";
    
    function dameDatos(){
        echo "<br>el mensaje de la funcion";
    }
    dameDatos();
    

    include ("php2.php");

    dameDatos2();


    $nombre6="Juan";

    function dameNombre(){
        global $nombre6;
        $nombre6="El nombre es " . $nombre6;
    }

    dameNombre();

    echo $nombre6;
    print $nombre6;


    ?>
</body>
</html>
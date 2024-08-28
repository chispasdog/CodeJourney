<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .resalatar{
            color:#F00;
            font-weight:bold;
        }
    </style>
</head>
<body>
    

<?php
   $nombre231 ="juan";
    echo '<p class="resalatar"> esto es un ejemplo der grase </p>';
    echo "hola $nombre231";

        $variable1="Casa";
        $variable2="CASA";
        $resultado=strcmp($variable1,$variable2);
        echo "<br>el resultado es ". $resultado;
        $resultado2=strcasecmp($variable1,$variable2);
        echo "<br>el resultado es $resultado2";
?>

</body>
</html>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Documento sin título</title>
</head>

<body>

<p>&nbsp;</p>
<form name="form1" method="post" action="">
  <p>
    <label for="num1"></label>
    <input type="text" name="num1" id="num1">
    <label for="num2"></label>
    <input type="text" name="num2" id="num2">
    <label for="operacion"></label>
    <select name="operacion" id="operacion">
      <option>Suma</option>
      <option>Resta</option>
      <option>Multiplicación</option>
      <option>División</option>
      <option>Módulo</option>
    </select>
  </p>
  <p>
    <input type="submit" name="button" id="button" value="Enviar" onClick="prueba">
  </p>
</form>

<p>&nbsp;</p>

</body>
</html>



<?php


if(isset($_POST["button"])){
    $numero1=$_POST["num1"];
    $numero2=$_POST["num2"];
    $operacion=$_POST["operacion"]; 


    if(!strcmp("Suma",$operacion)){
      echo "el resultado es: " . ($numero1 + $numero2);
    }
    if(!strcmp("Resta",$operacion)){
      echo "el resultado es: " . ($numero1 - $numero2);
    }
    if(!strcmp("Multiplicación",$operacion)){
      echo "el resultado es: " . ($numero1 * $numero2);
    }
    if(!strcmp("División",$operacion)){
      echo "el resultado es: " . ($numero1 / $numero2);
    }
    if(!strcmp("Módulo",$operacion)){
      echo "el resultado es: " . ($numero1 % $numero2);
    }


}

?>

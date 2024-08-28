<?php 

function incrementarvalor(){
    static $contador= 0;
    $contador++;
    echo $contador ."<br>";

}
incrementarvalor();
incrementarvalor();
incrementarvalor();
incrementarvalor();
incrementarvalor();
?>
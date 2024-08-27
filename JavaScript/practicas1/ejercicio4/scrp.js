document.addEventListener('DOMContentLoaded', function() {
    var nombreDiv = document.getElementById('nombre');
    nombreDiv.innerHTML = 'Pablo <br> Andreu';

    var cuadradosDiv = document.getElementById('cuadrados');
    for (var i = 1; i <= 20; i++) {
        cuadradosDiv.innerHTML += i + " al cuadrado es " + (i * i) + "<br>";
    }
});

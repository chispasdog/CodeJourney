try {
    var a = 5;
    var resultado = a + b;
} catch (error) {
    alert("error: " + error.stack);
} finally {
    alert("Operación de suma finalizada.");
}

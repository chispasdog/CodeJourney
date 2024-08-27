package ejercicios.control_de_if;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Queremos comprobar si con una compra en la que gastamos 5249.24 euros, nos
        // quedamos en
        // números rojos.
        // Realiza una operación para “gastar” dicha cantidad de dinero en una variable
        // llamada ahorros.
        // En caso de estar en números rojos debemos imprimir un mensaje por pantalla.
        // En caso de no
        // estar en números rojos pero si nuestros ahorros son menores que 1000 euros,
        // debemos
        // imprimir un mensaje de aviso para no gastar mucho más. En otro caso,
        // pasaremos a gastar
        // 2000 euros más y mostrar por pantalla cómo quedan nuestros ahorros después
        // del gasto.

        double ahorros = 6000.00;
        double compra = 5249.24;

        ahorros -= compra;

        if (ahorros < 0) {
            System.out.println("Estás en números rojos.");
        } else if (ahorros < 1000) {
            System.out.println("Cuidado, te quedan menos de 1000 euros.");
        } else {
            ahorros -= 2000;
            System.out.println("Tras un gasto adicional de 2000 euros, te quedan " + ahorros + " euros.");
        }
    }
}

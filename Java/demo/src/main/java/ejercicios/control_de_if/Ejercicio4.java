package ejercicios.control_de_if;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Tenemos dos variables, una representa nuestra posición en el eje x, otra
        // nuestra posición en el
        // eje y. Queremos que, dependiendo del valor de una variable llamada
        // movimiento, nuestra
        // posición cambie.
        // Si movimiento tiene el valor Arriba, entonces nuestra variable y pasará a ser
        // y + 1. Si
        // movimiento vale Izquierda, nuestra x valdrá x – 1, y así con las cuatro
        // posibilidades (Arriba,
        // Abajo, Izquierda y Derecha).

        int x = 5;
        int y = 5;
        String movimiento = "Arriba";

        switch (movimiento) {
            case "Arriba":
                y++;
                break;
            case "Abajo":
                y--;
                break;
            case "Derecha":
                x++;
                break;
            case "Izquierda":
                x--;
                break;
            default:
                System.out.println("Movimiento no válido");
        }

        System.out.println("Nueva posición: x = " + x + ", y = " + y);
    }
}

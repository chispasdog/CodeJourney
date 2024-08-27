package ejercicios.control_de_if;

public class Ejercicio1 {
    public static void main(String[] args) {

        int x = 25;
        int y = 27;
        int mayor;

        if (x > y) {
            mayor = x;
        } else {
            mayor = y;
        }

        System.out.println("El mayor valor es: " + mayor);
    }
}

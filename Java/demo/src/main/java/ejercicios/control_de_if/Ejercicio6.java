package ejercicios.control_de_if;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        // El modelo de color RGB tiene tres componentes, la componente roja (R), la
        // verde (G) y la azul
        // (B).
        // Genera un color aleatorio válido (solo pueden ir desde 0 hasta 255).
        // Indica qué tipo de color es, dependiendo de la mayor de sus componentes.

        Random rand = new Random();

        int R = rand.nextInt(256);
        int G = rand.nextInt(256);
        int B = rand.nextInt(256);

        if (R > G && R > B) {
            System.out.println("El color es Rojo.");
        } else if (G > R && G > B) {
            System.out.println("El color es Verde.");
        } else if (B > R && B > G) {
            System.out.println("El color es Azul.");
        } else {
            System.out.println("El color es Gris.");
        }
    }
}

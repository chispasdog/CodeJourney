package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /**
         * Ejercicio 11
         * Comprueba si una palabra es capicúa, es decir, se lee igual de izquierda a
         * derecha que de
         * derecha a izquierda. Para ello utiliza bucles y comprueba carácter a
         * carácter.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        boolean esCapicua = true;

        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esCapicua = false;
                break;
            }
        }

        if (esCapicua) {
            System.out.println("La palabra es capicúa.");
        } else {
            System.out.println("La palabra no es capicúa.");
        }

        scanner.close();
    }
}

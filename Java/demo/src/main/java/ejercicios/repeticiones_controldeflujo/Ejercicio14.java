package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /**
         * Ejercicio 14
         * Cuenta el número de vocales de una palabra.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        int contadorVocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("El número de vocales en la palabra es: " + contadorVocales);

        scanner.close();
    }
}

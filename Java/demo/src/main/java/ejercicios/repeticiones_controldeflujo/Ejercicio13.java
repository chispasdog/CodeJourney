package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /**
         * Ejercicio 13
         * Recorre y muestra la primera mitad de una palabra.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        String primeraMitad = palabra.substring(0, palabra.length() / 2);
        System.out.println("La primera mitad de la palabra es: " + primeraMitad);

        scanner.close();
    }
}

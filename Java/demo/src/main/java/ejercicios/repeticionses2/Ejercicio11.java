package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /**
         * Convertir una frase a mayúsculas o minúsculas,
         * que daremos opción a que el usuario lo pida y mostraremos el resultado por
         * pantalla.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        System.out.println("¿Quieres convertir a (1) Mayúsculas o (2) Minúsculas?");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println(frase.toUpperCase());
        } else if (opcion == 2) {
            System.out.println(frase.toLowerCase());
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

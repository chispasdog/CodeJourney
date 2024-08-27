package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /** Eliminar los espacios de una frase pasada por consola por el usuario. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        String sinEspacios = frase.replace(" ", "");
        System.out.println("Frase sin espacios: " + sinEspacios);
    }
}

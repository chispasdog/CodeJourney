package ejercicios.control_de_flujo;

import java.util.Scanner;

/**
 * Ejercicio 2
 * Lee un número por teclado y muestra por consola, el carácter al que pertenece
 * en la tabla
 * ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Introduce un número para obtener su carácter en la tabla ASCII: ");
        int numero = scanner.nextInt();

        // Convertir el número a carácter y mostrarlo
        char caracter = (char) numero;
        System.out.println("El carácter correspondiente al número " + numero + " en la tabla ASCII es: " + caracter);
    }
}

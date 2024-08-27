package ejercicios.control_de_flujo;

import java.util.Scanner;

/**
 * Ejercicio 3
 * Modifica el ejercicio anterior, para que, en lugar de pedir un número, pida
 * un carácter (char) y
 * muestre su código en la tabla ASCII.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un carácter al usuario
        System.out.print("Introduce un carácter para obtener su número en la tabla ASCII: ");
        char caracter = scanner.next().charAt(0);

        // Convertir el carácter a número y mostrarlo
        int numero = (int) caracter;
        System.out.println("El número correspondiente al carácter '" + caracter + "' en la tabla ASCII es: " + numero);
    }
}

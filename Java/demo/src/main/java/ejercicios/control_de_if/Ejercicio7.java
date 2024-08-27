package ejercicios.control_de_if;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * Pide un número por teclado usando Scanner y muestra si es positivo o
         * negativo, si es par o
         * impar y si es divisible por 5 o no.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        if (numero % 5 == 0) {
            System.out.println("El número es divisible por 5.");
        } else {
            System.out.println("El número no es divisible por 5.");
        }

        scanner.close();
    }
}

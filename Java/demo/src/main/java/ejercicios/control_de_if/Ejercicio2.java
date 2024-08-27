package ejercicios.control_de_if;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crea un if para comprobar si dos números son iguales, si el primer número es
        // mayor que el
        // segundo o el segundo es mayor que el primero. Muestra un mensaje por pantalla
        // para cada
        // caso.
        // Los números debes pasarlos por teclado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else {
            System.out.println("El segundo número es mayor que el primero.");
        }

        scanner.close();
    }
}

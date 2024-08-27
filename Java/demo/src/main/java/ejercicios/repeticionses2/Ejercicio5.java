package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Pide por teclado dos números y genera 10 números aleatorios entre esos
         * números.
         * Usa el método Math.random para generar un número entero aleatorio
         * (recuerda el casting de double a int).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random() * (num2 - num1 + 1) + num1);
            System.out.println("Número aleatorio " + (i + 1) + ": " + aleatorio);
        }
    }
}

package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        // a) Usando for
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

        System.out.println("\n-------------------\n");

        // b) Usando while
        int j = 1;
        while (j <= 10) {
            System.out.println(n + " x " + j + " = " + n * j);
            j++;
        }

        System.out.println("\n-------------------\n");

        // c) Usando do-while
        int k = 1;
        do {
            System.out.println(n + " x " + k + " = " + n * k);
            k++;
        } while (k <= 10);
    }
}

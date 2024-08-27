package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de n: ");
        int n = sc.nextInt();
        System.out.print("Introduce el valor de y: ");
        int y = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % y == 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

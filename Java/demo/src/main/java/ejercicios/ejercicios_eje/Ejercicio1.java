package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}

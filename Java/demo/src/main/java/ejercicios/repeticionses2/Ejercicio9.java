package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /**
         * Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número mayor a 1:");
        int num = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma desde 1 hasta " + num + " es: " + suma);
    }
}

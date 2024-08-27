package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Realiza una aplicación que nos pida un número de ventas a introducir, después
        // nos pedirá
        // tantas ventas por teclado como número de ventas se hayan indicado. Al final
        // mostrara la suma
        // de todas las ventas. Piensa que es lo que se repite y lo que no.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de ventas:");
        int numVentas = sc.nextInt();

        double sumaVentas = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Introduce la venta #" + i + ":");
            double venta = sc.nextDouble();
            sumaVentas += venta;
        }

        System.out.println("La suma total de las ventas es: " + sumaVentas);
        sc.close();
    }
}

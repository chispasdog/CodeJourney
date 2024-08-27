package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de ventas:");
        int numVentas = scanner.nextInt();

        double sumaVentas = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Introduce el valor de la venta " + i + ":");
            sumaVentas += scanner.nextDouble();
        }

        System.out.println("La suma total de las ventas es: " + sumaVentas);

        scanner.close();
    }
}

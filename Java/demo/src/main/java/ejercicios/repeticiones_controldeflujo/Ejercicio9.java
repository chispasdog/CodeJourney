package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        double sumaTotal = 0;
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        int contador = 0;

        while (true) {
            System.out.println("Introduce un número (-1 para terminar):");
            double num = scanner.nextDouble();

            if (num == -1) {
                break;
            }

            if (num > mayor) {
                mayor = num;
            }

            if (num < menor) {
                menor = num;
            }

            sumaTotal += num;

            if (num > 0) {
                sumaPositivos += num;
            } else if (num < 0) {
                sumaNegativos += num;
            }

            contador++;
        }

        double media = (contador == 0) ? 0 : sumaTotal / contador;

        System.out.println("El mayor número introducido es: " + mayor);
        System.out.println("El menor número introducido es: " + menor);
        System.out.println("La suma total es: " + sumaTotal);
        System.out.println("La suma de números positivos es: " + sumaPositivos);
        System.out.println("La suma de números negativos es: " + sumaNegativos);
        System.out.println("La media de los números es: " + media);

        scanner.close();
    }
}

package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Pide por teclado el nombre, edad y salario y muestra el salario.
         * – Si es menor de 16 no tiene edad para trabajar
         * – Entre 19 y 50 años el salario es un 5 por ciento más
         * – Entre 51 y 60 años el salario es un 10 por ciento más
         * – Si es mayor de 60 el salario es un 15 por ciento más
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        System.out.println("Introduce tu salario:");
        double salario = sc.nextDouble();

        if (edad < 16) {
            System.out.println(nombre + ", no tienes edad para trabajar.");
        } else if (edad >= 19 && edad <= 50) {
            salario += salario * 0.05;
            System.out.println("Tu salario con el aumento es: " + salario);
        } else if (edad >= 51 && edad <= 60) {
            salario += salario * 0.10;
            System.out.println("Tu salario con el aumento es: " + salario);
        } else if (edad > 60) {
            salario += salario * 0.15;
            System.out.println("Tu salario con el aumento es: " + salario);
        } else {
            System.out.println("Tu salario es: " + salario);
        }
    }
}

package ejercicios.control_de_flujo;

import java.util.Scanner;

/**
 * Ejercicio 5: Realiza un programa que contenga un menú, de forma que muestre
 * las cuatro operaciones
 * matemáticas básicas: sumar, restar, multiplicar y dividir. Se le debe
 * solicitar dos números al
 * usuario y la opción a aplicar entre esos dos números. Muestra el resultado en
 * función de la opción seleccionada.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}

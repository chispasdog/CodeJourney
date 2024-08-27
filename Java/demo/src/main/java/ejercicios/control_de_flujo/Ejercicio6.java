package ejercicios.control_de_flujo;

import java.util.Scanner;

/**
 * Ejercicio 6: Crea un menú con estas opciones:
 * 1. Cálculo del área de un rectángulo.
 * 2. Cálculo del área de un círculo.
 * 3. Cálculo del área de un triángulo.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Cálculo del área de un rectángulo.");
        System.out.println("2. Cálculo del área de un círculo.");
        System.out.println("3. Cálculo del área de un triángulo.");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Área del rectángulo: " + (base * altura));
                break;
            case 2:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                System.out.println("Área del círculo: " + (Math.PI * radio * radio));
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                altura = scanner.nextDouble();
                System.out.println("Área del triángulo: " + (0.5 * base * altura));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}

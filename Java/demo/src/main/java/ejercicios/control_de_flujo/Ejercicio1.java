package ejercicios.control_de_flujo;

import java.util.Scanner;

/**
 * Ejercicio 1
 * Haz una aplicación que calcule el área de un círculo(pi*R^2). El radio se
 * pedirá por teclado.
 * Usa la constante PI y el método pow de Math.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio al usuario
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}

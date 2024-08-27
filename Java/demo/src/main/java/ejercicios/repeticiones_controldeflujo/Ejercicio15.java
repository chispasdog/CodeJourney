package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

/**
 * Ejercicio 15:
 * Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes
 * pedir las
 * variables a, b y c por teclado y comprobar antes que el discriminante
 * (operación en la raíz
 * cuadrada). Para la raíz cuadrada usa el método sqrt de Math. Te recomiendo
 * que uses
 * mensajes de traza.
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando los coeficientes a, b y c
        System.out.println("Introduce el valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Introduce el valor de b:");
        double b = scanner.nextDouble();

        System.out.println("Introduce el valor de c:");
        double c = scanner.nextDouble();

        // Calculando el discriminante
        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            // Dos soluciones reales distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones de la ecuación son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real
            double x = -b / (2 * a);
            System.out.println("La solución de la ecuación es x = " + x);
        } else {
            // Soluciones complejas (no reales)
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}

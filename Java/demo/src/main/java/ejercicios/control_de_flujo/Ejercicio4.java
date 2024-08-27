package ejercicios.control_de_flujo;

import java.util.Scanner;

/**
 * Ejercicio 4
 * Lee un número por teclado que pida el precio de un producto (puede tener
 * decimales) y
 * calcule el precio final con IVA. El IVA será una constante que será del 21%.
 */
public class Ejercicio4 {

    private static final double IVA = 0.21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio del producto al usuario
        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        // Calcular el precio final con IVA
        double precioFinal = precio + (precio * IVA);

        // Mostrar el resultado
        System.out.println("El precio final del producto con IVA es: " + precioFinal);
    }
}

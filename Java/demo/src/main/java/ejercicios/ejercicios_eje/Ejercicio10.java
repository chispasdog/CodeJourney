package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        String cadena = Integer.toString(numero);
        String invertida = new StringBuilder(cadena).reverse().toString();

        if (cadena.equals(invertida)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }
    }
}

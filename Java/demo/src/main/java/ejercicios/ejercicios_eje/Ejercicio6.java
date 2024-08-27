package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("Introduce el dígito final para filtrar los números: ");
        int digito = sc.nextInt();
        while (digito < 0 || digito > 9) {
            System.out.print("Dígito inválido. Introduce un dígito entre 0 y 9: ");
            digito = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 300) + 1;
            if (array[i] % 10 == digito) {
                System.out.println(array[i]);
            }
        }
    }
}

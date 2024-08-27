package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        rellenarArray(array);
        mostrarArray(array);
    }

    public static void rellenarArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            array[i] = sc.nextInt();
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + array[i]);
        }
    }
}

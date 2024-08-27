package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño de los arrays: ");
        int size = sc.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[size];

        for (int i = 0; i < size; i++) {
            array1[i] = (int) (Math.random() * 100);
            array2[i] = array1[i];
        }

        array3 = multiplicarArrays(array1, array2);

        mostrarArray(array1);
        mostrarArray(array2);
        mostrarArray(array3);
    }

    public static int[] multiplicarArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }

    public static void mostrarArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

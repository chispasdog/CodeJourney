package ejercicios.ejercicios_eje;

import static ejercicios.ejercicios_eje.Ejercicio17.quickSort;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 9, 1, 4, 7, 6 };
        quickSort(array, 0, array.length - 1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para buscar: ");
        int num = sc.nextInt();

        int result = binarySearch(array, 0, array.length - 1, num);

        if (result == -1) {
            System.out.println("El número " + num + " no se encuentra en el array.");
        } else {
            System.out.println("El número " + num + " se encuentra en la posición " + result + ".");
        }
    }

    // Métodos QuickSort ya definidos en el ejercicio 17...

    public static int binarySearch(int[] array, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // Si el elemento está en el medio
            if (array[mid] == x) {
                return mid;
            }

            // Si el elemento es menor que el del medio, buscar en el subarray izquierdo
            if (array[mid] > x) {
                return binarySearch(array, l, mid - 1, x);
            }

            // De lo contrario, buscar en el subarray derecho
            return binarySearch(array, mid + 1, r, x);
        }

        // Elemento no presente en el array
        return -1;
    }
}

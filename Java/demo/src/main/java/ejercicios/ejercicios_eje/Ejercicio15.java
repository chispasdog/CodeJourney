package ejercicios.ejercicios_eje;

import java.util.Arrays;

public class Ejercicio15 {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 9, 1, 4, 7, 6 };
        Arrays.sort(array);

        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}

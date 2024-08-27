package ejercicios.ejercicios_eje;

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 5);

        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}

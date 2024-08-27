package ejercicios.ejercicios_eje;

import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] arrayOriginal = { 1, 2, 3, 4, 5 };
        int[] arrayCopiado = Arrays.copyOf(arrayOriginal, arrayOriginal.length);

        for (int val : arrayCopiado) {
            System.out.print(val + " ");
        }
    }
}

package ejercicios.ejercicios_eje;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] arrayOriginal = { 1, 2, 3, 4, 5 };
        int[] arrayInvertido = new int[5];

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        for (int val : arrayInvertido) {
            System.out.print(val + " ");
        }
    }
}

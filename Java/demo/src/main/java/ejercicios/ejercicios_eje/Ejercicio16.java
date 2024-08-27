package ejercicios.ejercicios_eje;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 9, 1, 4, 7, 6 };
        bubbleSort(array);

        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

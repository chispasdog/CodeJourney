package ejercicios.ejercicios_eje;

public class Ejercicio17 {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 9, 1, 4, 7, 6 };
        quickSort(array, 0, array.length - 1);

        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

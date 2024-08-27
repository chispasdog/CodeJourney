package ejercicios.ejercicios_eje;

public class Ejercicio18 {
    public static void main(String[] args) {
        String[] array = { "banana", "apple", "cherry", "date", "fig" };
        quickSort(array, 0, array.length - 1);

        for (String val : array) {
            System.out.print(val + " ");
        }
    }

    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;

                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

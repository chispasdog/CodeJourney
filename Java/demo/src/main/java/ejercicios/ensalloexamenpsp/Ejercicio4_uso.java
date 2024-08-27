package ejercicios.ensalloexamenpsp;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4_uso {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Ejercicio4_hilo[] hilos = new Ejercicio4_hilo[3];

        // Crear y iniciar hilos
        for (int i = 0; i < 3; i++) {
            int[] array = random.ints(100, 1, 51).toArray();
            hilos[i] = new Ejercicio4_hilo(array);
            hilos[i].start();
        }

        // Esperar a que todos los hilos terminen
        for (Ejercicio4_hilo hilo : hilos) {
            hilo.join();
        }

        // Mostrar máximos ordenados de mayor a menor
        Arrays.stream(hilos)
                .mapToInt(Ejercicio4_hilo::getMaximo)
                .boxed()
                .sorted((a, b) -> b - a)
                .forEach(maximo -> System.out.println("Máximo: " + maximo));

        // Mostrar mínimos ordenados de menor a mayor
        Arrays.stream(hilos)
                .mapToInt(Ejercicio4_hilo::getMinimo)
                .sorted()
                .forEach(minimo -> System.out.println("Mínimo: " + minimo));
    }
}

package ejercicios.examen_psp;

import java.util.Random;

public class UsaHilo {
    public static void main(String[] args) throws InterruptedException {
        final int tamano = 500;
        Random random = new Random();

        // 4 arrays
        double[][] arrays = new double[4][tamano];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < tamano; j++) {
                arrays[i][j] = random.nextDouble() * 100;
            }
        }

        // Crear y ejecutar 4 hilos
        Hilo[] hilos = new Hilo[4];
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Hilo(arrays[i]);
            hilos[i].start();
        }

        for (Hilo hilo : hilos) {
            hilo.join();
        }

        // Mostrar las medias
        for (int i = 0; i < hilos.length; i++) {
            System.out.println("Media del array " + (i + 1) + ": " + hilos[i].getMedia());
        }
    }
}

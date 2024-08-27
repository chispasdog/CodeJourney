package ejercicios.ejercicio_hilo_1;

import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) throws InterruptedException {

        int tamaño_array = 1000;
        int numhilos = 5;
        int numeropartidor = tamaño_array / numhilos; // para sacar la repartcion de 200

        int[] numeros = hacerarray(tamaño_array);

        CalculadorMaximo[] hilos = new CalculadorMaximo[numhilos];

        for (int i = 0; i < numhilos; i++) {
            hilos[i] = new CalculadorMaximo(numeros, i * numeropartidor, (i + 1) * numeropartidor);// +1 en posicion de
                                                                                                   // hilo
            new Thread(hilos[i]).start();
        }

        int maximoFinal = Integer.MIN_VALUE;
        for (int i = 0; i < numhilos; i++) {
            System.out.println("Hilo " + (i + 1) + ": " + hilos[i].getMaximo());
            if (hilos[i].getMaximo() > maximoFinal) {
                maximoFinal = hilos[i].getMaximo();
            }
        }

        System.out.println("Máximo final: " + maximoFinal);
    }

    public static int[] hacerarray(int longitud) {
        int[] array = new int[longitud];
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    public static class CalculadorMaximo implements Runnable {

        private int[] array;
        private int inicio;
        private int fin;
        private int maximo = Integer.MIN_VALUE;
        private final Object lock = new Object();
        private boolean terminado = false;

        public CalculadorMaximo(int[] array, int inicio, int fin) {
            this.array = array;
            this.inicio = inicio;
            this.fin = fin;
        }

        @Override
        public void run() {
            for (int i = inicio; i < fin; i++) {
                if (array[i] > maximo) {
                    maximo = array[i];
                }
            }
            synchronized (lock) {
                terminado = true;
                lock.notify();
            }
        }

        public int getMaximo() {
            return maximo;
        }

        public int[] getArray() {
            return array;
        }

        public void setArray(int[] array) {
            this.array = array;
        }

        public int getInicio() {
            return inicio;
        }

        public void setInicio(int inicio) {
            this.inicio = inicio;
        }

        public int getFin() {
            return fin;
        }

        public void setFin(int fin) {
            this.fin = fin;
        }

        public void setMaximo(int maximo) {
            this.maximo = maximo;
        }

        public Object getLock() {
            return lock;
        }

        public boolean isTerminado() {
            return terminado;
        }

        public void setTerminado(boolean terminado) {
            this.terminado = terminado;
        }
    }
}

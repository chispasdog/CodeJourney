package ejercicios.ejercicio_paco_hilos3;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class LibroConjuros {

    public int energiaconjuro = 0;
    private Random random = new Random();
    private Semaphore semaforoEscritura = new Semaphore(1);
    private Semaphore semaforoLectura = new Semaphore(3);

    public int leerConjuro() throws InterruptedException {
        semaforoLectura.acquire();
        int energia = this.energiaconjuro;
        semaforoLectura.release();
        return energia;
    }

    public void escribirConjuro() {
        try {
            semaforoEscritura.acquire();
            Random rn = new Random();
            energiaconjuro = random.nextInt(5) + 1;

            semaforoEscritura.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}

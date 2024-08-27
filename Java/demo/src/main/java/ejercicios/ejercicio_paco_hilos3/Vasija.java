package ejercicios.ejercicio_paco_hilos3;

import java.util.concurrent.Semaphore;

public class Vasija {

    private static final int capacidad = 5;
    public double contenido = 0;

    private final Semaphore sem = new Semaphore(1);

    public boolean tomarpocima() throws InterruptedException {
        sem.acquire();

        if (contenido >= 0.5) {
            contenido -= 0.5;
            sem.release();
            return true;
        } else {
            sem.release();
            return false;
        }

    }

    public void anadirpocima() throws InterruptedException {

        sem.acquire();

        if (contenido < capacidad) {
            contenido++;
        }

        sem.release();
    }

}

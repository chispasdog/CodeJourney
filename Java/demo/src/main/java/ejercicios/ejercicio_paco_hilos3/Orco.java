package ejercicios.ejercicio_paco_hilos3;

public class Orco implements Runnable {

    Vasija v;

    public Orco(Vasija v) {
        this.v = v;

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                v.anadirpocima();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

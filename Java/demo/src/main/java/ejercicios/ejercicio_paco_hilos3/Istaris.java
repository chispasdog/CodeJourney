package ejercicios.ejercicio_paco_hilos3;

public class Istaris implements Runnable {

    LibroConjuros libro;

    public Istaris(LibroConjuros libro) {
        this.libro = libro;

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                libro.escribirConjuro();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

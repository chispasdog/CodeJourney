package ejercicios.examen_psp;

public class Hilo extends Thread {
    private double[] array;
    private double media;

    public Hilo(double[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        double suma = 0;
        for (double valor : array) {
            suma += valor;
        }
        media = suma / array.length;
    }

    public double getMedia() {
        return media;
    }
}

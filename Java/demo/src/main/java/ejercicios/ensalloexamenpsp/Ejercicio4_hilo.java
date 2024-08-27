package ejercicios.ensalloexamenpsp;

public class Ejercicio4_hilo extends Thread {
    private int[] miArray;
    private int maximo;
    private int minimo;

    public Ejercicio4_hilo(int[] miArray) {
        this.miArray = miArray;
    }

    public void run() {
        maximo = miArray[0];
        minimo = miArray[0];
        for (int valor : miArray) {
            if (valor > maximo)
                maximo = valor;
            if (valor < minimo)
                minimo = valor;
        }
    }

    public int getMaximo() {
        return maximo;
    }

    public int getMinimo() {
        return minimo;
    }
}
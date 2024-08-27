package ejercicios.examen_psp;

public class Hilo2 extends Thread {
    private String texto;

    public Hilo2(String texto) {
        this.texto = texto;
    }

    @Override
    public void run() {
        String[] palabras = texto.split("\\s+");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

package ejercicios.ejercicio_paco_hilos3;

public class Main {
    public static void main(String[] args) {

        LibroConjuros libro = new LibroConjuros();
        Vasija v = new Vasija();
        TomBombadil tom = new TomBombadil();

        Thread orco = new Thread(new Orco(v));
        Thread orco2 = new Thread(new Orco(v));
        Thread istari = new Thread(new Istaris(libro));
        Thread istari2 = new Thread(new Istaris(libro));
        Thread istari3 = new Thread(new Istaris(libro));

        for (int i = 0; i < 10; i++) {

            Guerrero guerrero = new Seguidores_sauron(v, tom);
            new Thread(() -> {
                while (true) {
                    guerrero.obtenerenergia();
                    tom.competir(guerrero);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }

        for (int i = 0; i < 10; i++) {

            Guerrero guerrero = new Seguidores_Iluvatar(libro, tom);
            new Thread(() -> {
                while (true) {
                    guerrero.obtenerenergia();
                    tom.competir(guerrero);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }

    }

}
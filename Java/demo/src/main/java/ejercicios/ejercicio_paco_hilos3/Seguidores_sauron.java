package ejercicios.ejercicio_paco_hilos3;

public class Seguidores_sauron extends Guerrero {

    public Vasija v;
    public TomBombadil tom;

    public Seguidores_sauron(Vasija v, TomBombadil tom) {
        this.v = v;
        this.tom = tom;
    }

    @Override
    public void obtenerenergia() {
        try {
            if (v.tomarpocima()) {
                energia += 3;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(2000);

                obtenerenergia();
                cogerarmas();
                luchar(tom);
                devolverarmas();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}

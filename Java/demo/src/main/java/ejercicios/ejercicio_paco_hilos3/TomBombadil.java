package ejercicios.ejercicio_paco_hilos3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class TomBombadil {

    private Queue<Guerrero> seguidoressauron = new LinkedList<>();
    private Queue<Guerrero> seguidoresIluvatar = new LinkedList<>();

    Semaphore comparacion = new Semaphore(1);

    public void competir(Guerrero guerrero) {
        try {
            comparacion.acquire();
            if (guerrero instanceof Seguidores_sauron) {
                seguidoressauron.add(guerrero);

            } else {
                seguidoresIluvatar.add(guerrero);

            }
            if (seguidoressauron.size() > 0 && seguidoresIluvatar.size() > 0) {
                Guerrero gsauron = seguidoressauron.poll();
                Guerrero giluvatar = seguidoresIluvatar.poll();
                if (gsauron.energia > giluvatar.energia) {
                    giluvatar.perder();
                    System.out.println("a ganado sauron");
                } else {
                    gsauron.perder();
                    System.out.println("a ganado iluvatar");

                }

            }
            comparacion.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

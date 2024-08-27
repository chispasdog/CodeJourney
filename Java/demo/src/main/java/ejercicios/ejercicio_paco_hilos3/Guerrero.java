package ejercicios.ejercicio_paco_hilos3;

import java.util.concurrent.Semaphore;

public abstract class Guerrero implements Runnable {

     public int energia = 0;

     Semaphore espada = new Semaphore(3);
     Semaphore escudo = new Semaphore(3);
     Semaphore daga = new Semaphore(3);

     public abstract void obtenerenergia();

     public void cogerarmas() throws InterruptedException {
          espada.acquire();
          escudo.acquire();
          daga.acquire();

     }

     public void devolverarmas() throws InterruptedException {
          espada.release();
          escudo.release();
          daga.release();
     }

     public void perder() {
          this.energia = 0;
     }

     public void luchar(TomBombadil tom) {
          tom.competir(this);
     }

}

package ejercicios.ejercicio_hilos_2;

public class Consumidor implements Runnable {
    private Almacen almacen;

    public Consumidor(Almacen almacen) {

        this.almacen = almacen;
    }

    @Override
    public void run() {

        try {

            Producto p = almacen.consumir();
            Thread.sleep(500);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

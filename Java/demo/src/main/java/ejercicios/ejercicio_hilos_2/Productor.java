package ejercicios.ejercicio_hilos_2;

public class Productor implements Runnable {

    private Almacen almacen;

    public Productor(Almacen almacen) {
        this.almacen = almacen;

    }

    @Override
    public void run() {

        try {
            while (true) {

                Producto l = new Producto(1, "Lechuga");
                Producto c = new Producto(1, "cebolla");
                almacen.producir(l);
                almacen.producir(c);
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

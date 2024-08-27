package ejercicios.ejercicio_hilos_2;

import java.util.ArrayList;

public class Almacen {

    private static ArrayList<Producto> productos = new ArrayList<>();

    public synchronized void producir(Producto p) {
        productos.add(p);
        System.out.println(productos);
        notifyAll();
    }

    public synchronized Producto consumir() throws InterruptedException {
        while (productos.isEmpty()) {
            wait();
        }
        System.out.println(productos);
        return productos.remove(0);

    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

}

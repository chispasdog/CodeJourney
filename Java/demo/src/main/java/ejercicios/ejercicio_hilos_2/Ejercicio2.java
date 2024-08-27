package ejercicios.ejercicio_hilos_2;

public class Ejercicio2 {

    public static void main(String[] args) {

        Almacen almicen = new Almacen();

        Thread p1 = new Thread(new Productor(almicen));
        Thread p2 = new Thread(new Productor(almicen));
        Thread c1 = new Thread(new Consumidor(almicen));
        p1.start();
        p2.start();
        c1.start();

    }

}

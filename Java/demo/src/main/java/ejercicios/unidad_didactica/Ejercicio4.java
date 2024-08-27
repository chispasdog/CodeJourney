package ejercicios.unidad_didactica;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4Electrodomestico[] electrodomesticos = new Ejercicio4Electrodomestico[10];

        // Inicializando algunos electrodomésticos para pruebas
        electrodomesticos[0] = new Ejercicio4Electrodomestico();
        electrodomesticos[1] = new Ejercicio4Lavadora(150, 20, 40);
        electrodomesticos[2] = new Ejercicio4Television(250, 50, 42, true);
        electrodomesticos[3] = new Ejercicio4Television();
        electrodomesticos[4] = new Ejercicio4Lavadora();
        electrodomesticos[5] = new Ejercicio4Lavadora(300, 70, 15);
        electrodomesticos[6] = new Ejercicio4Electrodomestico(400, 80, 'A', "negro");
        electrodomesticos[7] = new Ejercicio4Television(450, 30, 50, false);
        electrodomesticos[8] = new Ejercicio4Lavadora(500, 10, 50);
        electrodomesticos[9] = new Ejercicio4Electrodomestico(200, 40, 'E', "azul");

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Ejercicio4Electrodomestico e : electrodomesticos) {
            if (e instanceof Ejercicio4Lavadora) {
                precioTotalLavadoras += e.precioFinal();
            } else if (e instanceof Ejercicio4Television) {
                precioTotalTelevisores += e.precioFinal();
            }
            precioTotalElectrodomesticos += e.precioFinal();
        }

        System.out.println("Precio total de Electrodomésticos: " + precioTotalElectrodomesticos + "€");
        System.out.println("Precio total de Lavadoras: " + precioTotalLavadoras + "€");
        System.out.println("Precio total de Televisores: " + precioTotalTelevisores + "€");
    }
}

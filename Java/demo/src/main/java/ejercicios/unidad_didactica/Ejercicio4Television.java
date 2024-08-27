package ejercicios.unidad_didactica;

public class Ejercicio4Television extends Ejercicio4Electrodomestico {
    // Constantes
    private static final int RESOLUCION_DEFECTO = 20;
    private static final boolean SINTONIZADOR_DEFECTO = false;

    // Atributos
    private int resolucion;
    private boolean sintonizadorTDT;

    // Constructor por defecto
    public Ejercicio4Television() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, RESOLUCION_DEFECTO, SINTONIZADOR_DEFECTO);
    }

    // Constructor con precio y peso
    public Ejercicio4Television(double precioBase, double peso) {
        this(precioBase, peso, RESOLUCION_DEFECTO, SINTONIZADOR_DEFECTO);
    }

    // Constructor con resolución, sintonizador y el resto de atributos heredados
    public Ejercicio4Television(double precioBase, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Getters
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // Método para calcular precio final
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) {
            precio *= 1.3;
        }
        if (sintonizadorTDT) {
            precio += 50;
        }
        return precio;
    }
}

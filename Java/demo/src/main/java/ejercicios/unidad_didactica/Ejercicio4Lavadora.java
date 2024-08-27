package ejercicios.unidad_didactica;

public class Ejercicio4Lavadora extends Ejercicio4Electrodomestico {
    // Constantes
    private static final double CARGA_DEFECTO = 5.0;

    // Atributo
    private double carga;

    // Constructor por defecto
    public Ejercicio4Lavadora() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CARGA_DEFECTO);
    }

    // Constructor con precio y peso
    public Ejercicio4Lavadora(double precioBase, double peso) {
        this(precioBase, peso, CARGA_DEFECTO);
    }

    // Constructor con carga y el resto de atributos heredados
    public Ejercicio4Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    // Getter
    public double getCarga() {
        return carga;
    }

    // Método para calcular precio final
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30) {
            precio += 50;
        }
        return precio;
    }
}

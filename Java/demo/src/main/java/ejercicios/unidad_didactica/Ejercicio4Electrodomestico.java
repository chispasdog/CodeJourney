package ejercicios.unidad_didactica;

public class Ejercicio4Electrodomestico {
    // Constantes
    protected static final String COLOR_DEFECTO = "blanco";
    protected static final char CONSUMO_DEFECTO = 'F';
    protected static final double PRECIO_BASE_DEFECTO = 100.0;
    protected static final double PESO_DEFECTO = 5.0;

    // Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constructor por defecto
    public Ejercicio4Electrodomestico() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_DEFECTO, COLOR_DEFECTO);
    }

    // Constructor con precio y peso
    public Ejercicio4Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_DEFECTO, COLOR_DEFECTO);
    }

    // Constructor con todos los atributos
    public Ejercicio4Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.color = comprobarColor(color);
    }

    // Getters
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    // Métodos privados para comprobación
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra < 'A' || letra > 'F') {
            return CONSUMO_DEFECTO;
        }
        return letra;
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
        for (String c : colores) {
            if (c.equals(color)) {
                return color;
            }
        }
        return COLOR_DEFECTO;
    }

    // Método para calcular precio final
    public double precioFinal() {
        double precio = precioBase;
        switch (consumoEnergetico) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
        }
        if (peso <= 19) {
            precio += 10;
        } else if (peso <= 49) {
            precio += 50;
        } else if (peso <= 79) {
            precio += 80;
        } else {
            precio += 100;
        }
        return precio;
    }
}

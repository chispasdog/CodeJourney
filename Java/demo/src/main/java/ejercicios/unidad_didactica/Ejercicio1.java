package ejercicios.unidad_didactica;

/**
 * Ejercicio 1: Clase Contador
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador(5);
        Contador contador3 = new Contador(contador2);

        contador1.incrementar();
        contador2.decrementar();
        contador3.incrementar();

        System.out.println("Valor de contador1: " + contador1.getCont());
        System.out.println("Valor de contador2: " + contador2.getCont());
        System.out.println("Valor de contador3: " + contador3.getCont());
    }
}

class Contador {
    private int cont;

    // Constructor por defecto
    public Contador() {
        this.cont = 0;
    }

    // Constructor con parámetros
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    // Constructor copia
    public Contador(Contador contador) {
        this.cont = contador.cont;
    }

    // Getters y Setters
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    // Método para incrementar el contador
    public void incrementar() {
        cont++;
    }

    // Método para decrementar el contador
    public void decrementar() {
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}

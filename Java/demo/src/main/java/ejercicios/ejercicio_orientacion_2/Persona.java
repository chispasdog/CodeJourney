package ejercicios.ejercicio_orientacion_2;

// Clase Persona necesaria para el atributo cliente en Cuenta.
class Persona {
    private String nombre;
    private String apellidos;
    private String NIF;

    // Constructor, getters y setters no se muestran por brevedad pero deben ser
    // implementados.
}

/**
 * Ejercicio 1:
 * Clase abstracta Cuenta.
 */
abstract class Cuenta {
    protected long numerocuenta;
    protected double saldo;
    protected Persona cliente;

    public Cuenta(Persona cliente, long numerocuenta) {
        this.cliente = cliente;
        this.numerocuenta = numerocuenta;
        this.saldo = 0.0;
    }

    // Getters y setters...

    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    public abstract void retirar(double cantidad);

    public abstract void actualizarSaldo();
}

/**
 * Subclase CuentaCorriente.
 */
class CuentaCorriente extends Cuenta {
    private static final double INTERES = 1.5 / 100;

    public CuentaCorriente(Persona cliente, long numerocuenta) {
        super(cliente, numerocuenta);
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        }
    }

    @Override
    public void actualizarSaldo() {
        saldo += saldo * INTERES;
    }

    @Override
    public String toString() {
        return "CuentaCorriente [cliente=" + cliente + ", numerocuenta=" + numerocuenta + ", saldo=" + saldo + "]";
    }
}

/**
 * Subclase CuentaAhorro.
 */
class CuentaAhorro extends Cuenta {
    private double interes;
    private static final double SALDO_MINIMO = 100.0;

    public CuentaAhorro(Persona cliente, long numerocuenta, double interes) {
        super(cliente, numerocuenta);
        this.interes = interes;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo - cantidad >= SALDO_MINIMO) {
            saldo -= cantidad;
        }
    }

    @Override
    public void actualizarSaldo() {
        saldo += saldo * interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaAhorro [cliente=" + cliente + ", numerocuenta=" + numerocuenta + ", saldo=" + saldo + ", interes="
                + interes + "]";
    }
}

// Código para probar las cuentas se debe agregar en un método main en una clase
// separada.

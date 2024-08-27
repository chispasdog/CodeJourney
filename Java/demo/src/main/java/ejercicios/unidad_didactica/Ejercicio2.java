package ejercicios.unidad_didactica;

import java.util.Scanner;

/**
 * Ejercicio 2: Clase Cuenta y menú de operaciones
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = null;

        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Mostrar saldo cuenta");
            System.out.println("3. Hacer ingreso en cuenta");
            System.out.println("4. Hacer transferencia");
            System.out.println("5. Mostrar datos de la cuenta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce nombre del cliente: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce número de cuenta: ");
                    String numero = scanner.next();
                    System.out.print("Introduce tipo de interés: ");
                    double interes = scanner.nextDouble();
                    System.out.print("Introduce saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    cuenta = new Cuenta(nombre, numero, interes, saldo);
                    break;
                case 2:
                    if (cuenta != null) {
                        System.out.println("Saldo actual: " + cuenta.getSaldo());
                    } else {
                        System.out.println("No se ha creado ninguna cuenta.");
                    }
                    break;
                case 3:
                    if (cuenta != null) {
                        System.out.print("Introduce cantidad a ingresar: ");
                        double ingreso = scanner.nextDouble();
                        if (cuenta.ingreso(ingreso)) {
                            System.out.println("Ingreso realizado con éxito.");
                        } else {
                            System.out.println("Cantidad inválida.");
                        }
                    } else {
                        System.out.println("No se ha creado ninguna cuenta.");
                    }
                    break;
                case 4:
                    if (cuenta != null) {
                        System.out.print("Introduce cantidad a transferir: ");
                        double cantidad = scanner.nextDouble();
                        System.out.print("Introduce número de cuenta destino: ");
                        String cuentaDestino = scanner.next();
                        Cuenta cuenta2 = new Cuenta(); // Simulando cuenta destino
                        if (cuenta.transferencia(cuenta2, cantidad)) {
                            System.out.println("Transferencia realizada con éxito.");
                        } else {
                            System.out.println("No hay saldo suficiente o cantidad inválida.");
                        }
                    } else {
                        System.out.println("No se ha creado ninguna cuenta.");
                    }
                    break;
                case 5:
                    if (cuenta != null) {
                        System.out.println(cuenta.toString());
                    } else {
                        System.out.println("No se ha creado ninguna cuenta.");
                    }
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}

class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    // Constructor por defecto
    public Cuenta() {
        this.nombreCliente = "";
        this.numeroCuenta = "";
        this.tipoInteres = 0.0;
        this.saldo = 0.0;
    }

    // Constructor con todos los parámetros
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    // Constructor copia
    public Cuenta(Cuenta cuenta) {
        this.nombreCliente = cuenta.nombreCliente;
        this.numeroCuenta = cuenta.numeroCuenta;
        this.tipoInteres = cuenta.tipoInteres;
        this.saldo = cuenta.saldo;
    }

    // Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para hacer ingresos
    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return true;
        }
        return false;
    }

    // Método para hacer reintegros
    public boolean reintegro(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    // Método para hacer transferencias
    public boolean transferencia(Cuenta cuentaDestino, double cantidad) {
        if (this.reintegro(cantidad)) {
            cuentaDestino.ingreso(cantidad);
            return true;
        }
        return false;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", tipoInteres=" + tipoInteres +
                ", saldo=" + saldo +
                '}';
    }
}

package ejercicios.pildorasinformaticas;

public class Persona {
    public String nombre;
    public String apellido;

    public String direccion;

    private static int contador = 0;

    public Persona(String nombre, String apellido, String direccion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        contador++;

    }

    public void getDireccion() {
        System.out.println(direccion);
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

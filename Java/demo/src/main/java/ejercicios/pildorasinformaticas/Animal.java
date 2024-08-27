package ejercicios.pildorasinformaticas;

public abstract class Animal {

    String nombre;
    int edad_devida;

    public Animal(String nombre, int edad_devida) {
        this.edad_devida = edad_devida;
        this.nombre = nombre;
    }

    public abstract void getnombre();

    public void dormir() {
        System.out.println("esta durmiendo");
    }

}

package ejercicios.ejercicio_biblioteca_n;

import java.util.ArrayList;

public class Usuario extends Persona {

    public static int id;
    public ArrayList<Libros> librosprestados;

    public Usuario(String nombre) {
        super(nombre);
        this.librosprestados = new ArrayList<>();
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Usuario.id = id;
    }

    public ArrayList<Libros> getLibrosprestados() {
        return librosprestados;
    }

    public void setLibrosprestados(ArrayList<Libros> librosprestados) {
        this.librosprestados = librosprestados;

    }

    public void tomarprestado(Libros libro) {
        if (libro.prestarlibro()) {
            librosprestados.add(libro);

        }

    }

    public void devolver(Libros libro) {
        if (librosprestados.contains(libro) && libro.devolverlibro()) {
            librosprestados.remove(libro);
        }
    }

}

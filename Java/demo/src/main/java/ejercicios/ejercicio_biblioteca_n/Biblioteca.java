package ejercicios.ejercicio_biblioteca_n;

import java.util.ArrayList;

public class Biblioteca {
    public String nombre;
    public String direccion;
    public ArrayList<Libros> todos_los_libros;
    public ArrayList<Usuario> todos_los_usuarios;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.todos_los_usuarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Usuario> getTodos_los_usuarios() {
        return todos_los_usuarios;
    }

    public void setTodos_los_usuarios(ArrayList<Usuario> todos_los_usuarios) {
        this.todos_los_usuarios = todos_los_usuarios;
    }

    public void crearusuario(Usuario usuario) {
        todos_los_usuarios.add(usuario);

    }

    public void crearlibro(Libros libro) {
        todos_los_libros.add(libro);

    }

    public Usuario buscarusuario(String nombre) {
        for (Usuario usu : todos_los_usuarios) {
            if (usu.getNombre().equalsIgnoreCase(nombre)) {
                return usu;
            }

        }
        return null;
    }

    public Libros buscarlibro(String nombre) {
        for (Libros libr : todos_los_libros) {
            if (libr.getTitulo().equalsIgnoreCase(nombre)) {
                return libr;
            }

        }
        return null;
    }

    public boolean realizarprestamos(String nombre, String titulo) {
        Usuario usu = buscarusuario(nombre);
        Libros libr = buscarlibro(titulo);
        if (usu != null && libr != null) {
            usu.tomarprestado(libr);
            return true;
        }
        return false;
    }

    public boolean recibirdevolucion(String nombre, String titulo) {
        Usuario usu = buscarusuario(nombre);
        Libros libr = buscarlibro(titulo);
        if (usu != null && libr != null) {
            usu.devolver(libr);
            return true;
        }
        return false;
    }

    public ArrayList<Libros> getTodos_los_libros() {
        return todos_los_libros;
    }

}

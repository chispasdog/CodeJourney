package ejercicios.unidad_didactica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 3: Clase Libro y menú de operaciones
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> biblioteca = new ArrayList<>();
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserción de libros");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Realizar préstamo");
            System.out.println("4. Realizar devolución");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el título del libro: ");
                    String titulo = scanner.next();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.next();
                    System.out.print("Introduce el número de ejemplares: ");
                    int ejemplares = scanner.nextInt();
                    biblioteca.add(new Libro(titulo, autor, ejemplares, 0));
                    break;
                case 2:
                    for (Libro libro : biblioteca) {
                        System.out.println(libro);
                    }
                    break;
                case 3:
                    System.out.print("Introduce el título del libro a prestar: ");
                    String tituloPrestamo = scanner.next();
                    for (Libro libro : biblioteca) {
                        if (libro.getTitulo().equalsIgnoreCase(tituloPrestamo)) {
                            if (libro.prestamo()) {
                                System.out.println("Préstamo realizado con éxito.");
                            } else {
                                System.out.println("No hay ejemplares disponibles.");
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Introduce el título del libro a devolver: ");
                    String tituloDevolucion = scanner.next();
                    for (Libro libro : biblioteca) {
                        if (libro.getTitulo().equalsIgnoreCase(tituloDevolucion)) {
                            if (libro.devolucion()) {
                                System.out.println("Devolución realizada con éxito.");
                            } else {
                                System.out.println("No hay ejemplares prestados.");
                            }
                            break;
                        }
                    }
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    // Constructor por defecto
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Método para realizar préstamos
    public boolean prestamo() {
        if (numEjemplares > numEjemplaresPrestados) {
            numEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    // Método para realizar devoluciones
    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", numEjemplaresPrestados=" + numEjemplaresPrestados +
                '}';
    }
}

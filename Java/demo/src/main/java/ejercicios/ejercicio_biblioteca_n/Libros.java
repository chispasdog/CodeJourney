package ejercicios.ejercicio_biblioteca_n;

import java.text.DateFormat;
import java.util.Date;

public class Libros {

    public String titulo;
    public Autor autor;
    public int año_pulicacion;
    public int numero_de_copias;
    public int numero_de_copias_prestadas;

    public Libros(String titulo, Autor autor, int año_pulicacion, int numero_de_copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.año_pulicacion = año_pulicacion;
        this.numero_de_copias = numero_de_copias;
        this.numero_de_copias_prestadas = 0;
    }

    public boolean prestarlibro() {
        if (numero_de_copias_prestadas < numero_de_copias) {
            numero_de_copias_prestadas++;
            return true;

        } else {
            return false;
        }
    }

    public boolean devolverlibro() {
        if (numero_de_copias_prestadas > 0) {
            numero_de_copias_prestadas--;
            return true;
        } else {
            return false;
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño_pulicacion() {
        return año_pulicacion;
    }

    public void setAño_pulicacion(int año_pulicacion) {
        this.año_pulicacion = año_pulicacion;
    }

    public int getNumero_de_copias() {
        return numero_de_copias;
    }

    public void setNumero_de_copias(int numero_de_copias) {
        this.numero_de_copias = numero_de_copias;
    }

    public int getNumero_de_copias_prestadas() {
        return numero_de_copias_prestadas;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", año_pulicacion=" + año_pulicacion +
                ", numero_de_copias=" + numero_de_copias +
                ", numero_de_copias_prestadas=" + numero_de_copias_prestadas +
                '}';
    }

}

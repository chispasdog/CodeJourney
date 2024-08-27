package ejercicios.ejercicio_biblioteca_n;

import java.text.DateFormat;
import java.util.Date;

public class Autor extends Persona {
    public Paises pais;
    public Date año_nacimiento_autor;

    public Autor(String nombre, Paises pais, Date año_nacimiento_autor) {
        super(nombre);
        this.pais = pais;
        this.año_nacimiento_autor = año_nacimiento_autor;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public Date getAño_nacimiento_autor() {
        return año_nacimiento_autor;
    }

    public void setAño_nacimiento_autor(Date año_nacimiento_autor) {
        this.año_nacimiento_autor = año_nacimiento_autor;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "pais=" + pais +
                ", año_nacimiento_autor=" + año_nacimiento_autor +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

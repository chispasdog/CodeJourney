package ejercicios.ejercicio_de_acceso_datos;

import java.io.*;

public class AprendiendoFile {
    public static void main(String[] args) {

        File archivo = new File("ejemplo archivo");

        // esto te dice la ruta
        System.out.println(archivo.getAbsolutePath());
        // esto te dice si existe aqui mismo
        System.out.println(archivo.exists());
    }
}

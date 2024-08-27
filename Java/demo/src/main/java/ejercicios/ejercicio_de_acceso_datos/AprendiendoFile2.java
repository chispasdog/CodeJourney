package ejercicios.ejercicio_de_acceso_datos;

import java.io.File;

public class AprendiendoFile2 {

    public static void main(String[] args) {
        // Definimos la ruta del directorio que queremos listar
        String ruta = "/ruta/del/directorio"; // Modifica esto con la ruta que desees

        // Creamos una instancia de File con esa ruta
        File directorio = new File(ruta);

        // Verificamos que la ruta corresponde a un directorio
        if (directorio.isDirectory()) {
            // Usamos el método .list() para obtener los nombres de todos los archivos y
            // directorios en la ruta
            String[] elementos = directorio.list();

            // Verificamos que la ruta no esté vacía
            if (elementos != null) {
                // Mostramos cada elemento por pantalla
                for (String elemento : elementos) {
                    System.out.println(elemento);
                }
            } else {
                System.out.println("El directorio está vacío o ocurrió un error al listar los elementos.");
            }
        } else {
            System.out.println("La ruta proporcionada no corresponde a un directorio.");
        }
    }

}

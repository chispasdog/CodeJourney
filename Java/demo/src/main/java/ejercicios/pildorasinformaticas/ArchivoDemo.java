package ejercicios.pildorasinformaticas;

import java.io.*;

public class ArchivoDemo {

    // Método para escribir en un archivo
    public void escribirArchivo(String nombreArchivo, String contenido) {
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(contenido);

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer un archivo
    public String leerArchivo(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();

        try {
            File file = new File(nombreArchivo);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return contenido.toString();
    }

    public static void main(String[] args) {
        ArchivoDemo demo = new ArchivoDemo();

        // Escribir en un archivo
        demo.escribirArchivo("test.txt", "Hola, esto es una prueba.");

        // Leer el archivo
        String contenido = demo.leerArchivo("test.txt");
        System.out.println("Contenido del archivo:\n" + contenido);
    }
}

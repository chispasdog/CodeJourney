package ejercicios.ejercicio_de_acceso_datos;

import java.io.*;

public class Insetpro {
    private static final String FILE_PATH = "C:\\Users\\pablo\\Desktop\\github\\myjava\\accesodedatos\\3propie.txt";

    public static void writeP(String name, String deporte, String serie) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write("nombre=" + name + "\n");
            writer.write("deporte=" + deporte + "\n");
            writer.write("serie=" + serie + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readP() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeP("Juan", "Fútbol", "Serie A");

        readP();
    }

}
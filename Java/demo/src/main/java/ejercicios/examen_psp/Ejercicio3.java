package ejercicios.examen_psp;

import javax.swing.*;
import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {

            Process proceso = Runtime.getRuntime().exec("cmd /c dir");
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

            File archivo = new File("muestra.txt");
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));

            StringBuilder constructor = new StringBuilder();
            String linea;

            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();

                constructor.append(linea);
                constructor.append("\n");
            }

            escritor.close();

            JOptionPane.showMessageDialog(null, constructor.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

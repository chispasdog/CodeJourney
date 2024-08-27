package ejercicios.ensalloexamenpsp;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    /*
     * 2. (1 punto) Crea un programa que ejecute el comando DIR con el parámetro /D
     * y que
     * muestre su resultado en la pantalla.
     *
     * 
     */

    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("cmd /c dir /D");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }

            JOptionPane.showMessageDialog(null, builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

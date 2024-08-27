package ejercicios.examen_psp;

import javax.swing.*;
import java.io.IOException;

//Crea una aplicación que abra 2 Bloc de notas y 2 Pain
public class ejercicio1 {
    public static void main(String[] args) {
        try {
            Process blocDeNotas = Runtime.getRuntime().exec("notepad.exe");
            Process blocDeNotas2 = Runtime.getRuntime().exec("notepad.exe");
            Process paint = Runtime.getRuntime().exec("mspaint.exe");
            Process paint2 = Runtime.getRuntime().exec("mspaint.exe");

            blocDeNotas.waitFor();
            paint.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package ejercicios.Practica_procesosenjava;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Metercoamndo {

    private static void guardarelcomando(String commando) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", commando);
            pb.inheritIO();
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }

    public static void comandodir(String commando) {
        guardarelcomando(commando);
    }

    public static void comandoSysteminfo(String commando) {
        guardarelcomando(commando);
    }

    public static void comandoipconfig(String commando) {
        guardarelcomando(commando);
    }

}

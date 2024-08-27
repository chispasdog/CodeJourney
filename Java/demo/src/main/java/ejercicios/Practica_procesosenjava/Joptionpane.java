package ejercicios.Practica_procesosenjava;

import javax.swing.*;

import static Practica_procesosenjava.Metercoamndo.*;

public class Joptionpane {

    public static void joption() {
        String commando;
        String[] botones = { "Systeminfo", "dir", "ipconfig", "Salir" };
        int opcion = JOptionPane.showOptionDialog(null, "eligue tu comando", "elige", 0, JOptionPane.QUESTION_MESSAGE,
                null, botones, botones[0]);

        commando = "";

        switch (opcion) {
            case 0:
                commando = "systeminfo";
                comandoSysteminfo(commando);

                break;
            case 1:
                commando = "dir";
                comandodir(commando);
                break;
            case 2:
                commando = "ipconfig";
                comandoipconfig(commando);
                break;
            case 3:
            default:
                System.exit(0);
        }

    }

}

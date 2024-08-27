package ejercicios.ensalloexamenpsp;

import javax.swing.JOptionPane;
import java.io.IOException;

/*1. (1 punto) Crea un programa que:
        a. Abra un proceso del Bloc de notas y otro de Paint
        b. Espere hasta que terminen ambos de ejecutarse
        c. Después muestre un mensaje en pantalla con el mensaje "Ya han terminado
        ellos y ahora termino yo".

*/

public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            Process blocDeNotas = Runtime.getRuntime().exec("notepad.exe");
            Process paint = Runtime.getRuntime().exec("mspaint.exe");

            blocDeNotas.waitFor();
            paint.waitFor();

            JOptionPane.showMessageDialog(null, "Ya han terminado ellos y ahora termino yo");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

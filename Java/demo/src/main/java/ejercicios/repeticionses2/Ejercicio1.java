package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Escribe una aplicación con un String que contenga una contraseña cualquiera.
         * Después se te pedirá que introduzcas la contraseña, con 3 intentos.
         * Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo
         * “Enhorabuena”.
         * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque
         * le queden intentos).
         */

        String password = "secreto";
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        boolean acertado = false;

        while (intentos > 0 && !acertado) {
            System.out.println("Introduce la contraseña:");
            String input = sc.nextLine();

            if (input.equals(password)) {
                acertado = true;
                System.out.println("Enhorabuena");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Contraseña incorrecta. Tienes " + intentos + " intentos restantes.");
                }
            }
        }

        if (!acertado) {
            System.out.println("Has agotado tus intentos.");
        }
    }
}

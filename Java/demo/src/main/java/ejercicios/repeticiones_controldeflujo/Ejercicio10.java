package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        /**
         * Ejercicio 10
         * Crea el juego de adivinar el número. El usuario deberá intentar adivinar un
         * número generado
         * aleatoriamente. Tendremos los siguientes casos:
         *  Si se introduce un número menor que el número a adivinar → Avisamos al
         * usuario de
         * que el número que queremos adivinar es mayor.
         *  Si se introduce un número mayor → Avisamos de que el número a adivinar es
         * menor.
         *  Si acertamos el número → Avisamos de que se ha acertado el número y
         * finalizamos el
         * programa.
         * El juego debe acabar cuando el usuario acierte el número.
         */

        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1; // Número entre 1 y 100
        Scanner scanner = new Scanner(System.in);
        int intento;

        do {
            System.out.print("Introduce un número entre 1 y 100: ");
            intento = scanner.nextInt();

            if (intento < numeroAdivinar) {
                System.out.println("El número que queremos adivinar es mayor.");
            } else if (intento > numeroAdivinar) {
                System.out.println("El número a adivinar es menor.");
            } else {
                System.out.println("¡Has acertado el número!");
            }
        } while (intento != numeroAdivinar);

        scanner.close();
    }
}

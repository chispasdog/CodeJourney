package ejercicios.repeticionses2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        /** Juego de piedra, papel, tijera. */

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Elige: (1) Piedra, (2) Papel, (3) Tijera");
        int eleccion = sc.nextInt();

        int eleccionComputadora = rand.nextInt(3) + 1;

        if (eleccion == eleccionComputadora) {
            System.out.println("Empate!");
        } else if ((eleccion == 1 && eleccionComputadora == 3) || (eleccion == 2 && eleccionComputadora == 1)
                || (eleccion == 3 && eleccionComputadora == 2)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }
    }
}

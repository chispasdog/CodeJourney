package ejercicios.control_de_if;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
         * Crea el juego de piedra, papel o tijeras usando Scanner para leer un valor
         * por teclado y
         * Random para generar la opción aleatoria elegida por el rival (la máquina).
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige: piedra, papel o tijeras:");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        String[] opciones = { "piedra", "papel", "tijeras" };
        String eleccionMaquina = opciones[random.nextInt(3)];

        System.out.println("La máquina eligió: " + eleccionMaquina);

        if (eleccionUsuario.equals(eleccionMaquina)) {
            System.out.println("Empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionMaquina.equals("tijeras"))
                || (eleccionUsuario.equals("papel") && eleccionMaquina.equals("piedra"))
                || (eleccionUsuario.equals("tijeras") && eleccionMaquina.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();
    }
}

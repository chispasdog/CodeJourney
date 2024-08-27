package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugador1, jugador2;
        int puntosJugador1 = 0, puntosJugador2 = 0;
        boolean turnoJugador1 = true;

        System.out.print("Introduce el nombre del Jugador 1: ");
        jugador1 = sc.nextLine();
        System.out.print("Introduce el nombre del Jugador 2: ");
        jugador2 = sc.nextLine();

        while (puntosJugador1 < 3 && puntosJugador2 < 3) {
            System.out.println("\nTurno de " + (turnoJugador1 ? jugador1 : jugador2) + " para elegir la palabra.");
            System.out.print("Introduce la palabra a adivinar (sin espacios): ");
            String palabra = sc.nextLine().toUpperCase();
            System.out.print("Introduce una pista para la palabra: ");
            String pista = sc.nextLine();

            // Lógica del juego
            boolean resultado = jugarAhorcado(palabra, pista);

            if (turnoJugador1) {
                if (resultado) {
                    puntosJugador2++;
                } else {
                    puntosJugador1++;
                }
            } else {
                if (resultado) {
                    puntosJugador1++;
                } else {
                    puntosJugador2++;
                }
            }

            System.out.println(jugador1 + ": " + puntosJugador1 + " puntos.");
            System.out.println(jugador2 + ": " + puntosJugador2 + " puntos.");
            turnoJugador1 = !turnoJugador1;
        }

        System.out.println("\n¡Fin del juego!");
        if (puntosJugador1 > puntosJugador2) {
            System.out.println("¡Ganador: " + jugador1 + "!");
        } else {
            System.out.println("¡Ganador: " + jugador2 + "!");
        }
    }

    public static boolean jugarAhorcado(String palabra, String pista) {
        Scanner sc = new Scanner(System.in);
        StringBuilder palabraOculta = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta.append("_");
        }

        int intentos = 6;
        while (intentos > 0 && !palabraOculta.toString().equals(palabra)) {
            System.out.println("\nPista: " + pista);
            System.out.println("Palabra: " + palabraOculta);
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Introduce una letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);

            if (palabra.contains(String.valueOf(letra))) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        palabraOculta.setCharAt(i, letra);
                    }
                }
            } else {
                intentos--;
            }
        }

        if (palabraOculta.toString().equals(palabra)) {
            System.out.println("\n¡Palabra adivinada!");
            return true;
        } else {
            System.out.println("\n¡Se acabaron los intentos!");
            return false;
        }
    }
}

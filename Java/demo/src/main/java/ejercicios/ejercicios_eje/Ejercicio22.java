package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = '~'; // Agua
            }
        }

        System.out.println("Jugador 1: Coloca tu barco.");
        System.out.print("Fila (0-4): ");
        int fila = sc.nextInt();
        System.out.print("Columna (0-4): ");
        int columna = sc.nextInt();

        tablero[fila][columna] = 'B'; // Barco

        System.out.println("\nJugador 2: Intenta hundir el barco.");
        boolean hundido = false;
        while (!hundido) {
            System.out.print("Fila (0-4): ");
            fila = sc.nextInt();
            System.out.print("Columna (0-4): ");
            columna = sc.nextInt();

            if (tablero[fila][columna] == 'B') {
                System.out.println("¡Hundido!");
                hundido = true;
            } else {
                System.out.println("¡Agua!");
            }
        }
    }
}

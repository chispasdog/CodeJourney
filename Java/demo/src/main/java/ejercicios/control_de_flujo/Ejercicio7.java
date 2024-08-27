package ejercicios.control_de_flujo;

import java.util.Scanner;

/**
 * Ejercicio 7: Realiza el juego PIEDRA, PAPEL, TIJERA, utilizando SWITCH
 * exclusivamente.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. PIEDRA");
        System.out.println("2. PAPEL");
        System.out.println("3. TIJERA");
        int opcion = scanner.nextInt();

        int cpuOpcion = (int) (Math.random() * 3) + 1;

        switch (opcion) {
            case 1:
                switch (cpuOpcion) {
                    case 1:
                        System.out.println("CPU eligió PIEDRA. Es un empate.");
                        break;
                    case 2:
                        System.out.println("CPU eligió PAPEL. Tú pierdes.");
                        break;
                    case 3:
                        System.out.println("CPU eligió TIJERA. Tú ganas.");
                        break;
                }
                break;
            case 2:
                switch (cpuOpcion) {
                    case 1:
                        System.out.println("CPU eligió PIEDRA. Tú ganas.");
                        break;
                    case 2:
                        System.out.println("CPU eligió PAPEL. Es un empate.");
                        break;
                    case 3:
                        System.out.println("CPU eligió TIJERA. Tú pierdes.");
                        break;
                }
                break;
            case 3:
                switch (cpuOpcion) {
                    case 1:
                        System.out.println("CPU eligió PIEDRA. Tú pierdes.");
                        break;
                    case 2:
                        System.out.println("CPU eligió PAPEL. Tú ganas.");
                        break;
                    case 3:
                        System.out.println("CPU eligió TIJERA. Es un empate.");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}

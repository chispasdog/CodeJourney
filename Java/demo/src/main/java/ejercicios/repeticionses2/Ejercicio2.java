package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Crea una aplicación que nos pida un día de la semana y que nos diga si es un
         * día laboral o no.
         * Usa un switch para ello.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana:");
        String dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                System.out.println(dia + " es un día laboral.");
                break;
            case "sábado":
            case "domingo":
                System.out.println(dia + " no es un día laboral.");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }
}

package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu DNI sin letra: ");
        int dni = sc.nextInt();

        int posicion = dni % 23;
        System.out.println("El DNI completo es: " + dni + letras[posicion]);
    }
}

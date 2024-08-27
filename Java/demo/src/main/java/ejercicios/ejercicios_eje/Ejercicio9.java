package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String[] nombres = new String[10];
        double[] notas = new double[10];
        String[] resultados = new String[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Introduce la nota de " + nombres[i] + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine();

            if (notas[i] < 5) {
                resultados[i] = "SUSPENSO";
            } else if (notas[i] < 7) {
                resultados[i] = "BIEN";
            } else if (notas[i] < 9) {
                resultados[i] = "NOTABLE";
            } else {
                resultados[i] = "SOBRESALIENTE";
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(nombres[i] + " - Nota: " + notas[i] + " - Resultado: " + resultados[i]);
        }
    }
}

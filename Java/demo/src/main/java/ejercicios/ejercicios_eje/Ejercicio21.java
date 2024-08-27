package ejercicios.ejercicios_eje;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        int size = sc.nextInt();

        int[] vectorOrigen = new int[size];
        int[] vectorDestino = new int[size];

        System.out.println("Introduce los valores del vector:");
        for (int i = 0; i < size; i++) {
            vectorOrigen[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < size; i++) {
            if (vectorOrigen[i] % 2 == 0 && vectorOrigen[i] > 25) {
                vectorDestino[j] = vectorOrigen[i];
                j++;
            }
        }

        System.out.println("\nVector Origen:");
        for (int val : vectorOrigen) {
            System.out.print(val + " ");
        }

        System.out.println("\n\nVector Destino:");
        for (int i = 0; i < j; i++) {
            System.out.print(vectorDestino[i] + " ");
        }
    }
}

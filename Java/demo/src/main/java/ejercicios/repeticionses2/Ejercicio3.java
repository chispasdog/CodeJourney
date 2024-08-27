package ejercicios.repeticionses2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Pedir número por teclado y preguntar si quiere poner más.
         * Mostrar la suma de los positivos y negativos, suma de los pares e impares,
         * cantidad de positivos y negativos, cantidad de pares e impares y media de
         * todos los números.
         */

        Scanner sc = new Scanner(System.in);
        char respuesta;
        int num, sumaPos = 0, sumaNeg = 0, sumaPares = 0, sumaImpares = 0, contPos = 0, contNeg = 0, contPares = 0,
                contImpares = 0, totalNum = 0;
        double media;

        do {
            System.out.println("Introduce un número:");
            num = sc.nextInt();
            totalNum++;

            // Sumas y conteos
            if (num > 0) {
                sumaPos += num;
                contPos++;
            } else if (num < 0) {
                sumaNeg += num;
                contNeg++;
            }

            if (num % 2 == 0) {
                sumaPares += num;
                contPares++;
            } else {
                sumaImpares += num;
                contImpares++;
            }

            System.out.println("¿Quieres introducir otro número? (s/n)");
            respuesta = sc.next().charAt(0);

        } while (respuesta == 's' || respuesta == 'S');

        media = (double) (sumaPos + sumaNeg) / totalNum;

        System.out.println("Suma de positivos: " + sumaPos);
        System.out.println("Suma de negativos: " + sumaNeg);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        System.out.println("Cantidad de positivos: " + contPos);
        System.out.println("Cantidad de negativos: " + contNeg);
        System.out.println("Cantidad de pares: " + contPares);
        System.out.println("Cantidad de impares: " + contImpares);
        System.out.println("Media de todos los números: " + media);
    }
}

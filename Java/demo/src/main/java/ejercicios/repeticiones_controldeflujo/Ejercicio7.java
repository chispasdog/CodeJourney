package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce el primer número:");
            int num1 = scanner.nextInt();

            if (num1 == -1) {
                break;
            }

            System.out.println("Introduce el segundo número:");
            int num2 = scanner.nextInt();

            if (num2 == -1) {
                break;
            }

            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

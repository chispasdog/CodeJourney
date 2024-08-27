package ejercicios.repeticiones_controldeflujo;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /**
         * Ejercicio 12
         * Tenemos un videojuego en el que nuestro personaje se coloca en una posición
         * de un tablero
         * (posición x e y) y se puede mover a una dirección, pudiendo elegir cuántas
         * casillas se mueve en
         * cada acción.
         * Pide por teclado que el usuario introduzca una dirección (“Arriba”, “Abajo”,
         * “Izquierda”,
         * “Derecha”) y el número de casillas que quiere mover.
         * Muestra por pantalla cómo se va desplazando el personaje.
         */

        Scanner scanner = new Scanner(System.in);
        int x = 4;
        int y = 6;

        System.out.println("El personaje se encuentra inicialmente en la posición x = " + x + ", y = " + y);
        System.out.print("Introduce una dirección (Arriba, Abajo, Izquierda, Derecha): ");
        String direccion = scanner.nextLine();
        System.out.print("Introduce el número de casillas que quiere mover: ");
        int casillas = scanner.nextInt();

        switch (direccion) {
            case "Arriba":
                for (int i = 1; i <= casillas; i++) {
                    y--;
                    System.out.println("El personaje se mueve a la posición x = " + x + ", y = " + y);
                }
                break;
            case "Abajo":
                for (int i = 1; i <= casillas; i++) {
                    y++;
                    System.out.println("El personaje se mueve a la posición x = " + x + ", y = " + y);
                }
                break;
            case "Izquierda":
                for (int i = 1; i <= casillas; i++) {
                    x--;
                    System.out.println("El personaje se mueve a la posición x = " + x + ", y = " + y);
                }
                break;
            case "Derecha":
                for (int i = 1; i <= casillas; i++) {
                    x++;
                    System.out.println("El personaje se mueve a la posición x = " + x + ", y = " + y);
                }
                break;
        }

        scanner.close();
    }
}

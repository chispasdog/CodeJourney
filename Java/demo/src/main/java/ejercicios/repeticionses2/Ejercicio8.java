package ejercicios.repeticionses2;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Recorre el String del ejercicio 6 y transforma cada carácter a su código
         * ASCII.
         * Muéstralos en línea recta, separados por un espacio entre cada carácter.
         */

        String frase = "La lluvia en Sevilla es una maravilla";
        for (int i = 0; i < frase.length(); i++) {
            System.out.print((int) frase.charAt(i) + " ");
        }
    }
}

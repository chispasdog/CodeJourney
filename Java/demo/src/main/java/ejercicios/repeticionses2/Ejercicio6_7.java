package ejercicios.repeticionses2;

public class Ejercicio6_7 {
    public static void main(String[] args) {
        /**
         * Del siguiente String “La lluvia en Sevilla es una maravilla”
         * cuenta cuantas vocales hay en total (recorre el String con charAt).
         */
        String frase = "La lluvia en Sevilla es una maravilla";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("Total de vocales en la frase: " + contador);

        /** Ejercicio 7: Reemplaza todas las a del String anterior por una e. */
        String nuevaFrase = frase.replace('a', 'e');
        System.out.println("Frase modificada: " + nuevaFrase);
    }
}

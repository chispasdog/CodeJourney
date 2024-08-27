package ejercicios.ejercicio_de_acceso_datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

//2. (1,5 puntos) Manolito está coleccionando los cromos de los futbolistas del mundial
//de fútbol. Ha contactado por Internet con Mafalda para cambiar los cromos que
//tienen repetidos. Para eso, necesita una aplicación para generar un archivo CSV en
//el que cada línea va a tener la información de un cromo: nombre jugador; selección
//nacional; cantidad de cromos. En uno de los archivos adjuntos tienes un proyecto
//JavaFX con la ventana ya creada. Ejemplo de archivo: si tengo repetidos los cromos
//de Maradona, Sócrates y Julio Alberto (3 veces), el fichero sería:
//Maradona; Argentina; 2
//Sócrates; Brasil; 2
//Julio Alberto; España; 3
public class Ejercicio2 {
    ArrayList<Cromo> pais = new ArrayList<Cromo>();

    BufferedReader br;

    {
        try {
            br = new BufferedReader(new FileReader("Cromosrepes.csv"));
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(";");

                System.out.println(Arrays.toString(datos));

                String nombre_jugador = datos[0];
                String selección_nacional = datos[1];

                String cantidad_de_cromos = datos[2];
                int cantidad_de_cromos2 = Integer.parseInt(cantidad_de_cromos);

                Cromo aux = new Cromo(nombre_jugador, selección_nacional, cantidad_de_cromos2);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    class Cromo {
        private String nombre_jugador;
        private String selección_nacional;
        private int cantidad_de_cromos;

        public Cromo(String nombre_jugador, String selección_nacional, int cantidad_de_cromos) {
            this.nombre_jugador = nombre_jugador;
            this.selección_nacional = selección_nacional;
            this.cantidad_de_cromos = cantidad_de_cromos;
        }
    }
}
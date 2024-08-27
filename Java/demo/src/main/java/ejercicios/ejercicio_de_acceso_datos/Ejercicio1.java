package ejercicios.ejercicio_de_acceso_datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Scanner;

//(1,5 puntos) John Difool, detective galáctico, quiere mantener un diario de sus
//investigaciones en el que él no tenga que escribir la fecha (LocalDate.now()) y que se
//guarde en un simple archivo de texto. Crea una aplicación que añada cada anotación
//que se escriba al archivo diarioDeJohnDifool.txt y que cuente con una línea con la
//fecha antes de cada texto. Las fechas se pueden repetir. Por ejemplo:
//02/12/2022
//El Metabarón está cada día más pesado
//03/12/2022

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    static String notas = sc.nextLine();

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("diarioDeJohnDifool.txt", true));

            bw.write(LocalDate.now().toString());
            bw.newLine();
            bw.write(notas);
            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

package ejercicios.ejercicio_biblioteca_n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        int decision = sc.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Usuario usu1 = null;
        Autor autor1 = null;
        Libros libro1 = null;
        Biblioteca biblio = null;

        while (true) {

            System.out.println("Eligue que quieres hacer?");
            System.out.println("1 crea rodo");
            System.out.println("2 agregar usuario a la biblioteca");
            System.out.println("3 agregar libros a la biblioteca");
            System.out.println("4 hacer prestamos");
            System.out.println("5 devolver prestamo");
            System.out.println("6 ver todos los usuarios");
            System.out.println("7 ver todos los libros");
            System.out.println("8 salir del programa");

            switch (decision) {
                case 1:
                    System.out.println("crea todo");
                    usu1 = new Usuario("juan");
                    autor1 = new Autor("Josemaria aznar", Paises.ESPANA, sdf.parse("21/01/1999"));
                    libro1 = new Libros("mi diario", autor1, 2000, 1000);
                    biblio = new Biblioteca("la biblio", "cea bermudez");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    biblio.crearusuario(usu1);
                    break;

                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    biblio.crearlibro(libro1);

                    break;

                case 4:
                    System.out.println("Has seleccionado la opción 4");

                    if (biblio.realizarprestamos("juan", "mi diario") == true) {
                        System.out.println("prestamos realizado con exito");
                    } else {
                        System.out.println("no se puedo");
                    }

                    break;

                case 5:
                    System.out.println("Has seleccionado la opción 5");

                    if (biblio.recibirdevolucion("juan", "mi diario") == true) {
                        System.out.println("devolucion realizado con exito");
                    } else {
                        System.out.println("no se puedo devolver");
                    }
                    break;

                case 6:
                    System.out.println("Has seleccionado la opción 6");
                    biblio.getTodos_los_usuarios();

                    break;
                case 7:
                    System.out.println("Has seleccionado la opción 7");
                    biblio.getTodos_los_libros();

                    break;

                case 8:

                    System.exit(0);

                    break;

            }
        }

    }

}

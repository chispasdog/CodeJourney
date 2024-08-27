package ejercicios.pildorasinformaticas;

import javax.swing.*;
import java.awt.print.PrinterException;

public class Detector_de_correo {

    public static void main(String[] args) {

        String el_mail = JOptionPane.showInputDialog("Introduce mail");
        examina_mail(el_mail);
    }

    static void examina_mail(String mail) {
        int arroba = 0;
        boolean punto = false;

        if (mail.length() <= 3) {
            ArrayIndexOutOfBoundsException miexcepcion = new ArrayIndexOutOfBoundsException();
            throw miexcepcion;
        } else {

            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;
                }

                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }

            if (arroba == 1 && punto) {
                System.out.println("Es correcto");
            } else {
                System.out.println("No es correcto");
            }
        }
    }
}

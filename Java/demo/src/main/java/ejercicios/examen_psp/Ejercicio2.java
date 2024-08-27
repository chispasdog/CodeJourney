package ejercicios.examen_psp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Ejercicio2 {

    private Process paint1;
    private Process paint2;

    public Ejercicio2() {
        // v
        JFrame frame = new JFrame("Paint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // botones
        JButton btnAbrirPaint = new JButton("Abrir Paint");
        JButton btnCerrarPaint = new JButton("Cerrar Paint");
        JButton btnAbrirDosPaint = new JButton("Abrir 2 Paint");
        JButton btnCerrarDosPaint = new JButton("Cerrar 2 Paint");

        // acbotones
        btnAbrirPaint.addActionListener(e -> abrirPaint());
        btnCerrarPaint.addActionListener(e -> cerarPaint());
        btnAbrirDosPaint.addActionListener(e -> abrirDsPint());
        btnCerrarDosPaint.addActionListener(e -> cerrarssPaint());

        // ventana
        frame.setLayout(new FlowLayout());
        frame.add(btnAbrirPaint);
        frame.add(btnCerrarPaint);
        frame.add(btnAbrirDosPaint);
        frame.add(btnCerrarDosPaint);

        // Hacer ventana
        frame.setVisible(true);
    }

    private void abrirPaint() {
        try {
            if (paint1 == null || !paint1.isAlive()) {
                paint1 = Runtime.getRuntime().exec("mspaint.exe");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void cerarPaint() {
        if (paint1 != null) {
            paint1.destroy();
        }
    }

    private void abrirDsPint() {
        abrirPaint();
        try {
            if (paint2 == null || !paint2.isAlive()) {
                paint2 = Runtime.getRuntime().exec("mspaint.exe");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void cerrarssPaint() {
        cerarPaint();
        if (paint2 != null) {
            paint2.destroy();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio2::new);
    }
}

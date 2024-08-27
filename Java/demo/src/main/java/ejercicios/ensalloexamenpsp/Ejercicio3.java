package ejercicios.ensalloexamenpsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/*
* 3. (1 punto) Crea una aplicación con Swing o JavaFX en la que haya un cuadro de texto
y un botón. Cuando se pulse el botón, se abrirá el número de procesos del bloc de
notas que se indique en el cuadro de texto.
*
*
* */

public class Ejercicio3 {
    public static void main(String[] args) {
        JTextField textField = new JTextField(5);
        JButton button = new JButton("Abrir Bloc de Notas");

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numberOfProcesses = Integer.parseInt(textField.getText());
                    for (int i = 0; i < numberOfProcesses; i++) {
                        Runtime.getRuntime().exec("notepad.exe");
                    }
                } catch (NumberFormatException | IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }
        });
    }
}

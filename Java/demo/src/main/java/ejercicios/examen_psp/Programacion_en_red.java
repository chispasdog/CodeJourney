package ejercicios.examen_psp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;

public class Programacion_en_red extends JFrame {
    private JTextArea webContent;
    private JTextField urlField;

    public Programacion_en_red() {
        setTitle("Programacion_en_red");
        setSize(1800, 1600);// pongo de mas para que se ajuste a la pantalla igualemnte no va
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        webContent = new JTextArea();
        webContent.setEditable(false);
        urlField = new JTextField();

        JPanel topPanel = new JPanel(new FlowLayout());
        JButton btnElPais = new JButton("El País");
        JButton btnElMundo = new JButton("El Mundo");
        JButton btnLaVerdad = new JButton("La Verdad");
        JButton btnLaOpinion = new JButton("La Opinión de Murcia");
        JButton btnSave = new JButton("Guardar");

        topPanel.add(btnElPais);
        topPanel.add(btnElMundo);
        topPanel.add(btnLaVerdad);
        topPanel.add(btnLaOpinion);
        topPanel.add(btnSave);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(webContent), BorderLayout.CENTER);

        btnElPais.addActionListener(e -> cargar("http://www.elpais.com"));
        btnElMundo.addActionListener(e -> cargar("http://www.elmundo.es"));
        btnLaVerdad.addActionListener(e -> cargar("http://www.laverdad.es"));
        btnLaOpinion.addActionListener(e -> cargar("http://www.laopiniondemurcia.es"));
        btnSave.addActionListener(e -> gordar());

        setVisible(true);
    }

    private void cargar(String urlString) {
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            webContent.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                webContent.append(line + "\n");

            }
            reader.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void gordar() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("fuertes.txt"))) {
            writer.write(webContent.getText());
            JOptionPane.showMessageDialog(this, "Contenido guardado en 'fuertes.txt'", "Guardado",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar  ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Programacion_en_red::new);
    }
}

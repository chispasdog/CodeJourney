package ejercicios.ensalloexamenpsp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Stack;

public class CutreNavegador extends JFrame {
    private JTextField urlField;
    private JTextArea webContent;
    private JTextField puertoField;
    private JTextField hostField;
    private JTextField pathField;
    private Stack<String> history = new Stack<>();
    private JButton backButton;

    public CutreNavegador() {
        setTitle("CutreNavegador");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        urlField = new JTextField();
        webContent = new JTextArea();
        webContent.setEditable(false);

        puertoField = new JTextField();
        puertoField.setEditable(false);
        hostField = new JTextField();
        hostField.setEditable(false);
        pathField = new JTextField();
        pathField.setEditable(false);

        JButton goButton = new JButton("Ir");
        backButton = new JButton("Atrás");
        backButton.setEnabled(false);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(urlField, BorderLayout.CENTER);
        topPanel.add(goButton, BorderLayout.EAST);
        topPanel.add(backButton, BorderLayout.WEST);

        JPanel infoPanel = new JPanel(new GridLayout(1, 3));
        infoPanel.add(puertoField);
        infoPanel.add(hostField);
        infoPanel.add(pathField);

        add(topPanel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.SOUTH);
        add(new JScrollPane(webContent), BorderLayout.CENTER);

        goButton.addActionListener(e -> loadContent());
        backButton.addActionListener(e -> goBack());

        setVisible(true);
    }

    private void loadContent() {
        try {
            URL url = new URL(urlField.getText());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            webContent.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                webContent.append(line + "\n");
            }
            reader.close();

            puertoField.setText(Integer.toString(url.getPort() == -1 ? url.getDefaultPort() : url.getPort()));
            hostField.setText(url.getHost());
            pathField.setText(url.getPath());

            if (!history.isEmpty() && !urlField.getText().equals(history.peek())) {
                if (history.size() == 5) {
                    history.remove(0);
                }
                history.push(urlField.getText());
            }

            backButton.setEnabled(!history.isEmpty());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar la página", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void goBack() {
        if (!history.isEmpty()) {
            history.pop();
            if (!history.isEmpty()) {
                String lastUrl = history.peek();
                urlField.setText(lastUrl);
                loadContent();
                if (history.size() == 1) {
                    history.clear();
                }
            }
        }
        backButton.setEnabled(!history.isEmpty());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CutreNavegador::new);
    }
}

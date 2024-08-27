import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FTPUploader {
    public static void main(String[] args) {
        // Datos para la conexión al servidor FTP
        String server = "localhost"; // Dirección del servidor FTP
        int port = 21; // Puerto del servidor FTP
        String username = "JohnDifool"; // Nombre de usuario para la autenticación
        String password = "IncaldeLuz"; // Contraseña para la autenticación
        String remoteDirectory = "/"; // Directorio remoto en el servidor FTP donde se subirán los archivos

        // Ciclo infinito para poder subir archivos múltiples veces
        while(true){
            // Crea un JFileChooser para seleccionar archivos
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Seleccionar archivo para subir");

            // Muestra el diálogo de selección de archivos y espera la acción del usuario
            int result = fileChooser.showOpenDialog(null);
            // Comprueba si el usuario ha seleccionado un archivo
            if(result == JFileChooser.APPROVE_OPTION){
                // Obtiene el archivo seleccionado por el usuario
                File selectedFile = fileChooser.getSelectedFile();
                // Obtiene la ruta absoluta del archivo seleccionado
                String localFilePath = selectedFile.getAbsolutePath();

                // Intenta realizar las operaciones de FTP
                try{
                    // Crea un objeto FTPClient para manejar la conexión FTP
                    FTPClient ftpCliente = new FTPClient();
                    // Conecta al servidor FTP usando la dirección y el puerto
                    ftpCliente.connect(server, port);
                    // Inicia sesión en el servidor FTP con el nombre de usuario y contraseña
                    ftpCliente.login(username, password);

                    // Prepara el archivo para ser subido
                    FileInputStream inputStream = new FileInputStream(selectedFile);
                    // Configura el tipo de archivo para la transferencia binaria
                    ftpCliente.setFileType(FTP.BINARY_FILE_TYPE);
                    // Sube el archivo al servidor FTP en el directorio especificado
                    boolean upload = ftpCliente.storeFile(remoteDirectory + selectedFile.getName(), inputStream);
                    // Cierra el flujo de entrada del archivo
                    inputStream.close();

                    // Comprueba si la carga fue exitosa y muestra un mensaje
                    if(upload){
                        JOptionPane.showMessageDialog(null, "Archivo subido exitosamente");
                    }else{
                        // Muestra un mensaje de error si la carga falla
                        JOptionPane.showMessageDialog(null, "Error al subir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    // Cierra la sesión FTP y desconecta del servidor
                    ftpCliente.logout();
                    ftpCliente.disconnect();

                }catch(IOException e){
                    // Muestra un mensaje de error si ocurre una excepción de E/S
                    JOptionPane.showMessageDialog(null, "Error de conexión", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}

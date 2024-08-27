import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// Clase principal FTPUploader que se encarga de subir archivos a un servidor FTP
public class FTPUploader {
    public static void main(String[] args) {
        String server = "ftp.microinformaticos.com"; // Dirección del servidor FTP
        int port = 21; // Puerto estándar para FTP es el 21
        String username = "JohnDifool"; // Nombre de usuario para la conexión
        String password = "IncaldeLuz"; // Contraseña para la conexión
        String remoteDirectory = "/superarchivos"; // Directorio remoto donde se subirán los archivos
        // Bucle infinito para permitir subir varios archivos
        while(true){
            // Instancia para elegir archivos desde el sistema de archivos local
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Seleccionar archivo para subir");
            // Muestra el diálogo para elegir archivo y espera una respuesta del usuario
            int result = fileChooser.showOpenDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                // Si el usuario selecciona un archivo, se obtiene el archivo seleccionado
                File selectedFile = fileChooser.getSelectedFile();
                // Se obtiene la ruta absoluta del archivo seleccionado
                // Intento de operaciones que pueden fallar, manejadas con un bloque try-catch
                try{
                    // Creación del cliente FTP y conexión al servidor
                    FTPClient ftpCliente = new FTPClient();
                    ftpCliente.connect(server, port);
                    ftpCliente.login(username, password);

                    // Preparación del archivo para ser subido y configuración del tipo de archivo
                    FileInputStream inputStream = new FileInputStream(selectedFile);
                    ftpCliente.setFileType(FTP.BINARY_FILE_TYPE);
                    // Intento de subir el archivo al servidor FTP
                    boolean upload = ftpCliente.storeFile(remoteDirectory +"/" + selectedFile.getName(), inputStream);
                    // Cierre del stream de entrada
                    inputStream.close();

                    // Verificación del resultado de la subida y muestra de un mensaje apropiado
                    if(upload){
                        JOptionPane.showMessageDialog(null, "Archivo subido exitosamente");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al subir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    ftpCliente.logout();
                    ftpCliente.disconnect();
                }catch(IOException e){
                    JOptionPane.showMessageDialog(null, "Error de conexión", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                // Si el usuario cancela el diálogo de selección de archivo, se rompe el bucle while
                break;
            }
        }
    }
}

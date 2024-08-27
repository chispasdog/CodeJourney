// Importaciones necesarias para manejar FTP, archivos y elementos gráficos.
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import javax.swing.*;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DescargarFichero {
    public static void main(String[] args) {
        // Creación de una instancia del cliente FTP.
        FTPClient cliente = new FTPClient();

        // Datos de conexión al servidor FTP.
        String servidor = "127.0.0.1"; // IP del servidor.
        String user = "dani"; // Usuario.
        String pasw = "dani1234"; // Contraseña.

        try {
            // Conexión al servidor FTP.
            cliente.connect(servidor);
            // Intento de login.
            boolean login = cliente.login(user, pasw);

            if(login) {
                // Configuración para la descarga de archivos en formato binario.
                cliente.setFileType(FTP.BINARY_FILE_TYPE);
                // Activación del modo pasivo.
                cliente.enterLocalPassiveMode();

                // Listado y muestra de directorios disponibles en el servidor.
                for(FTPFile fichero : cliente.listDirectories()){
                    System.out.println(fichero.getName());
                }

                // Solicitud al usuario para que ingrese el nombre del directorio de interés.
                String directorio = JOptionPane.showInputDialog("Dime el directorio");
                // Cambio al directorio especificado.
                cliente.changeWorkingDirectory(directorio);

                // Listado y muestra de archivos en el directorio actual.
                for(FTPFile fichero : cliente.listFiles()){
                    System.out.println(fichero.getName());
                }

                // Solicitud al usuario para que elija el archivo a descargar.
                String archivo = JOptionPane.showInputDialog("Dime el archivo");

                // Stream de salida para escribir el archivo descargado en el sistema local.
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream("C:\\Users\\AntonioSalinasGarcía\\Documents\\" + archivo));

                // Descarga del archivo y mensaje de confirmación.
                if (cliente.retrieveFile(archivo, out)) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Fail");
                }

                // Cierre del stream de salida.
                out.close();
            } else {
                System.out.println("El login ha fallado");
            }
        } catch (IOException ex) {
            // En caso de error, se lanza una excepción.
            throw new RuntimeException(ex);
        }
    }
}

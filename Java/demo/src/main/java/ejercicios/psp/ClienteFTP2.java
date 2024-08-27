// Importaciones necesarias para manejar entrada/salida y la conexión FTP.
import java.io.*;
import org.apache.commons.net.ftp.*;

public class ClienteFTP2 {
	public static void main(String[] args) {
		// Creación del cliente FTP.
		FTPClient cliente = new FTPClient();
		// Dirección del servidor FTP.
		String servFTP = "ftp.rediris.es";
		// Mensaje inicial indicando la conexión.
		System.out.println("Nos conectamos a: " + servFTP);
		// Credenciales para el login.
		String usuario = "anonymous";
		String clave = "anonymous";

		try {
			// Conexión al servidor FTP.
			cliente.connect(servFTP);
			// Activación del modo pasivo.
			cliente.enterLocalPassiveMode();

			// Intento de login con las credenciales proporcionadas.
			boolean login = cliente.login(usuario, clave);
			// Verificación del resultado del login.
			if (login)
				System.out.println("Login correcto...");
			else {
				System.out.println("Login Incorrecto...");

				cliente.disconnect();
				System.exit(1);
			}
			// Muestra el directorio actual en el servidor.
			System.out.println("Directorio actual: " + cliente.printWorkingDirectory());

			// Obtención y listado de archivos del directorio actual.
			FTPFile[] files = cliente.listFiles();
			System.out.println("Ficheros en el directorio actual:" + files.length);
			// Descripción de tipos de archivos.
			String tipos[] = {"Fichero", "Directorio","Enlace simb."};

			// Bucle para mostrar información de cada archivo/directorio.
			for (int i = 0; i < files.length; i++) {
				System.out.println("\t" + files[i].getName() + " => " + tipos[files[i].getType()]);
			}
			// Cierre de sesión en el servidor FTP.
			boolean logout = cliente.logout();
			if (logout)
				System.out.println("Logout del servidor FTP...");
			else
				System.out.println("Error al hacer Logout...");

			// Desconexión del servidor FTP.
			cliente.disconnect();
			System.out.println("Desconectado...");
		} catch (IOException ioe) {
			// Manejo de excepciones.
			ioe.printStackTrace();
		}
	}
}// Fin de la clase ClienteFTP2

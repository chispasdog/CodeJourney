// Importaciones necesarias para manejar excepciones y trabajar con el cliente FTP.
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.*;

// Declaración de la clase principal del cliente FTP.
public class ClienteFTP1 {
	// Método principal que se ejecuta al iniciar el programa.
	public static void main(String[] args) throws SocketException, IOException {
		// Crea una instancia de FTPClient, que es la clase utilizada para conectarse y operar con el servidor FTP.
		FTPClient cliente = new FTPClient();

		// Define la dirección del servidor FTP al que nos queremos conectar.
		String servFTP = "ftp.rediris.es"; // servidor FTP
		// Imprime en consola la dirección del servidor FTP a la que se intentará conectar.
		System.out.println("Nos conectamos a: " + servFTP);
		// Realiza la conexión al servidor FTP especificado.
		cliente.connect(servFTP);

		// Imprime la cadena de respuesta del servidor FTP. Esta es la primera respuesta que da el servidor tras establecer conexión.
		System.out.print(cliente.getReplyString());
		// Obtiene el código de respuesta del servidor FTP tras intentar la conexión.
		int respuesta = cliente.getReplyCode();

		// Imprime el código de respuesta para que el usuario sepa qué ha ocurrido.
		System.out.println("Respuesta: "+respuesta);

		// Comprueba si el código de respuesta indica que la conexión ha sido exitosa.
		if (!FTPReply.isPositiveCompletion(respuesta)) {
			// Si el código de respuesta no es positivo, se desconecta del servidor FTP.
			cliente.disconnect();
			// Imprime un mensaje indicando que la conexión ha sido rechazada, junto con el código de respuesta.
			System.out.println("Conexión rechazada: " + respuesta);
			// Finaliza la ejecución del programa.
			System.exit(0);
		}

		// Si se llega a este punto, significa que la conexión fue exitosa. Por lo tanto, se procede a desconectar del servidor FTP.
		cliente.disconnect();
		// Imprime un mensaje indicando que la conexión con el servidor FTP ha finalizado.
		System.out.println("Conexión finalizada.");
	}
}// Fin de la clase ClienteFTP1

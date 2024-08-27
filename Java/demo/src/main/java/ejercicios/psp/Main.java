// Importaciones necesarias para trabajar con sockets y paquetes UDP.
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) {
        // Se crea un buffer (array de bytes) para almacenar los datos recibidos.
        byte[] bufer = new byte[1024]; // Tamaño de 1024 bytes para recibir el datagrama.

        // Inicialización del socket UDP asociándolo a un puerto específico.
        // En este caso, el puerto 12345 es donde el socket estará escuchando.
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(12345);

            // Bucle para recibir tres mensajes (datagramas).
            for(int n = 0; n < 3; n++) {
                // Se prepara un datagrama vacío con el buffer para recibir los datos.
                DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
                System.out.println("Esperando Datagrama .......... ");

                // El socket espera y recibe el datagrama.
                socket.receive(recibo); // Este método bloquea la ejecución hasta que llega un datagrama.

                // Una vez recibido el datagrama, se extrae la cantidad de bytes recibidos.
                int bytesRec = recibo.getLength();
                // Se convierte el contenido del buffer a String para su fácil lectura.
                String paquete = new String(recibo.getData());

                // Se imprime la información relevante del datagrama recibido:
                System.out.println("Número de Bytes recibidos: " + bytesRec);
                System.out.println("Contenido del Paquete: " + paquete.trim());
                System.out.println("Puerto origen del mensaje: " + recibo.getPort());
                System.out.println("IP de origen: " + recibo.getAddress().getHostAddress());
                System.out.println("Puerto destino del mensaje: " + socket.getLocalPort());
            }
            // Finalmente, se cierra el socket después de recibir los tres mensajes.
            socket.close();
        } catch (Exception e) {
            // Captura de cualquier excepción que pueda ocurrir durante la creación del socket o la recepción de datagramas.
            throw new RuntimeException(e);
        }
    }
}

import java.net.*;
import java.util.Scanner;

// Clase ClienteUDP que implementa un cliente de datagramas UDP.
public class ClienteUDP {
    // Método principal del cliente.
    public static void main(String[] args) {
        try {
            // Crea un socket de datagrama UDP para el cliente.
            DatagramSocket socket = new DatagramSocket();
            // Obtiene la dirección IP del servidor (localhost en este caso).
            InetAddress direccionServidor = InetAddress.getByName("localhost");

            // Buffers para enviar y recibir datos.
            byte[] enviarDatos;
            byte[] recibirDatos = new byte[1024];

            // Crea un objeto Scanner para leer la entrada del usuario.
            Scanner scanner = new Scanner(System.in);
            // Pide al usuario que introduzca un número.
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            // Convierte el número a String y luego a un array de bytes.
            String mensaje = String.valueOf(numero);
            enviarDatos = mensaje.getBytes();

            // Crea un paquete de datagrama para enviar el número al servidor.
            DatagramPacket enviarPaquete = new DatagramPacket(enviarDatos, enviarDatos.length, direccionServidor, 9876);
            // Envía el paquete al servidor.
            socket.send(enviarPaquete);

            // Crea un paquete de datagrama para recibir la respuesta del servidor.
            DatagramPacket recibirPaquete = new DatagramPacket(recibirDatos, recibirDatos.length);
            // Espera y recibe la respuesta del servidor.
            socket.receive(recibirPaquete);

            // Convierte la respuesta a String y la imprime.
            String respuesta = new String(recibirPaquete.getData());
            System.out.println("Número recibido desde el servidor: " + respuesta.trim());

            // Cierra el socket del cliente.
            socket.close();
        } catch (Exception e) {
            // Imprime la pila de la excepción si ocurre un error.
            e.printStackTrace();
        }
    }
}

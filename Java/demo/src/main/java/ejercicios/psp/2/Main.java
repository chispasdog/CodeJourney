
// Importaciones necesarias para trabajar con datagramas y sockets UDP.
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main{
    public static void main(String[] argv) throws Exception {
        // Puerto al que se enviarán los mensajes.
        int port = 12345;
        // Dirección IP de destino, en este caso, la dirección local del host.
        InetAddress destino = InetAddress.getLocalHost();
        // Buffer para almacenar el mensaje a enviar.
        byte[] mensaje = new byte[1024];
        // Variable para almacenar el mensaje a enviar en cada iteración.
        String saludo = "";
        // Creación de un socket DatagramSocket sin especificar un puerto,
        // lo que significa que el sistema elegirá un puerto disponible para usar.
        // Se especifica un puerto arbitrario (34567) para el socket del cliente.
        DatagramSocket socket = new DatagramSocket(34567);

        // Bucle para enviar tres mensajes.
        for(int n=0; n<3; n++) {
            // Se crea el mensaje a enviar en cada iteración.
            saludo = "mensaje " + n;
            // Se convierte el mensaje de String a byte[] para su envío.
            mensaje = saludo.getBytes();

            // Creación del datagrama a enviar, especificando el mensaje, su longitud,
            // la dirección IP de destino y el puerto de destino.
            DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, port);
            // Envío del datagrama a través del socket.
            socket.send(envio);
        }

        // Cierre del socket después de enviar los mensajes.
        socket.close();
    }
}

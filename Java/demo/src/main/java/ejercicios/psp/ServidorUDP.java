import java.net.*;

// Clase ServidorUDP que implementa un servidor de datagramas UDP.
public class ServidorUDP {
    // Método principal del servidor.
    public static void main(String[] args) {
        try {
            // Crea un socket de datagrama UDP en el puerto 9876.
            DatagramSocket socket = new DatagramSocket(9876);
            // Buffer para recibir datos del cliente.
            byte[] recibirDatos = new byte[1024];
            // Buffer para enviar datos al cliente.
            byte[] enviarDatos = new byte[1024];

            // Bucle infinito para mantener el servidor en ejecución.
            while (true) {
                // Crea un paquete de datagrama para recibir datos.
                DatagramPacket recibirPaquete = new DatagramPacket(recibirDatos, recibirDatos.length);
                // El servidor espera y recibe el paquete del cliente.
                socket.receive(recibirPaquete);

                // Extrae el mensaje del paquete recibido.
                String mensaje = new String(recibirPaquete.getData());
                // Imprime el número recibido del cliente.
                System.out.println("Número recibido desde el cliente: " + mensaje.trim());

                // Obtiene la dirección IP del cliente.
                InetAddress direccionCliente = recibirPaquete.getAddress();
                // Obtiene el puerto del cliente.
                int puertoCliente = recibirPaquete.getPort();

                // Convierte el mensaje recibido a entero y calcula su cuadrado.
                int numero = Integer.parseInt(mensaje.trim());
                int cuadrado = numero * numero;
                // Convierte el cuadrado a String y luego a bytes para enviar.
                String respuesta = String.valueOf(cuadrado);
                enviarDatos = respuesta.getBytes();

                // Crea un paquete de datagrama para enviar la respuesta.
                DatagramPacket enviarPaquete = new DatagramPacket(enviarDatos, enviarDatos.length, direccionCliente, puertoCliente);
                // Envía el paquete de respuesta al cliente.
                socket.send(enviarPaquete);
            }
        } catch (Exception e) {
            // Imprime la pila de la excepción si ocurre un error.
            e.printStackTrace();
        }
    }
}


import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class PokemonCliente {
    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        String Host = "localhost";
        int Puerto = 6000; // puerto remoto

        // Nos conectamos al servidor
        Socket cliente = new Socket(Host, Puerto);

        // En este caso, solo nos conectamos al servidor para recibir un Pokemon
        ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
        Pokemon dato = (Pokemon) entrada.readObject(); // recibo objeto
        System.out.println("Yo soy un: " + dato.toString());

        entrada.close(); // Cerramos el flujo de entrada
        cliente.close(); // Cerramos la conexión
    }
}

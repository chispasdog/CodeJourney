

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class PokemonServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Creo el socket de servidor
        int numeroPuerto = 6000; // Puerto
        ServerSocket servidor = new ServerSocket(numeroPuerto);

        // Espero a que se conecte el cliente
        System.out.println("Esperando al cliente...");
        Socket cliente = servidor.accept();

        // En este caso, inicialmente, solo envía al servidor
        ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());

        // Creo 3 Pokemon
        Pokemon pokemon1 = new Pokemon("Pikachu", "Eléctrico");
        Pokemon pokemon2 = new Pokemon("Meowth", "Agua");
        Pokemon pokemon3 = new Pokemon("Charizard", "Fuego");

        // De forma aleatoria, elijo el Pokemon que vamos a enviar
        Random rand = new Random();
        int numPokemon = rand.nextInt(3) + 1;
        switch (numPokemon) {
            case 1:
                outObjeto.writeObject(pokemon1);
                break;
            case 2:
                outObjeto.writeObject(pokemon2);
                break;
            case 3:
                outObjeto.writeObject(pokemon3);
                break;
        }
        // Cerrar streams y sockets
        outObjeto.close();
        cliente.close();
        servidor.close();
    }
}

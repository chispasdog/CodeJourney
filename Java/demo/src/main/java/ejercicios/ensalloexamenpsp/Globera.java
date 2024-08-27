package ejercicios.ensalloexamenpsp;

// 5. Clase Globera
public class Globera {
    public static void main(String[] args) {
        Globo[] globos = new Globo[5];
        for (int i = 0; i < globos.length; i++) {
            globos[i] = new Globo("Color" + (i + 1));
        }

        Inflador inflador = new Inflador();
        Pinchador pinchador = new Pinchador();
        BolsaDeGlobos bolsa = new BolsaDeGlobos(globos);

        bolsa.inflarGlobos(inflador);
        bolsa.mostrarEstadoGlobos();

        bolsa.pincharGlobos(pinchador);
        bolsa.mostrarEstadoGlobos();
    }
}
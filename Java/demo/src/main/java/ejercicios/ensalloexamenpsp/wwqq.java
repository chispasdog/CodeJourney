package ejercicios.ensalloexamenpsp;

// 4. Clase BolsaDeGlobos
class BolsaDeGlobos {
    Globo[] globos;

    public BolsaDeGlobos(Globo[] globos) {
        this.globos = globos;
    }

    public void inflarGlobos(Inflador inflador) {
        inflador.inflarGlobos(globos);
    }

    public void pincharGlobos(Pinchador pinchador) {
        pinchador.pincharGlobos(globos);
    }

    public void mostrarEstadoGlobos() {
        for (Globo globo : globos) {
            System.out.println(globo);
        }
    }
}
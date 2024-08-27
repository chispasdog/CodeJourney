package ejercicios.ensalloexamenpsp;

// 3. Clase Pinchador
class Pinchador {
    public void pincharGlobos(Globo[] globos) {
        for (Globo globo : globos) {
            globo.pinchar();
        }
    }
}
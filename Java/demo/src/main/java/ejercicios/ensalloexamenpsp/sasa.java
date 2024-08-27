package ejercicios.ensalloexamenpsp;

// 2. Clase Inflador
class Inflador {
    public void inflarGlobos(Globo[] globos) {
        for (Globo globo : globos) {
            globo.inflar();
        }
    }
}

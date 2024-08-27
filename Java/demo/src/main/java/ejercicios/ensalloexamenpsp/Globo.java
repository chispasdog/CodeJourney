package ejercicios.ensalloexamenpsp;

class Globo {
    String color;
    boolean pinchado;
    boolean inflado;

    public Globo(String color) {
        this.color = color;
        this.pinchado = false;
        this.inflado = false;
    }

    public void inflar() {
        if (!pinchado) {
            inflado = true;
        }
    }

    public void pinchar() {
        pinchado = true;
        inflado = false;
    }

    public String toString() {
        return "Globo{" + "color='" + color + '\'' + ", pinchado=" + pinchado + ", inflado=" + inflado + '}';
    }
}
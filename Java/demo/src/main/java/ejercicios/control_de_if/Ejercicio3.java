package ejercicios.control_de_if;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Queremos declarar una variable que represente una dirección (puede ser
        // Arriba, Abajo,
        // Derecha o Izquierda). Nuestro programa debe asignar a otra variable la
        // dirección opuesta a la
        // dirección declarada. Se puede imprimir por pantalla dicho valor opuesto o
        // almacenarlo en una
        // variable.

        String direccion = "Arriba";
        String opuesta;

        switch (direccion) {
            case "Arriba":
                opuesta = "Abajo";
                break;
            case "Abajo":
                opuesta = "Arriba";
                break;
            case "Derecha":
                opuesta = "Izquierda";
                break;
            case "Izquierda":
                opuesta = "Derecha";
                break;
            default:
                opuesta = "Dirección no válida";
        }

        System.out.println("La dirección opuesta a " + direccion + " es " + opuesta);
    }
}

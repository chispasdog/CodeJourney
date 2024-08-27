import java.io.Serializable;

public class Pokemon implements Serializable {
    private int id;
    private String nombre;
    private String tipo;
    private String nombreAtaque;
    private int fuerzaAtaque;
    private int hp;
    public Pokemon() {
        super();
    }
    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = 100;
    }
    // Aquí puedes agregar los métodos get y set para cada propiedad.
    // Por ejemplo:
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}

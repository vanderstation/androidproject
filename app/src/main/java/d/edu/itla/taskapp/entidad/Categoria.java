package d.edu.itla.taskapp.entidad;

import java.util.List;

public class Categoria {
    private Integer id;
    private String nombre;

    public Integer getId() {
        return id;
    }

    public Categoria() {
    }

    public Categoria setId(Integer id) {
        this.id = id;
        return this;
    }

    public Categoria(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public Categoria setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Categoria{");
        sb.append("id=").append(id);
        sb.append(", description='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
